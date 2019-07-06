/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import javax.swing.JOptionPane;

/**
 *
 * @author kroctus
 */
public class MainCharacter extends Personaje {
    
    public MainCharacter(String nombre, String clase, Arma arma, Double vida, Double mp) {
        super(nombre, clase, arma, vida, mp);
    }
    
    public void perderVida( double aux){
        JOptionPane.showMessageDialog(null, "el ataque te ha quitado " + aux + "puntos de vida");
        this.setVida(this.getVida()-aux);
    }
    
    
    
}
