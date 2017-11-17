/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonstucom;

/**
 *
 * @author DAM
 */
public class PokemonAgua extends Pokemon{
    
    private String tipoAgua;
    

    public PokemonAgua(String tipoAgua, String nombre, int ataque, int defensa, int ps) {
        super(nombre, ataque, defensa, ps);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }
    
    
    
}
