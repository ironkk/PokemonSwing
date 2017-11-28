package pokemonswing;
import java.util.Iterator;
import modelo.Pokemon;
import modelo.PokemonAgua;
import modelo.PokemonFuego;
import modelo.PokemonPlanta;
import static pokemonswing.PokemonSwing.pokemonHash;

/**
 *
 * @author ironkk
 */
public class Totales extends javax.swing.JDialog {
    public Totales(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Creamos y inicializamos variables a 0 para cada contar cada tipo de pokemon
        int plnt = 0;
        int agu = 0;
        int fueg = 0;
        
        //Recorremos la lista de pokemons con el iterador gracias a que es una lista HashMap
        Iterator it = pokemonHash.keySet().iterator();
        while (it.hasNext()) {
            String nom = (String) it.next();
            Pokemon p = pokemonHash.get(nom);

            // para cada pokemon de tipo agua que ha sido instanciado(creado) aumentamos la variable
            if (p instanceof PokemonAgua) {

                agu++;

            }

              // para cada pokemon de tipo planta que ha sido instanciado(creado) aumentamos la variable
            if (p instanceof PokemonPlanta) {
                plnt++;
            }
  // para cada pokemon de tipo fuego que ha sido instanciado(creado) aumentamos la variable
            if (p instanceof PokemonFuego) {
                fueg++;
            }

        }
        
        //el total de pokemons que hay
        int total = plnt + agu + fueg;

        
        //finalmente añadimos al TextField mediante setText la variable.
        fuego.setText("" + fueg);
        agua.setText("" + agu);
        planta.setText("" + plnt);
        jTextField1.setText("" + total);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        planta = new javax.swing.JTextField();
        fuego = new javax.swing.JTextField();
        agua = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("TOTAL");

        jLabel2.setText("TOTAL FUEGO");

        jLabel3.setText("TOTAL AGUA");

        jLabel4.setText("TOTAL PLANTA");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jLabel5.setText("TOTALES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agua)
                    .addComponent(fuego)
                    .addComponent(planta)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(planta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuego, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agua;
    private javax.swing.JTextField fuego;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField planta;
    // End of variables declaration//GEN-END:variables
}
