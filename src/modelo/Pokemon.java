package modelo;

import java.util.Objects;

/**
 *
 * @author DAM
 */
public class Pokemon {

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
    
}
