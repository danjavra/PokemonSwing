/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonstucom;

//import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Julio
 */
public class ListaPokemon {

    HashMap<String, Pokemon> Pokemon = new HashMap<>();

    public ListaPokemon() {
        Pokemon = new HashMap<>();
    }

    public HashMap<String, Pokemon> getPokemon() {
        return Pokemon;
    }

    public void setPokemon(HashMap<String, Pokemon> Pokemon) {
        this.Pokemon = Pokemon;
    }

//    public ArrayList<String> pokemonNombre() {
//        ArrayList<String> pokeNombre = new ArrayList<>();
//        for (String nombre : Pokemon.keySet()) {
//            pokeNombre.add(nombre);
//        }
//        return pokeNombre;
//    }
//
//    public boolean existe(Pokemon p) {
//        return Pokemon.containsKey(p.getNombre());
//    }
//
//    public void alta(Pokemon p) {
//        Pokemon.put(p.getNombre(), p);
//    }
//
//    public Pokemon buscarPokemon(String nombre) {
//        return Pokemon.get(nombre);
//    }
//
//    public ArrayList<Pokemon> bucarporTipo(String tipo) {
//        ArrayList<Pokemon> todosTipo = new ArrayList<>();
//        for (Pokemon p : Pokemon.values()) {
//            if (tipo.equals(p.getClass().getSimpleName())) {
//                todosTipo.add(p);
//            }
//        }
//        System.out.println(Pokemon);
//        System.out.println(todosTipo);
//        return todosTipo;
//    }
//
//    public ArrayList<Pokemon> buscarTodos() {
//        ArrayList<Pokemon> todos = new ArrayList<>();
//        for (Pokemon p : Pokemon.values()) {
//            todos.add(p);
//        }
//        return todos;
//    }

    @Override
    public String toString() {
        return "ListaPokemon{" + "Pokemon=" + Pokemon + '}';
    }
}
