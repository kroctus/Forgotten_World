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
public class Arma {
    
        private Double ataque;
        private String nombre;
        private Double velocidad;
        private boolean magica;

    public Arma(Double ataque, String nombre, Double velocidad, boolean magica) {
        this.ataque = ataque;
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.magica = magica;
    }

    public Arma() {
    }
    

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isMagica() {
        return magica;
    }

    public void setMagica(boolean magica) {
        this.magica = magica;
    }

    @Override
    public String toString() {
        return "Arma{" + "ataque=" + ataque + ", nombre=" + nombre + ", velocidad=" + velocidad + ", magica=" + magica + '}';
    }
        
      
        
    
}
