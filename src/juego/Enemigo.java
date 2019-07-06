/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author kroctus
 */
public class Enemigo extends Personaje {

   private int debilidad;
       /*1) fuego, 2) rayo , 3)hielo, 4) tierra*/

    public Enemigo(String nombre, String clase, Arma arma, Double vida, Double mp, int debilidad) {
        super(nombre, clase, arma, vida, mp);
        this.debilidad=debilidad;
        
    }

    public int getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(int debilidad) {
        this.debilidad = debilidad;
    }
    
    public void quitarVida( double vidaMinus){
        JOptionPane.showMessageDialog(null, "Le has quitado" + vidaMinus + "puntos de vida al enemigo!");
        this.setVida(this.getVida()-vidaMinus);
    }
    
    public double atacar(){
        Random aleo = new Random();
        int numero = aleo.nextInt(2);
        
        switch(numero){
            case 0:
                JOptionPane.showMessageDialog(null, "El enemgigo no hace nada");
                return 0.00;
            case 1:
                JOptionPane.showMessageDialog(null, "EL enemigo usa lametazo");
                return 20.0;
            case 2:
                JOptionPane.showMessageDialog(null, "El enemigo usa embestida Oscura");
                return 50.0;
                
        }
        
        return 0.00;
    }
    
   
   
    
   
    
}
