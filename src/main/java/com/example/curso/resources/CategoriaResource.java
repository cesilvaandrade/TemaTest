package com.example.curso.resources;

import com.example.curso.domain.Categoria;
import com.example.curso.dto.CategoriaDTO;
import com.example.curso.services.CategoriaService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping(method = RequestMethod.GET , value = "/{id}")
    public ResponseEntity<Categoria> find(@PathVariable Integer id) {
        return ResponseEntity.ok().body(categoriaService.find(id));
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> insert(@Valid @RequestBody CategoriaDTO objDto){
        Categoria obj = categoriaService.fromDTO(objDto);
        obj = categoriaService.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @RequestMapping(method = RequestMethod.PUT , value = "/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody CategoriaDTO objDTO , @PathVariable Integer id){
        Categoria obj = categoriaService.fromDTO(objDTO);
        obj.setId(id);
        categoriaService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        categoriaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @RequestMapping(method = RequestMethod.GET )
    public ResponseEntity<List<CategoriaDTO>> findAll() {
        List<Categoria> list = categoriaService.findAll();
        List<CategoriaDTO> listDTO = list.stream().map(obj -> new CategoriaDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(listDTO);
    }

    @RequestMapping(method = RequestMethod.GET , value = "/page")
    public ResponseEntity<Page<CategoriaDTO>> findPage(
            @RequestParam(value = "page",defaultValue = "0") Integer page,
            @RequestParam(value = "linesPerPage",defaultValue = "24") Integer linesPerPage,
            @RequestParam(value = "orderBy",defaultValue = "nome") String orderBy,
            @RequestParam(value = "direction",defaultValue = "DESC") String direction
    ) {
        Page<Categoria> list = categoriaService.findPage(page,linesPerPage,orderBy,direction);
        Page<CategoriaDTO> listDTO = list.map(CategoriaDTO::new);
        return ResponseEntity.ok().body(listDTO);
    }


}
