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
public interface HabilidadesBaculo {
    
    public double hellfire(Enemigo aux , MainCharacter pj);// bola de fuego
    public double strom(Enemigo aux , MainCharacter pj);//ataque de rayo
    public double impactoLuz(Enemigo aux , MainCharacter pj); // ataque magico que no consume pm // equivale al ataque normal
    public double terremoto(Enemigo aux , MainCharacter pj); // ataque de tierra
    public double lluviaElemental(Enemigo aux , MainCharacter pj); // hyper habilidad 999
    public double lanzaRayo(Enemigo aux , MainCharacter pj); // ataque de rayo
    public double bloquesHelados(Enemigo aux, MainCharacter pj );
    
}
