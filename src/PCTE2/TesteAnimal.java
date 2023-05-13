/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCTE2;

import PCTE1.Animal;

/**
 *
 * @author 296775
 */
public class TesteAnimal {
    
    public static void main(String[] args) {
        Animal an = new Animal();
        an.entraDados();
        an.dono.entraDados();
        an.mostraDados();
        an.dono.mostraDados();
        
    }
    
}
