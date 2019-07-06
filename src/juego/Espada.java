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
public class Espada extends Arma implements HabilidadesEspada {
    
    public Espada(Double ataque, String nombre, Double velocidad, boolean magica) {
        super(ataque, nombre, velocidad, magica);
    }

    @Override
    public double corte(MainCharacter aux) {
     return aux.getArma().getAtaque();
    }

    @Override
    public double espadaArmagedon(MainCharacter aux) {
      aux.setMp(0.0);
      return 999.0;
    }

    @Override
    public double corteDoble(MainCharacter aux) {
       aux.setMp(aux.getMp()-20);
       return aux.getArma().getAtaque()*2;
    }

    @Override
    public double rafaDeViento(MainCharacter aux) {
        aux.setMp(aux.getMp()-10);
        return aux.getArma().getAtaque() +10;
    }

    @Override
    public double frenesi(MainCharacter aux) {
       aux.setMp(aux.getMp()-100);
       return aux.getArma().getAtaque()*4;
    }

    @Override
    public void espadaLlameante(MainCharacter aux) {
        aux.setMp(aux.getMp()-50);
      aux.getArma().setAtaque(aux.getArma().getAtaque()*2);
    }

    @Override
    public double tajoInvisible(MainCharacter aux) {
        aux.setMp(aux.getMp()-10);
        return 10;
    }

  
   
    
}
