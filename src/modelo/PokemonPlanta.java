package modelo;

/**
 *
 * @author ironkk
 */
import java.util.Objects;
import java.util.Random;

public class PokemonPlanta extends Pokemon {

    private String efectivoContra = "Agua";
    private String debilContra = "Fuego";

    public PokemonPlanta(String nombre, int ataque, int defensa, int salud) {
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
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.efectivoContra);
        hash = 79 * hash + Objects.hashCode(this.debilContra);
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
        final PokemonPlanta other = (PokemonPlanta) obj;
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

    public String getEfectivoContra() {
        return efectivoContra;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public static int numAleatorio() {
        Random r = new Random();
        return r.nextInt((120 - 20) + 1) + 20;
    }
}
