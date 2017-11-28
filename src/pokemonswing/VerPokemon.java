/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonswing;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import modelo.Pokemon;
import modelo.PokemonAgua;
import modelo.PokemonFuego;
import modelo.PokemonPlanta;
import static pokemonswing.PokemonSwing.pokemonHash;

/**
 *
 * @author DAM
 */
public class VerPokemon extends javax.swing.JDialog {

    //declaracion de una variable global para poder acceder a ella desde cualquier método privado
    int posicion = 0;

    //declaracion de una colección en este caso (ArrayList) privada para poder trabajar con todos los pokemons. 
    private ArrayList<Pokemon> pokemonList = new ArrayList<>();

    public VerPokemon(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        //método que declara/instancia por defecto todos los controles de Swing que hemos creado
        initComponents();
        //llamada al método que deshabilita los botones de anterior y siguiente al iniciar la ventana Ver Pokemons
        disableButtons();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        ataque = new javax.swing.JTextField();
        salud = new javax.swing.JTextField();
        defensa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        tipo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Puntos de Salud:");

        jLabel3.setText("Ataque:");

        jLabel4.setText("Defensa:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel5.setText("VER POKEMON");

        jButton1.setText("SIGUIENTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("ANTERIOR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Agua", "Fuego", "Planta" }));
        tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoActionPerformed(evt);
            }
        });

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Elige tipo de pokemon:");

        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(ataque, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(defensa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ataque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(defensa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton2.setEnabled(true);
        posicion++;
        if (posicion < pokemonList.size()) {
            Pokemon p = pokemonList.get(posicion);
            nombre.setText(p.getNombre());
            ataque.setText(Integer.toString(p.getAtaque()));
            defensa.setText(Integer.toString(p.getDefensa()));
            salud.setText(Integer.toString(p.getSalud()));

        } else {
            jButton1.setEnabled(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton1.setEnabled(true);
        posicion--;
        if (posicion >= 0) {
            Pokemon p = pokemonList.get(posicion);
            nombre.setText(p.getNombre());
            ataque.setText(Integer.toString(p.getAtaque()));
            defensa.setText(Integer.toString(p.getDefensa()));
            salud.setText(Integer.toString(p.getSalud()));

        } else {
            jButton2.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        vaciar();
        //llamada al método que activa los botones
        enableButtons();
        //
        String tipos = (String) tipo.getSelectedItem();
        //
        Iterator it = pokemonHash.keySet().iterator();
        /*
        
         */
        while (it.hasNext()) {
            String nombre = (String) it.next();
            Pokemon p = pokemonHash.get(nombre);

            if (tipos.equalsIgnoreCase("todos")) {
                pokemonList.add(p);
            } else if (tipos.equalsIgnoreCase("fuego")) {
                if (p instanceof PokemonFuego) {

                    pokemonList.add(p);

                }
            } else if (tipos.equalsIgnoreCase("agua")) {
                if (p instanceof PokemonAgua) {
                    pokemonList.add(p);
                }

            } else if (tipos.equalsIgnoreCase("planta")) {
                if (p instanceof PokemonPlanta) {
                    pokemonList.add(p);
                }
            }

        }
        if (pokemonList.size() != 0) {
            Pokemon p = pokemonList.get(0);
            nombre.setText(p.getNombre());
            ataque.setText(Integer.toString(p.getAtaque()));
            defensa.setText(Integer.toString(p.getDefensa()));
            salud.setText(Integer.toString(p.getSalud()));

        } else {
            JOptionPane.showMessageDialog(this, "NO HAY POKEMONS DE ESE TIPO");
            jButton1.setEnabled(false);
        }


    }//GEN-LAST:event_jButton3ActionPerformed

    private void tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoActionPerformed

    }//GEN-LAST:event_tipoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    public void vaciar() {
        pokemonList.clear();
        posicion = 0;
        nombre.setText("");
        ataque.setText("");
        defensa.setText("");
        salud.setText("");
    }

    //creando método que desabilita los botones jButton2(Anterior), jButton1(Siguiente)
    public void disableButtons() {

        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
    }

    //creando método que activa los botones jButton2(Anterior), jButton1(Siguiente)
    public void enableButtons() {

        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ataque;
    private javax.swing.JTextField defensa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField salud;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
