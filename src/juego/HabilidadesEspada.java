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
public interface HabilidadesEspada {
    
    public double corte(MainCharacter aux);//corte normal
    public double espadaArmagedon(MainCharacter aux);// Consume todo el mana y causa 999 de daño 
    public double corteDoble(MainCharacter aux);// dos aatques de espada normales
    public double rafaDeViento(MainCharacter aux);// un corte al aire 
    public double frenesi(MainCharacter aux);// una racha consecutiva de ataques (4) que hace daño aleatorio
    public void espadaLlameante(MainCharacter aux);// bufeea el arma
    public double tajoInvisible(MainCharacter aux);// quita poco pero nunca falla
    
    
}
