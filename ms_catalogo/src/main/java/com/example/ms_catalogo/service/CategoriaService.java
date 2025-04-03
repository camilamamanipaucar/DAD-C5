<<<<<<< HEAD
package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    List<Categoria> listar();

    Optional<Categoria> buscar(Integer id);

    Categoria guardar(Categoria categoria);

    Categoria actualizar(Integer id, Categoria categoria);

    void eliminar(Integer id);
}
=======
package com.example.ms_catalogo.service;

import com.example.ms_catalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface CategoriaService {
    public List<Categoria> listar();

    public Categoria guardar(Categoria categoria);

    public Categoria actualizar(Categoria categoria);

    public Optional<Categoria> listarPorId(Integer id);

    public void eliminarPorId(Integer id);
}
>>>>>>> bdeef91e8e6bc728435a7eee12b8f683c37c6c0a
