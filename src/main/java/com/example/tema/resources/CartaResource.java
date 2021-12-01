package com.example.tema.resources;

import com.example.tema.domain.Carta;
import com.example.tema.dto.CartaDTO;
import com.example.tema.services.CartaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/carta")
public class CartaResource {

    @Autowired
    private CartaService cartaService;

    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public ResponseEntity<Carta> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(cartaService.find(id));
    }

    @RequestMapping(method = RequestMethod.GET , value = "/nome/{nome}")
    public ResponseEntity<List<Carta>> findByName(@PathVariable String nome) {
        return ResponseEntity.ok().body(cartaService.findByName(nome));
    }

    @RequestMapping(method = RequestMethod.GET , value = "/classe/{cod}")
    public ResponseEntity<List<Carta>> findByClasse(@PathVariable Integer cod) {
        return ResponseEntity.ok().body(cartaService.findByClasse(cod));
    }

    @RequestMapping(method = RequestMethod.GET , value = "/tipo/{cod}")
    public ResponseEntity<List<Carta>> findByTipo(@PathVariable Integer cod) {
        return ResponseEntity.ok().body(cartaService.findByTipo(cod));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody CartaDTO objDto){
        Carta obj = cartaService.fromDTO(objDto);
        obj = cartaService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody CartaDTO objDTO , @PathVariable Integer id){
        Carta obj = cartaService.fromDTO(objDTO);
        obj.setId(id);
        cartaService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        cartaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET )
    public ResponseEntity<List<CartaDTO>> findAll() {
        List<Carta> list = cartaService.findAll();
        List<CartaDTO> listDTO = list.stream().map(obj -> new CartaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }



}
