/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonswing;

import javax.swing.JOptionPane;
import modelo.Pokemon;
import modelo.PokemonAgua;
import static pokemonswing.PokemonSwing.pokemonHash;

/**
 *
 * @author DAM
 */
public class AltaPokemonAgua extends javax.swing.JDialog {

    public AltaPokemonAgua(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        def = new javax.swing.JSpinner();
        salud = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        tAgua = new javax.swing.JComboBox<>();
        atk = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Ataque:");

        jLabel3.setText("Defensa:");

        jLabel4.setText("Salud:");

        salud.setModel(new javax.swing.SpinnerNumberModel(20, 20, 100, 1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Alta Pokemon Agua");

        jLabel6.setText("Tipo de Agua:");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("CANCEL");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tAgua.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dulce", "Salada" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)))
                            .addComponent(jButton4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(atk, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(salud, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(def, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tAgua, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(atk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(def, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(salud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tAgua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //método para cerrar la ventana
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //extraemos valor del spinner con getValue y del TextField con getTexts

        int ataque = (int) atk.getValue();
        int defensa = (int) def.getValue();
        int hp = (int) salud.getValue();
        String name = nombre.getText();
        String tAguas = (String) tAgua.getSelectedItem();

        //filtramos para tener los posibles errores en cuenta
        if (name.equalsIgnoreCase(""))
            JOptionPane.showMessageDialog(this, "Nombre vacio");
        else if (ataque < 0)
            JOptionPane.showMessageDialog(this, "Ataque negativo");
        else if (defensa < 0)
            JOptionPane.showMessageDialog(this, "Defensa negativa");
        else if (hp < 0)
            JOptionPane.showMessageDialog(this, "Salud negativa");
        else {
            //instanciamos un objeto pk de la clase Pokemon, al cual le asignaremos el nombre de nuestro HashMap
            Pokemon pk = pokemonHash.get(name);
            // si nuestro objeto esta vació, es decir el nombre ya existe, es null, crearemos un pokemon de tipoAgua.
            if (pk == null) {
                // creamos un booleano para determinar si el pokemon es de agua dulce o agua salada. por defecto sera de agua salada a no ser que se especifica que es de dulce,
                // el valor del booleano cambiara a true y sera dulce.        
                boolean dulce = false;
                if (tAguas.equalsIgnoreCase("dulce")) {
                    dulce = true;
                }
                //creamos el PokemonAgua  teniendo en cuenta que si el primer valor es true (tipo agua: dulce) y si es false ( tipo agua: salada).
                PokemonAgua n = new PokemonAgua(dulce, name, ataque, defensa, hp);
                //y lo añadiremos a nuestro HashMap, mediante el put.
                pokemonHash.put(n.getNombre(), n);
                // ya que ese pokemon no existia lo damos de alta
                JOptionPane.showMessageDialog(this, "Pokemon: " + name + " " + "Tipo Agua dado de alta", "Alta Satisfactoria", JOptionPane.INFORMATION_MESSAGE);

            } else {
                //ya que ese pokemon existe, mostramos el error y no lo damos de alta
                JOptionPane.showMessageDialog(this, "Ya existe un Pokemon con ese nombre");
            }

    }//GEN-LAST:event_jButton1ActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner atk;
    private javax.swing.JSpinner def;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombre;
    private javax.swing.JSpinner salud;
    private javax.swing.JComboBox<String> tAgua;
    // End of variables declaration//GEN-END:variables
}
