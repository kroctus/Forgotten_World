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

    public MainCharacter(String nombre, String clase, Arma arma, Double vida, Double mp, int defensa) {
        super(nombre, clase, arma, vida, mp, defensa);
    }

    public void perderVida(double aux, MainCharacter a) {

        if (a.getDefensa() <= 0) {
            JOptionPane.showMessageDialog(null, "el ataque te ha quitado " + aux + "puntos de vida");
            this.setVida(this.getVida() - aux);
        }else {
            JOptionPane.showMessageDialog(null, "El ataque te ha quitado" + aux+ "Puntos de escudo");
            a.setDefensa((int) (a.getDefensa()-aux));
        }

    }

    //Método para simular la subida de nivel aumentando los atributos del personajes
    @Override
    public void subirDeNivel() {
        super.getArma().setAtaque(super.getArma().getAtaque() + 50);
        super.setDefensa((int) (super.getDefensa() + 50));
        super.setMp(super.getMp() + 50);
        super.setVida(super.getVida() + 75);
    }

}
