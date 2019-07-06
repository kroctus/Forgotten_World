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
public class Jefe extends Enemigo  {
    
    private final double VALORBLINDAJE;

    public Jefe(String nombre, String clase, Arma arma, Double vida, Double mp, int debilidad, double blindaje) {
        super(nombre, clase, arma, vida, mp, debilidad);
        this.VALORBLINDAJE=blindaje;

    }

   
}
