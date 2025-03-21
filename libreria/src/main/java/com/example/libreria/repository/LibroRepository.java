package com.example.libreria.repository;

import java.util.Optional;

import com.example.libreria.model.Libro;

public interface LibroRepository {
	Optional<Libro> findById(Long id_libro);
	Libro save(Libro libro);
}
