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
public interface HabilidadesMartillo {

    public double slam(MainCharacter pj); //Golpe normal no consume mana

    public double bigSlam(MainCharacter pj); // doble golpe consume 25 de mana
    
    public double impactoMeteorico (MainCharacter pj); //habilidad que quita 150 de mana pero hace el daño equivalente a 3 golpes en un solo turno
    
    public double castigoDivino(MainCharacter pj); // hyper
    
    public double posturaDeValkiria(MainCharacter pj); // aumenta el ataque en un 10% 
    
    public void quebrantadorDeCorazones (Enemigo enemigo); /*No consume mana rompe la defensa del enemigo Ataque de destruye la defensa del enemigo, al igual como ella que no te ama 
                                                                                                                    y destruye tu corazón */
    
    
                                                                                                                    
                                                                                                                    

//    public double posturaDeValkiria(MainCharacter pj); //Te hace inume por dos turnos
    /*    public double azoteSilvary(MainCharacter pj); // rafaga de 4 flceachas
    public double tiro(MainCharacter pj); // ataque normal
    public double flechaExplosiva(MainCharacter pj); // ataque que causa un 50% más del ataque normal
    public double lluviaDeEstrellas(MainCharacter pj); // hyper
    public double flechaPerforante(MainCharacter pj); // ataque que ignora el blindaje
    public double estruendoDivino(MainCharacter pj); // ataque de area
     */
}
