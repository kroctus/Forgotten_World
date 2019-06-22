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
public class Arco extends Arma implements HabilidadesArco {

    public Arco(Double ataque, String nombre, Double velocidad, boolean magica) {
        super(ataque, nombre, velocidad, magica);
    }

    @Override
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
    }

}
