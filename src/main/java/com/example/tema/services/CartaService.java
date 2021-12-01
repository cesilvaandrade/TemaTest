package com.example.tema.services;

import com.example.tema.domain.Carta;
import com.example.tema.domain.enums.Classe;
import com.example.tema.domain.enums.Tipo;
import com.example.tema.dto.CartaDTO;
import com.example.tema.repositories.CartaRepository;
import com.example.tema.services.exceptions.DataIntegrityException;
import com.example.tema.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartaService {

    @Autowired
    private CartaRepository repo;

    public Carta find(Integer id) {
        Optional<Carta> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + " Tipo: " + Carta.class.getName()));
    }

    public List<Carta> findByName(String nome){
        return repo.findCartasByNomeContains(nome);
    }

    public List<Carta> findByClasse(Integer cod){
        return repo.findCartasByClasse(Classe.toEnum(cod));
    }

    public List<Carta> findByTipo(Integer cod){
        return repo.findCartasByTipo(Tipo.toEnum(cod));
    }


    public Carta insert(Carta obj){
        obj.setId(null);
        return repo.save(obj);
    }

    public Carta update(Carta obj){
        find(obj.getId());
        return repo.save(obj);
    }

    public void delete(Integer id){
        find(id);
        try{
            repo.deleteById(id);
        } catch (DataIntegrityViolationException e){
            throw new DataIntegrityException("Não é possível excluir uma carta que possui produtos");
        }
    }

    public List<Carta> findAll() {
        return repo.findAll();
    }


    public Carta fromDTO( CartaDTO cartaDTO){
        return new Carta(cartaDTO.getId(), cartaDTO.getNome() , cartaDTO.getAtaque(),
                cartaDTO.getDefesa() , cartaDTO.getClasse(),cartaDTO.getTipo(),cartaDTO.getDescricao());
    }

}

