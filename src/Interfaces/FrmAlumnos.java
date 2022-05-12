package Interfaces;

import java.sql.*;
import conexion.Conectar;
import Render.Render;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmAlumnos extends javax.swing.JFrame {

    ModificarAlumno modificar = new ModificarAlumno();

    //tbl_registros.setDefaultRenderer(Object.class, new Render());        
    JButton btnm;
    JButton btne;

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public FrmAlumnos() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarRegistros("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_cancelar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("REGISTRO DE ALUMNOS");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("ApellidoMaterno:");

        jLabel4.setText("Nombre");

        jLabel5.setText("Telefono:");

        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_registrar.setText("REGISTRAR");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(38, 38, 38)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btn_cancelar)
                            .addGap(18, 18, 18)
                            .addComponent(btn_registrar))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_registrar))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel6.setText("REGISTRO DE ALUMNOS");

        tbl_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbl_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_registrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_registros);

        jLabel7.setText("Ingrese cualquier valor que desea buscar");

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_telefono.getText());
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        try {
            MostrarRegistros(txt_busqueda.getText());
        } catch (SQLException ex) {
            Logger.getLogger(FrmAlumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void tbl_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_registrosMouseClicked
        int column = tbl_registros.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbl_registros.getRowHeight();

        if (row < tbl_registros.getRowCount() && row >= 0 && column < tbl_registros.getColumnCount() && column >= 0) {
            Object value = tbl_registros.getValueAt(row, column);
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("m")) {
                    EnviarValores();
                    this.dispose();

                    //System.out.println("Click en el boton modificar");
                    //EVENTOS MODIFICAR
                }
                if (boton.getName().equals("e")) {
                    //JOptionPane.showConfirmDialog(null, "Desea eliminar este registro", "Confirmar", JOptionPane.OK_CANCEL_OPTION);
                    //System.out.println("Click en el boton eliminar");
                    Eliminar();
                    //EVENTOS ELIMINAR
                }
            }
            if (value instanceof JCheckBox) {
                //((JCheckBox)value).doClick();
                JCheckBox ch = (JCheckBox) value;
                if (ch.isSelected() == true) {
                    ch.setSelected(false);
                }
                if (ch.isSelected() == false) {
                    ch.setSelected(true);
                }

            }
        }
    }//GEN-LAST:event_tbl_registrosMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmAlumnos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmAlumnos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void Registrar(String paterno, String materno, String nombre, String telefono) {

        int rol = 2;
        String id_alumno = "";

        String sql = "INSERT INTO alumno (paterno, materno, nombre, telefono, id_rol) VALUES (?,?,?,?,?)";

        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM alumno WHERE paterno LIKE '" + paterno + "' AND materno LIKE '" + materno + "' AND nombre LIKE '" + nombre + "' AND telefono LIKE '" + telefono + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El alumno ya se encuentra registrado en sistema", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = conn.prepareStatement(sql);
                pst.setString(1, paterno);
                pst.setString(2, materno);
                pst.setString(3, nombre);
                pst.setString(4, telefono);
                pst.setInt(5, rol);
                pst.executeUpdate();
                pst = conn.prepareStatement("SELECT MAX(id_alumno) as id from alumno");
                rs = pst.executeQuery();
                if (rs.next()) {
                    id_alumno = rs.getString(String.valueOf("id"));
                }
                JOptionPane.showMessageDialog(null, "Registro Guardado correctamente, ID asignado " + id_alumno);
                Limpiar();
                MostrarRegistros("");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Surgio un error " + e, "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void Limpiar() {
        txt_paterno.setText("");
        txt_materno.setText("");
        txt_nombre.setText("");
        txt_telefono.setText("");
    }

    public void MostrarRegistros(String busqueda) throws SQLException {
        tbl_registros.setDefaultRenderer(Object.class, new Render());
        JButton btnm = new JButton("Modificar");
        btnm.setName("m");
        JButton btne = new JButton("Eliminar");
        btne.setName("e");

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Paterno");
        modelo.addColumn("Materno");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        modelo.addColumn("Accion 1");
        modelo.addColumn("Accion 2");
        tbl_registros.setModel(modelo);
        String sql = "";
        if (busqueda.equals("")) {
            sql = "SELECT * FROM alumno ORDER BY id_alumno ASC";
        } else {
            sql = "SELECT * FROM alumno WHERE id_alumno LIKE '%" + busqueda + "%' OR paterno LIKE'%" + busqueda + "%'OR materno LIKE'%" + busqueda + "%'OR nombre LIKE'%" + busqueda
                    + "%'OR telefono LIKE'%" + busqueda + "%'OR id_rol LIKE'%" + busqueda + "%'";
        }
        Object puestos[] = new Object[8];
        try {
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {

                puestos[0] = rs.getString(1);
                puestos[1] = rs.getString(2);
                puestos[2] = rs.getString(3);
                puestos[3] = rs.getString(4);
                puestos[4] = rs.getString(5);
                puestos[5] = rs.getString(6);
                puestos[6] = btnm;
                puestos[7] = btne;
                modelo.addRow(puestos);
            }
            tbl_registros.setModel(modelo);
        } catch (SQLException e) {
        }
    }

    public void EnviarValores() {
        modificar.setVisible(true);
        int fila = tbl_registros.getSelectedRow();
        if (fila >= 0) {
            String id = (String) tbl_registros.getValueAt(fila, 0).toString();
            String paterno = (String) tbl_registros.getValueAt(fila, 1).toString();
            String materno = (String) tbl_registros.getValueAt(fila, 2).toString();
            String nombre = (String) tbl_registros.getValueAt(fila, 3).toString();
            String telefono = (String) tbl_registros.getValueAt(fila, 4).toString();
            modificar.recibir(id, paterno, materno, nombre, telefono);
        } else {
            JOptionPane.showMessageDialog(null, "Debes selecionar una fila de la tabla", "ERROR", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void Eliminar() {
        PreparedStatement pst = null;
        int fila = tbl_registros.getSelectedRow();
        String id = tbl_registros.getValueAt(fila, 0).toString();
        //Object id = btne;
        try {
            pst = conn.prepareStatement("DELETE FROM alumno WHERE id_alumno='" + id + "'");
            int s = JOptionPane.showConfirmDialog(null, "¿Estas seguro de eliminar el registro?", "CONFIRMACION", 0);
            if (s == 0) {
                pst.executeUpdate();
                MostrarRegistros("");
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se puede eliminar este registro", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_registros;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
