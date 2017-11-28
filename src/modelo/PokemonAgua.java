/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author DAM
 */
public class PokemonAgua extends Pokemon{

    private String efectivoContra = "Fuego";
    private String debilContra = "Planta";
    private boolean dulce;

    public PokemonAgua(boolean dulce, String nombre, int ataque, int defensa, int salud) {
        super(nombre, ataque, defensa, salud);
        this.dulce = dulce;
    }

 
    



    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.efectivoContra);
        hash = 59 * hash + Objects.hashCode(this.debilContra);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PokemonAgua other = (PokemonAgua) obj;
        return true;
    }

    
    @Override
    public boolean capturar() {
        int numObtenido = numAleatorio();
        if (numObtenido - getSalud() > getDefensa()) {
            return true;
        } else {

            return false;
        }
    }

    public static int numAleatorio() {
        Random r = new Random();
        return r.nextInt((120 - 20) + 1) + 20;
    }
}
