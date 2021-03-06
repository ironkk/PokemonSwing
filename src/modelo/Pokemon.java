package modelo;

import java.util.Objects;

/**
 *
 * @author ironkk
 */
//La clase Pokemon es una clase abstracta ya que no se podran instanciar objetos de esta.
//También implementa una interfaz Capturable para que puedan heredarla los tipos de pokemon y reutilizarla.
public abstract class Pokemon implements Capturable {

    private String nombre;
    private int ataque;
    private int defensa;
    private int salud;

    public Pokemon(String nombre, int ataque, int defensa, int salud) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.salud = salud;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getSalud() {
        return salud;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    @Override
    public String toString() {
        return "Pokemon{"
                + "nombre='" + nombre + '\''
                + ", ataque=" + ataque
                + ", defensa=" + defensa
                + ", salud=" + salud
                + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + this.ataque;
        hash = 67 * hash + this.defensa;
        hash = 67 * hash + this.salud;
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
        final Pokemon other = (Pokemon) obj;
        return true;
    }

    /*
     public int pPlanta() {
        int numPlanta = 0;
        for (Pokemon p : pokemonHash.values()) {
            if (p.getClass().getSimpleName().equalsIgnoreCase("planta")) {
                numPlanta++;
            }
        }
        return numPlanta;
    }

    public int pAgua() {
        int numAgua = 0;
        for (Pokemon p : pokemonHash.values()) {
            if (p.getClass().getSimpleName().equalsIgnoreCase("agua")) {
                numAgua++;
            }
        }
        return numAgua;
    }

    public int pFuego() {
        int numFuego = 0;
        for (Pokemon p : pokemonHash.values()) {
            if (p.getClass().getSimpleName().equalsIgnoreCase("fuego")) {
                numFuego++;
            }
        }
        return numFuego;
    }
     */
}
