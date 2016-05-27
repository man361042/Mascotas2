package com.example.manuel.mascotas;

/**
 * Created by manuel on 22/05/16.
 */
public class Mascota {
    private int foto;
    private String nombre;
    //private String numeroLike;
  private int numeroLike;

    public Mascota(int foto, String nombre, int numeroLike){
        this.foto = foto;
        this.nombre = nombre;
        this.numeroLike = numeroLike;

    }

    public int getNumeroLike() {
        return numeroLike;
    }

    public void setNumeroLike(int numeroLike) {
        this.numeroLike = numeroLike;
    }

    public int getFoto() { return foto;}

    public void setFoto(int foto) { this.foto = foto;}

    public String getNombre() { return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    //public String getNumeroLike() { return numeroLike;}

    //public void setNumeroLike(String numeroLike) {this.numeroLike = numeroLike;}



}
