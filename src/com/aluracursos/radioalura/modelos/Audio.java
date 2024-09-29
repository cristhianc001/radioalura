package com.aluracursos.radioalura.modelos;

public class Audio {
    private String titulo;
    private int totalReproducciones;
    private int totalMeGusta;
    private int clasificacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getTotalMeGusta() {
        return totalMeGusta;
    }

    public void setTotalMeGusta(int totalMeGusta) {
        this.totalMeGusta = totalMeGusta;
    }

    public int getTotalReproducciones() {
        return totalReproducciones;
    }

    public void setTotalReproducciones(int totalReproducciones) {
        this.totalReproducciones = totalReproducciones;
    }

    public void meGusta(){
        this.totalMeGusta++; // cada vez que se llame a este metodo, aumenta
    }

    public void reproduce(){
        this.totalReproducciones++;
    }
}
