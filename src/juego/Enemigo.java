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
    /*Srive para controlar que el mensaje de destrucción de escudo no salga dos veces*/
    private int contador;

    /*1) fuego, 2) rayo , 3)hielo, 4) tierra*/
    public Enemigo(String nombre, String clase, Arma arma, Double vida, Double mp, int debilidad, int defensa) {
        super(nombre, clase, arma, vida, mp, defensa);
        this.debilidad = debilidad;

    }

    public int getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(int debilidad) {
        this.debilidad = debilidad;
    }

    public void quitarVida(double vidaMinus, Enemigo ene) {
        
        if (vidaMinus < ene.getDefensa()) {
            /*quitamos escudo*/
             JOptionPane.showMessageDialog(null, "Le has quitado" + vidaMinus + "puntos de escudo al enemigo!");
            ene.setDefensa((int) (ene.getDefensa()-vidaMinus));
        
        } if(ene.getDefensa() <=0 ) {
            JOptionPane.showMessageDialog(null, "Le has quitado" + vidaMinus + "puntos de vida al enemigo!");
            ene.setVida(ene.getVida() - vidaMinus);
        }
        
        
        if (vidaMinus > ene.getDefensa() && contador==0) {
           contador++;
           ene.setDefensa(0);
           JOptionPane.showMessageDialog(null, "HAS DESTRUIDO EL ESCUDO DEL ENEMIGO, A POR ÉL!!!!");

        }

    }

    public double atacar() {
        Random aleo = new Random();
        int numero = aleo.nextInt(2);

        switch (numero) {
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

    @Override
    public void subirDeNivel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
