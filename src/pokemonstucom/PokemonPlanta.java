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
public class PokemonPlanta extends Pokemon{
    
  private String habitat;

    public PokemonPlanta(String habitat, String nombre, int ataque, int defensa, int ps) {
        super(nombre, ataque, defensa, ps);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "PokemonPlanta{" + "habitat=" + habitat + '}';
    }

    @Override
    public boolean capturable() {
       
        return ((Math.random()*50) - getAtaque()) > getPs(); 
        
    
    }

   
    
   
    
}
