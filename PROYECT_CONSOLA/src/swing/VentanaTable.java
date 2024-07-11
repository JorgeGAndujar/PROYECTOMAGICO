package swing;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class VentanaTable extends javax.swing.JFrame {

    String[] cabecera = {"N1", "N2", "N3", "N4", "PROMEDIO"};
    String[][] cuerpo = {};
    DefaultTableModel dtm = new DefaultTableModel(cuerpo, cabecera);

    public VentanaTable() {
        initComponents();
        personalizarVentana();

        tblPromedio.setModel(dtm);
        
        tblPromedio.getTableHeader().setBackground(Color.BLACK);
        tblPromedio.getTableHeader().setForeground(Color.WHITE);
        tblPromedio.getTableHeader().setFont(new java.awt.Font("Courier New", 0, 14));
        tblPromedio.getTableHeader().setBorder(new LineBorder(new Color(255, 162, 232)));
    }

    public void cargarDatosTable() {
        int[] n1 = {4, 5, 7, 8, 2};
        int[] n2 = {6, 7, 8, 9, 2};
        int[] n3 = {9, 8, 5, 6, 3};
        int[] n4 = {5, 7, 3, 2, 1};
        double promedio = 0;
        double promedioClase = 0;
        String[] datosblanco = {"", "", "", "", ""};
        int i;
        for (i = 0; i < n1.length; i++) {
            dtm.addRow(datosblanco);
            dtm.setValueAt(n1[i], i, 0);//dato,fila,columna
            dtm.setValueAt(n2[i], i, 1);
            dtm.setValueAt(n3[i], i, 2);
            dtm.setValueAt(n4[i], i, 3);

            int menornota = n1[i];
            if (n2[i] < menornota) {
                menornota = n2[i];
            }
            if (n3[i] < menornota) {
                menornota = n3[i];
            }
            if (n4[i] < menornota) {
                menornota = n4[i];
            }
            promedio = (n1[i] + n2[i] + n3[i] + n4[i] - menornota) / 3.0;
            promedioClase = promedioClase + promedio;
            String promedios = String.format("%5.2f", promedio);
            dtm.setValueAt(promedios, i, 4);
        }
        promedioClase = promedioClase / dtm.getRowCount();
        dtm.addRow(datosblanco);//añadir fila blanco
        dtm.setValueAt("PROM CLASE", i, 3);
        String promedioClases = String.format("%5.2f", promedioClase);
        dtm.setValueAt(promedioClases, i, 4);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        panel1 = new javax.swing.JScrollPane();
        tblPromedio = new javax.swing.JTable();
        cmdCargar = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lblTitulo.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("PROMEDIO DE CUATRO NOTAS DESCARTANDO LA MENOR");
        lblTitulo.setOpaque(true);

        tblPromedio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPromedio.setShowGrid(true);
        panel1.setViewportView(tblPromedio);

        cmdCargar.setText("CARGAR");
        cmdCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCargarActionPerformed(evt);
            }
        });

        cmdLimpiar.setText("LIMPIAR");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });

        cmdSalir.setText("SALIR");
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(cmdCargar)
                .addGap(56, 56, 56)
                .addComponent(cmdLimpiar)
                .addGap(65, 65, 65)
                .addComponent(cmdSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdCargar)
                    .addComponent(cmdLimpiar)
                    .addComponent(cmdSalir))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCargarActionPerformed
        cargarDatosTable();
    }//GEN-LAST:event_cmdCargarActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        dispose();
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_cmdSalirActionPerformed
    public void limpiar() {
        int numeroFilas = dtm.getRowCount();
        for (int j = 0; j < numeroFilas; j++) {
            dtm.removeRow(0);
        }
    }

    public void personalizarVentana() {
        ImageIcon icono = new ImageIcon("image/cross1.png");
        Image image = icono.getImage();
        this.setIconImage(image);//Cambiar el icono de la ventana

        this.setTitle("GUI SWING");
        this.setResizable(false); //No se redimensione
        this.setLocationRelativeTo(null);//Colocar la ventana en el centro de la pantalla
    }

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
            java.util.logging.Logger.getLogger(VentanaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCargar;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JScrollPane panel1;
    private javax.swing.JTable tblPromedio;
    // End of variables declaration//GEN-END:variables
}
