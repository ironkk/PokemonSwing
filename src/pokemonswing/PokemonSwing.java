/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonswing;

import java.util.HashMap;
import modelo.Pokemon;
import modelo.PokemonAgua;
import modelo.PokemonFuego;
import modelo.PokemonPlanta;

/**
 *
 * @author DAM
 */
public class PokemonSwing {

  static HashMap<String, Pokemon> pokemonHash = new HashMap<>();
    public static void main(String[] args) {
        Principal ps = new Principal();
        ps.setLocationRelativeTo(null);
        ps.setVisible(true);

    }

}
