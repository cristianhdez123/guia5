package guia.pkg5;

import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class frmcomprar extends javax.swing.JFrame {

    private DefaultListModel modelo1 = new DefaultListModel();
    private DefaultListModel modelo2 = new DefaultListModel();

    public frmcomprar() {
        initComponents();
        this.getContentPane().setBackground(Color.green);
        lstCursosElegidos.setModel(modelo1);
        lstPreciosElegidos.setModel(modelo2);
        btnAgregar.setEnabled(false);
        btnQuitar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngFormaDePago = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCursos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPrecios = new javax.swing.JList<>();
        lblCursosDisponibles = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstCursosElegidos = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstPreciosElegidos = new javax.swing.JList<>();
        lblElegidos = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        rbtnContado = new javax.swing.JRadioButton();
        rbtnCredito = new javax.swing.JRadioButton();
        lblFormaDePago = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        lblTotal = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lstCursos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "NEXUS", "PIXI", "LENOVO", "SONY", "APPLE", "SAMSUMG", "ALACATEL", "LG" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCursos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCursosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCursos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 49, 131, -1));

        lstPrecios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "900", "300", "460", "890", "800", "365", "399", "699", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstPrecios.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPreciosValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPrecios);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 50, -1));

        lblCursosDisponibles.setText("Cursos disponibles");
        getContentPane().add(lblCursosDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, 150, -1));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        lstCursosElegidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCursosElegidosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstCursosElegidos);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 103, 138));

        lstPreciosElegidos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPreciosElegidosValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(lstPreciosElegidos);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 50, 138));

        lblElegidos.setText("Telefono Elegido");
        getContentPane().add(lblElegidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 122, -1));

        btnQuitar.setText("Quitar");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 71, -1));

        btngFormaDePago.add(rbtnContado);
        rbtnContado.setText("Contado");
        rbtnContado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnContadoActionPerformed(evt);
            }
        });
        getContentPane().add(rbtnContado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        btngFormaDePago.add(rbtnCredito);
        rbtnCredito.setText("Crédito");
        getContentPane().add(rbtnCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        lblFormaDePago.setText("Forma de pago");
        getContentPane().add(lblFormaDePago, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 131, -1));
        getContentPane().add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 50, -1));

        lblMonto.setText("Monto $");
        getContentPane().add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 69, -1));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 50, -1));

        lblTotal.setText("Total $");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jLabel1.setText("precios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jList1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "8", "7", "4", "9", "9.5", "10", "7", "8" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane5.setViewportView(jList1);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 40, -1));

        jLabel2.setText("Puntaje");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstCursosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCursosValueChanged
        int posicion;
        posicion=lstCursos.getSelectedIndex();
        lstPrecios.setSelectedIndex(posicion);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_lstCursosValueChanged

    private void lstPreciosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPreciosValueChanged
        int posicion;
        posicion=lstPrecios.getSelectedIndex();
        lstCursos.setSelectedIndex(posicion);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_lstPreciosValueChanged

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int cuantos, elemento;
        double monto=0;
        String curso, precio;
        curso=lstCursos.getSelectedValue();
        precio=lstPrecios.getSelectedValue();
        modelo1.addElement(curso);
        modelo2.addElement(precio);
        cuantos=modelo2.size();
        for (elemento=0; elemento<cuantos; elemento++){
            monto=monto+Double.parseDouble((String)modelo2.elementAt(elemento));
        }
        txtMonto.setText(""+monto);

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void lstCursosElegidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCursosElegidosValueChanged
        int posicion;
        posicion=lstCursosElegidos.getSelectedIndex();
        lstPreciosElegidos.setSelectedIndex(posicion);
        btnQuitar.setEnabled(true);
    }//GEN-LAST:event_lstCursosElegidosValueChanged

    private void lstPreciosElegidosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPreciosElegidosValueChanged
        int posicion;
        posicion=lstPreciosElegidos.getSelectedIndex();
        lstCursosElegidos.setSelectedIndex(posicion);
        btnQuitar.setEnabled(true);
    }//GEN-LAST:event_lstPreciosElegidosValueChanged

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        int posicion, cuantos, elemento;
        double monto=0;
        posicion=lstCursosElegidos.getSelectedIndex();
        modelo1.remove(posicion);
        modelo2.remove(posicion);
        cuantos=modelo2.size();
        for (elemento=0; elemento<cuantos; elemento++){
            monto=monto+Double.parseDouble((String)modelo2.elementAt(elemento));
        }
        txtMonto.setText(""+monto);

    }//GEN-LAST:event_btnQuitarActionPerformed

    private void rbtnContadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnContadoActionPerformed
        
    }//GEN-LAST:event_rbtnContadoActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double total=0, descuento=0, aumento=0;
        if (rbtnContado.isSelected()){
            descuento=Double.parseDouble((String)txtMonto.getText())*0.1;
            total=Double.parseDouble((String)txtMonto.getText())*0.9;
                       txtTotal.setText(""+total);
        }
        else if (rbtnCredito.isSelected()){
            aumento=Double.parseDouble((String)txtMonto.getText())*0.1;
            total=Double.parseDouble((String)txtMonto.getText())*1.1;
            
            txtTotal.setText(""+total);}            
        else{
            JOptionPane.showMessageDialog(null, "Falta seleccionar forma de pago");
        }
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 FrmMenu jframe= new FrmMenu ();
        jframe.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmcomprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmcomprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmcomprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmcomprar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcomprar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnQuitar;
    private javax.swing.ButtonGroup btngFormaDePago;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblCursosDisponibles;
    private javax.swing.JLabel lblElegidos;
    private javax.swing.JLabel lblFormaDePago;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> lstCursos;
    private javax.swing.JList<String> lstCursosElegidos;
    private javax.swing.JList<String> lstPrecios;
    private javax.swing.JList<String> lstPreciosElegidos;
    private javax.swing.JRadioButton rbtnContado;
    private javax.swing.JRadioButton rbtnCredito;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
