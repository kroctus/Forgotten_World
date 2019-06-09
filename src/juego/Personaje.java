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
    
    //Atributos
    private String nombre;
    private int HP;
    private int MP;
    private int nivel;
    
    //Constructor por defecto

    public Personaje() {
    }
    
    //Constructor parametrizado

    public Personaje(String nombre, int HP, int MP, int nivel) {
        this.nombre = nombre;
        this.HP = HP;
        this.MP = MP;
        this.nivel = nivel;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    //ToString

    @Override
    public String toString() {
        return "nombre:" + nombre + ", HP:" + HP + ", MP:" + MP + ", nivel:" + nivel;
    }
    
    
    
}
