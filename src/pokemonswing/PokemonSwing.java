package pokemonswing;

import Utilidades.Fichero;
import java.util.HashMap;
import modelo.Pokemon;

/**
 *
 * @author ironkk
 */
public class PokemonSwing {

    // declaramos un HashMap estático para poder acceder a el desde cualquier clase .java
    static HashMap<String, Pokemon> pokemonHash = new HashMap<>();
    // probando grabar en fichero 
    public static Fichero miFichero;

    public static void main(String[] args) {

        Principal ps = new Principal();
        // para centrarlo
        ps.setLocationRelativeTo(null);
        ps.setVisible(true);

    }

}
