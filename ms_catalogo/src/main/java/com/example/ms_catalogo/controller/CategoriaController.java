<<<<<<< HEAD
package com.example.ms_catalogo.controller;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @RequestMapping
    public List<Categoria> listar() {
        return categoriaService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Categoria> buscar(@PathVariable Integer id) {
        return categoriaService.buscar(id);
    }

    @PostMapping
    public Categoria guardar(@RequestBody Categoria categoria) {
        System.out.println(categoria);
        return categoriaService.guardar(categoria);
    }

    @PutMapping("/{id}")
    public Categoria actualizar(@PathVariable Integer id, @RequestBody Categoria categoria) {
        return categoriaService.actualizar(id, categoria);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
    }
}
=======
package com.example.ms_catalogo.controller;

import com.example.ms_catalogo.entity.Categoria;
import com.example.ms_catalogo.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public ResponseEntity<List<Categoria>> list() {
        return ResponseEntity.ok().body(categoriaService.listar());
    }
    @PostMapping()
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.guardar(categoria));
    }
    @PutMapping()
    public ResponseEntity<Categoria> update(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaService.actualizar(categoria));
    }
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> listById(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(categoriaService.listarPorId(id).get());
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable(required = true) Integer id){
        categoriaService.eliminarPorId(id);
        return "Eliminacion Correcta";
    }
}
>>>>>>> bdeef91e8e6bc728435a7eee12b8f683c37c6c0a
