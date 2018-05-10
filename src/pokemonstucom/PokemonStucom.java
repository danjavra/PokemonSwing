/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonstucom;

import pokemonstucom.ListaPokemon;

/**
 *
 * @author DAM
 */
public class PokemonStucom {

    /**
     * @param args the command line arguments
     */

    public static ListaPokemon Pokemon;
    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon = new ListaPokemon();
        PokemonApp principal = new PokemonApp();
        principal.setLocationRelativeTo(null);
        principal.setVisible(true);
    }


  
    

    
}
