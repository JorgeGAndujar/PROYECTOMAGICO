
package pseint;

import javax.swing.ButtonGroup;

public class VentanaEjemplo1_11 extends javax.swing.JFrame {
ButtonGroup boton1 = new ButtonGroup();


    
    public VentanaEjemplo1_11() {
        initComponents();
        boton1.add(botACRES);
        boton1.add(botHECTARIAS);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        botHECTARIAS = new javax.swing.JRadioButton();
        botACRES = new javax.swing.JRadioButton();
        lblCANTIDAD = new javax.swing.JLabel();
        txtENTRADA = new javax.swing.JTextField();
        txtSALIDA = new javax.swing.JTextField();
        cmdREINICIAR = new javax.swing.JButton();
        cmdTransformacion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("CONVIERSOR HECTARIAS ACRES");
        lblTitulo.setOpaque(true);

        botHECTARIAS.setText("HECTARIAS");
        botHECTARIAS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botHECTARIAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botHECTARIASActionPerformed(evt);
            }
        });

        botACRES.setText("ACRES");
        botACRES.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botACRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botACRESActionPerformed(evt);
            }
        });

        lblCANTIDAD.setText("INTRODUCE CANTIDAD");

        txtENTRADA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtSALIDA.setEditable(false);
        txtSALIDA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtSALIDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSALIDAActionPerformed(evt);
            }
        });

        cmdREINICIAR.setText("REINICIAR");
        cmdREINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdREINICIARActionPerformed(evt);
            }
        });

        cmdTransformacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(lblCANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmdREINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(botHECTARIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botACRES, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(cmdTransformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCANTIDAD)
                .addGap(18, 18, 18)
                .addComponent(txtENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botHECTARIAS)
                    .addComponent(botACRES))
                .addGap(18, 18, 18)
                .addComponent(cmdTransformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSALIDA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmdREINICIAR)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botACRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botACRESActionPerformed
       //declaracion de variables y entrada
        String hectarias1 = txtENTRADA.getText();
        double hectarias = Double.parseDouble(hectarias1);
        double acres;
        //PROCESO
        acres = hectarias/4047*10000;
        //SALIDA
        txtSALIDA.setText(acres+"");
        cmdTransformacion.setText("CANTIDAD EN HECTARIAS");
        
        
    }//GEN-LAST:event_botACRESActionPerformed

    private void txtSALIDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSALIDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSALIDAActionPerformed

    private void botHECTARIASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botHECTARIASActionPerformed
       //declaracion de variables y entrada
        String acres1 = txtENTRADA.getText();
        double acres = Double.parseDouble(acres1);
        double hectarias;
        //PROCESO
        hectarias = acres * 4047/10000;
        //SALIDA
        txtSALIDA.setText(hectarias+"");
        cmdTransformacion.setText("CANTIDAD EN ACRES");
        
        
    }//GEN-LAST:event_botHECTARIASActionPerformed

    private void cmdREINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdREINICIARActionPerformed
      txtSALIDA.setText("");
      txtENTRADA.setText("");
      boton1.clearSelection();
      cmdTransformacion.setText("");
    }//GEN-LAST:event_cmdREINICIARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjemplo1_11.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjemplo1_11().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton botACRES;
    private javax.swing.JRadioButton botHECTARIAS;
    private javax.swing.JButton cmdREINICIAR;
    private javax.swing.JLabel cmdTransformacion;
    private javax.swing.JLabel lblCANTIDAD;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtENTRADA;
    private javax.swing.JTextField txtSALIDA;
    // End of variables declaration//GEN-END:variables
}
