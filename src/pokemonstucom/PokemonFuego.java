/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonstucom;

import java.util.Random;

/**
 *
 * @author DAM
 */
public class PokemonFuego extends Pokemon {

    public PokemonFuego(String nombre, int ataque, int defensa, int ps) {
        super(nombre, ataque, defensa, ps);
    }

    @Override
    public boolean capturable() {
  
      int r = new Random().nextInt((10 - 60) + 1) + 10;
        
        
        return (r + getPs()) > (getAtaque() + getDefensa());  
        
    }
    

      
}
