package com.example.deporte.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.libreria.model.Libro;
import com.example.libreria.repository.LibroRepository;
import com.example.libreria.service.LibroService;


public class LibroServiceTest {
	@Mock
    private LibroRepository libroRepository;

    @InjectMocks
    private LibroService libroService;

    private Libro libro;

    @BeforeEach
    void setUp() {
    	libro = new Libro(1L, "paco yunque", "César Vallejo", "Peru");
    }

    @Test
    void testObtenerLibroPorId() {
        when(libroRepository.findById(1L)).thenReturn(Optional.of(libro));

        // WHEN: Llamamos al servicio
        Libro resultado = libroService.obtenerLibroPorId(1L);

        assertNotNull(resultado);
        assertEquals("paco yunque", resultado.getTitulo());
        assertEquals("César Vallejo", resultado.getTitulo());
        assertEquals("Peru", resultado.getPais());

        verify(libroRepository, times(1)).findById(1L);
    }

    @Test
    void testRegistrarLibro() {
        when(libroRepository.save(libro)).thenReturn(libro);

        Libro resultado = libroService.registrarUsuario(libro);

        assertNotNull(resultado);
        assertEquals("paco yunque", resultado.getTitulo());
        assertEquals("César Vallejo", resultado.getAutor());
        assertEquals("Peru", resultado.getPais());

        verify(libroRepository, times(1)).save(libro);
    }
}
