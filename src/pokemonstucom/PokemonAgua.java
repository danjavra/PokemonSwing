/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonstucom;

import static java.lang.Math.random;
import java.util.Random;


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

    @Override
    public boolean capturable() {
        int r = new Random().nextInt((120 - 20) + 1) + 20;
   
        return (r - getPs()) < getDefensa(); 
        
    }
    
    @Override
    public String efectivoContra() {
        return "fuego";
    }

    @Override
    public String debilContra() {
        return "planta";
    }
    
}
