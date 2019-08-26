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
public class Golem extends Enemigo {

    public Golem(String nombre, String clase, Arma arma, Double vida, Double mp, int debilidad, int defensa) {
        super(nombre, clase, arma, vida, mp, debilidad, defensa);
    }

    /*REGENERA EL ESCUDO 50*/
    public static void pielDeRoca(Golem golem) {
        JOptionPane.showMessageDialog(null, "GOL´EM USA PIEL DE ROCA");
        JOptionPane.showMessageDialog(null, "EL ESCUDO DE GOL´EM SE REGENERA");
        
       
        golem.setDefensa(500);   
    }

    /*Ataque normal*/
    public static double golpeRoca() {
        JOptionPane.showMessageDialog(null, "GOL´EM USA GOLPE ROCA");
        return 50;
    }

    /**/
    public static void perderElTiempo() {

        JOptionPane.showMessageDialog(null, "GOL´EM UTILIZA PERDER EL TIEMPO");
        Random aleo = new Random();
        int numero = aleo.nextInt(9);

        switch (numero) {
            case 0:
                JOptionPane.showMessageDialog(null, "GOL´EM SE QUEDA MIRANDO EL HORIZONTE");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "GOL´EM SE MIRA SU BRAZO IZQUIERDO");
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "GOL´EM SE QUEDA MIRANDO SU BRAZO DERECHO");
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "GOL´EM TE MIRA FIJAMENTE");
                break;

            case 4:
                JOptionPane.showMessageDialog(null, "GOL´EM PIENSA EN EL SIGNIFICADO DE LA VIDA");
                break;

            case 5:
                JOptionPane.showMessageDialog(null, "GOL´EM PIENSA EN SU PROPIA EXISTENCIA");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "GOL´EM SE DUERME");
                break;

            case 7:
                JOptionPane.showMessageDialog(null, "GOL´EM PARPADEA");
                break;

            case 8:
                JOptionPane.showMessageDialog(null, "GOL´EM  DICE QUE NO ES UN GOLEM");
                break;

            case 9:
                JOptionPane.showMessageDialog(null, "GOL´EM SE DUERME");
                break;

        }
    }

}
