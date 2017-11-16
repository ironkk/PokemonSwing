/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonswing;

import java.util.HashMap;
import modelo.Pokemon;

/**
 *
 * @author DAM
 */
public class PokemonSwingHashMap {

    private HashMap<String, Pokemon> pokemonMap;

    public PokemonSwingHashMap(HashMap<String, Pokemon> pokemonMap) {
        this.pokemonMap = pokemonMap;
    }

    public PokemonSwingHashMap() {
        pokemonMap = new HashMap<String, Pokemon>();
    }

    /*
1- Dar de alta un nuevo Pokemon. Se deberá verificar la validez de los
datos introducidos. Deberá mostrar mensaje de error si ya existe un
Pokemon con el nombre indicado.
     */
    public void altaPokemon(Pokemon pokemon) {

        if (!pokemonMap.containsKey((pokemon.getNombre()))) {
            pokemonMap.put(pokemon.getNombre(), pokemon);
        } else {
            System.out.println("Error! Ya existe un Pokemon con el nombre indicado");
        }
    }

}

/* 2- Modificar ataque, defensa y puntos de salud de un Pokemon . La
aplicación deberá poder permitir escoger un Pokemon de forma cómoda
para el usuario, v er sus datos actuales y modificarlos. Se deberá v erificar
la v alidez de los datos introducidos. Sólo se debe permitir modificar
ataque, defensa y puntos de salud.
 */
 /*
3- Ver Pokemon. Esta funcionalidad permitirá filtrar por tipo de Pokemon. Si
el usuario no selecciona ningún tipo deberán mostrarse todos los
Pokemon que haya registrados. Se deben mostrar de forma individual con
cada atributo en cajas de texto. Debajo de las cajas de texto habrá un
botón Siguiente que mostrará los datos del siguiente Pokemon. También
habrá un botón Anterior que mostrará los datos del Pokemon anterior. Se
deberán deshabilitar estos botones cuando no haya más Pokemon que v er
(por delante o por detrás). No se deberá permitir la modificación de los
datos en este apartado. Deberá mostrarse el tipo del Pokemon.
 */
 /*
4- Capturar Pokemon. El usuario deberá poder escoger entre los Pokemon
que haya registrados en la aplicación para intentar capturarlo. Una v ez
seleccionado se hará la captura. La aplicación deberá mostrar los datos
de la captura (nº aleatorio, etc) e indicar si se ha podido capturar o no.
 */
 /*
  5- Totales. Deberá mostrar una v entana con el nº total de Pokemon
registrador y el total de cada tipo.
 */

