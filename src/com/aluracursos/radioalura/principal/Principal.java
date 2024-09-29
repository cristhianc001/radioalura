package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.modelos.Cancion;
import com.aluracursos.radioalura.modelos.MisFavoritos;
import com.aluracursos.radioalura.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.tech");

        for (int i = 0; i < 100; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 9000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total rep.: " + miCancion.getTotalReproducciones());
        System.out.println("Total likes: " + miCancion.getTotalMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicion(miPodcast);
        favoritos.adicion(miCancion);

    }
}
