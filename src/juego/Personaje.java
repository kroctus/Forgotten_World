/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author kroctus
 */
public class Personaje {
    
    private String nombre;
    private String clase;
    private Arma arma;
    private Double vida;
    private Double mp;

    public Personaje(String nombre, String clase, Arma arma, Double vida, Double mp) {
        this.nombre = nombre;
        this.clase = clase;
        this.arma = arma;
        this.vida = vida;
        this.mp = mp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getMp() {
        return mp;
    }

    public void setMp(Double mp) {
        this.mp = mp;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", clase=" + clase + ", arma=" + arma + ", vida=" + vida + ", mp=" + mp + '}';
    }

   
}
