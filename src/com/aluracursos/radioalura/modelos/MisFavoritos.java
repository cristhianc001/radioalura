package com.aluracursos.radioalura.modelos;

public class MisFavoritos {
    public void adicion(Audio audio){
        if (audio.getClasificacion() >=8){
            System.out.println(audio.getTitulo() + " es uno de los favoritos");
        } else {
            System.out.println(audio.getTitulo() + " es recomendado");
        }
    }
}
