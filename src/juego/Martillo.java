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
public class Martillo extends Arma implements HabilidadesMartillo {

    public Martillo(Double ataque, String nombre, Double velocidad, boolean magica) {
        super(ataque, nombre, velocidad, magica);
    }

    @Override
    /*Devuelve el valor del ataque del arma*/
    public double slam(MainCharacter pj) {
        return pj.getArma().getAtaque();
    }

    @Override
    /*Devuelve el doble del daño del arma a cambio de 25 de mana*/
    public double bigSlam(MainCharacter pj) {

        if (pj.getMp() >= 25) {
            pj.setMp(pj.getMp() - 25);
            return pj.getArma().getAtaque() * 2;
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente mana para realizar este hechizo");
        }
        return 0.0;

    }

    @Override
    /*Ataque que quivale a 3 ataques normales en un mismo turno, consume 50 de mana */
    public double impactoMeteorico(MainCharacter pj) {
        if (pj.getMp() >= 50) {
            pj.setMp(pj.getMp() - 50);
            return pj.getArma().getAtaque() * 3;
        } else {

            JOptionPane.showMessageDialog(null, "No tienes suficiente mana para realizar este hechizo");
            return 0.00;
        }

    }

    @Override
    public double castigoDivino(MainCharacter pj) {

        pj.setMp(0.00);
        return 999;
    }

    @Override
    /*Aumenta el daño del personaje de forma indefinida*/
    public double posturaDeValkiria(MainCharacter pj) {

        if (pj.getMp() >= 150) {
            pj.setMp(pj.getMp() - 150);
            pj.getArma().setAtaque(pj.getArma().getAtaque() + 100);
        } else {
            JOptionPane.showMessageDialog(null, "No tienes suficiente mana para realizar este hechizo");
            return 0.00;
        }
        return 0.01;
    }

    @Override
    public void quebrantadorDeCorazones(Enemigo enemigo) {

        enemigo.setDefensa(0);
    }

    /* @Override
    public double azoteSilvary(MainCharacter pj) {
        pj.setMp(pj.getMp() - 40);
        return pj.getArma().getAtaque() * 4;
    }

    @Override
    public double tiro(MainCharacter pj) {
        return 20;
    }

    @Override
    public double flechaExplosiva(MainCharacter pj) {
        pj.setMp(pj.getMp() - 50);
        return (pj.getArma().getAtaque() + pj.getArma().getAtaque() * 0.50);
    }

    @Override
    public double lluviaDeEstrellas(MainCharacter pj) {
        pj.setMp(0.00);
        return 999.0;
    }

    @Override
    public double flechaPerforante(MainCharacter pj) {
        return 90;
    }

    @Override
    public double estruendoDivino(MainCharacter pj) {
        pj.setMp(pj.getMp() - 50);
        return 70;
    }*/
}
