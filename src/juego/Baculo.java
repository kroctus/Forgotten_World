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
public class Baculo extends Arma implements HabilidadesBaculo{
    
    private int tipo; 
    private final int consumoSkill=50;
    /*1) fuego, 2) rayo , 3)hielo, 4) tierra*/
    /*hielo(3) debil fuego (1)
      fuego(1) debil hielo(3)
      rayo(2) debil hielo(3)
      tirra(4) debil rayo(2)*/

    public Baculo(Double ataque, String nombre, Double velocidad, boolean magica) {
        super(ataque, nombre, velocidad, magica);
    }

    
    @Override
    public double hellfire(Enemigo aux , MainCharacter pj) {
        
        pj.setMp(pj.getMp()-consumoSkill);
     
        if (aux.getDebilidad() == 1) {
            return 100;
        } else if (aux.getDebilidad() != 1) {
            return 60;
        }
        return 1;
        
    }

    @Override
    public double strom(Enemigo aux , MainCharacter pj) {
        
         pj.setMp(pj.getMp()-consumoSkill);
         if (aux.getDebilidad() == 2) {
            return 100;
        } else if (aux.getDebilidad() != 2) {
            return 60;
        }
        return 1;
    }

    @Override
    public double impactoLuz(Enemigo aux , MainCharacter pj) {
      return 20;
    }

    @Override
    public double terremoto(Enemigo aux , MainCharacter pj) {
         pj.setMp(pj.getMp()-consumoSkill);
       if (aux.getDebilidad() == 4) {
            return 100;
        } else if (aux.getDebilidad() != 4) {
            return 60;
        }
        return 1;
    }

    @Override
    public double lluviaElemental(Enemigo aux , MainCharacter pj) {
         pj.setMp(0.00);
        return 999;
    }

    @Override
    public double lanzaRayo(Enemigo aux , MainCharacter pj) {
         pj.setMp(pj.getMp()-consumoSkill);
         if (aux.getDebilidad() == 2) {
            return 100;
        } else if (aux.getDebilidad() !=2) {
            return 60;
        }
        return 1;
    }

    @Override
    public double bloquesHelados(Enemigo aux, MainCharacter pj) {
         pj.setMp(pj.getMp()-consumoSkill);
         if (aux.getDebilidad() == 3) {
            return 100;
        } else if (aux.getDebilidad() !=3) {
            return 60;
        }
        return 1;
       
    }

    
    
    
    
}
