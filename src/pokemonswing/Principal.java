/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonswing;

import javax.swing.JOptionPane;

/**
 *
 * @author DAM
 */
public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        alta = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        capturar = new javax.swing.JButton();
        totales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("keloke");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("MENÚ POKEMON");

        alta.setText("Alta Pokemon");
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaActionPerformed(evt);
            }
        });

        modificar.setText("Modificar Pokemon");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        ver.setText("Ver Pokemon");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });

        capturar.setText("Capturar Pokemon");
        capturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capturarActionPerformed(evt);
            }
        });

        totales.setText("Totales");
        totales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totales)
                    .addComponent(capturar)
                    .addComponent(ver)
                    .addComponent(modificar)
                    .addComponent(alta)
                    .addComponent(jLabel4))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(alta)
                .addGap(18, 18, 18)
                .addComponent(modificar)
                .addGap(18, 18, 18)
                .addComponent(ver)
                .addGap(26, 26, 26)
                .addComponent(capturar)
                .addGap(18, 18, 18)
                .addComponent(totales)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaActionPerformed
        //Al clicar sobre el botón alta, nos dirigirá a la clase AltaPokemon.java
        AltaPokemon ap = new AltaPokemon(this, true);
        ap.setLocationRelativeTo(null);
        ap.setVisible(true);
    }//GEN-LAST:event_altaActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        ModificarPokemon m = new ModificarPokemon(this, true);
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }//GEN-LAST:event_modificarActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        VerPokemon vp = new VerPokemon(this, true);
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);
    }//GEN-LAST:event_verActionPerformed

    private void capturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capturarActionPerformed
        CapturarPokemon cp = new CapturarPokemon(this, true);
        cp.setLocationRelativeTo(null);
        cp.setVisible(true);
    }//GEN-LAST:event_capturarActionPerformed

    private void totalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalesActionPerformed
           JOptionPane.showMessageDialog(this, "Fuego" );
    }//GEN-LAST:event_totalesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alta;
    private javax.swing.JButton capturar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton totales;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
