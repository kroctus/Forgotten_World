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
public interface HabilidadesArco {
    
    public double azoteSilvary(MainCharacter pj); // rafaga de 4 flceachas
    public double tiro(MainCharacter pj); // ataque normal
    public double flechaExplosiva(MainCharacter pj); // ataque que causa un 50% más del ataque normal
    public double lluviaDeEstrellas(MainCharacter pj); // hyper
    public double flechaPerforante(MainCharacter pj); // ataque que ignora el blindaje
    public double estruendoDivino(MainCharacter pj); // ataque de area
        
    
}
