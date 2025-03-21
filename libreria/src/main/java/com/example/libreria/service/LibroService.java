package com.example.libreria.service;


import org.springframework.stereotype.Service;

import com.example.libreria.model.Libro;
import com.example.libreria.repository.LibroRepository;

@Service
public class LibroService {
	
	private final LibroRepository libroRepository;

	public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public Libro obtenerLibroPorId(Long id_libro) {
        return libroRepository.findById(id_libro).orElse(null);
    }

    public Libro registrarUsuario(Libro libro) {
        return libroRepository.save(libro);
    }
	
	
}
