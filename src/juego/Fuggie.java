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
public class Fuggie extends Enemigo {

    public Fuggie(String nombre, String clase, Arma arma, Double vida, Double mp, int debilidad, int defensa) {
        super(nombre, clase, arma, vida, mp, debilidad, defensa);
    }

    public double ataqueFuggie() {
        return 5.0;
    }

}
