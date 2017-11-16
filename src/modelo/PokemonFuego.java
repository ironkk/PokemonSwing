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
public class PokemonFuego extends Pokemon implements Capturable {

    private String efectivoContra = "Planta";
    private String debilContra = "Agua";

    public PokemonFuego(String nombre, int ataque, int defensa, int salud) {
        super(nombre, ataque, defensa, salud);
    }

    @Override
    public String toString() {
        return "Pokemon{"
                + "nombre='" + getNombre() + '\''
                + ", ataque=" + getAtaque()
                + ", defensa=" + getDefensa()
                + ", salud=" + getSalud()
                + ", efectivoContra='" + efectivoContra + '\''
                + ", debilContra='" + debilContra + '\''
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.efectivoContra);
        hash = 73 * hash + Objects.hashCode(this.debilContra);
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
        final PokemonFuego other = (PokemonFuego) obj;
        return true;
    }

    
    @Override
    public boolean capturar() {
        int numObtenido = numAleatorio();
        if (numObtenido - getSalud() > getDefensa()) {
            System.out.println(getNombre() + " CAPTURADO!");
            System.out.println("------------------");
            return true;
        } else {
            System.out.println(getNombre() + "NO CAPTURADO...");
            System.out.println("------------------");
            System.out.println("Número obtenido: " + numObtenido);
            return false;
        }
    }

    public static int numAleatorio() {
        Random r = new Random();
        return r.nextInt((120 - 20) + 1) + 20;
    }
}
