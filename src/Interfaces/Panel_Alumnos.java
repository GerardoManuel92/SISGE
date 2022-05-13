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

public class Panel_Alumnos extends javax.swing.JPanel {

     ModificarAlumno modificar = new ModificarAlumno();

    //tbl_registros.setDefaultRenderer(Object.class, new Render());        
    JButton btnm;
    JButton btne;

    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;
    
    public Panel_Alumnos() throws SQLException {
        initComponents();
        //this.setSize(800, 900);
        MostrarRegistros("");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRO DE ALUMNOS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 19, -1, -1));

        jLabel2.setText("Apellido Paterno:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));
        jPanel2.add(txt_paterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 180, -1));

        jLabel3.setText("ApellidoMaterno:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel2.add(txt_materno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, -1));
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, -1));

        jLabel4.setText("Nombre");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setText("Telefono:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, -1));

        btn_cancelar.setBackground(new java.awt.Color(255, 51, 51));
        btn_cancelar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 90, -1));

        btn_registrar.setBackground(new java.awt.Color(90, 166, 255));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorder(null);
        btn_registrar.setBorderPainted(false);
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 82, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 460));

        jLabel6.setText("REGISTRO DE ALUMNOS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, -1, -1));

        jLabel7.setText("Ingrese cualquier valor que desea buscar");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, -1));
        jPanel1.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 341, -1));

        tbl_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_registros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 655, 264));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        Limpiar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_telefono.getText());
    }//GEN-LAST:event_btn_registrarActionPerformed


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

    public void EnviarValores() throws SQLException {
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
