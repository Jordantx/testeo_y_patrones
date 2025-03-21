package com.example.libreria.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private Long id_libro;
    private String titulo;	
    private String autor;
    private String pais; 
    
}
