package Interfaces;

import Render.Render;
import java.sql.*;
import conexion.Conectar;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FrmUsuarios extends javax.swing.JFrame {

    ModificarAlumno modificar = new ModificarAlumno();
    Conectar condb = new Conectar();
    Connection conn = condb.conexion();

    PreparedStatement pst;
    Statement st;
    ResultSet rs;

    public FrmUsuarios() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarRoles();
        MostrarRegistros("");
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        btn_generar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_paterno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_materno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jcb_roles = new javax.swing.JComboBox<>();
        lbl_idrol = new javax.swing.JLabel();
        btn_crear = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();
        txt_password2 = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();

        jLabel5.setText("Apellido Paterno:");

        jLabel9.setText("Password");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ADMINISTRADOR");

        btn_generar.setBackground(new java.awt.Color(0, 204, 204));
        btn_generar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_generar.setForeground(new java.awt.Color(255, 255, 255));
        btn_generar.setText("GENERAR CREDENCIALES");
        btn_generar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_generar)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        tbl_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_registros);

        jLabel2.setText("CUENTA DE USUARIO");

        jLabel3.setText("Apellido Paterno:");

        jLabel4.setText("Apellido Materno:");

        jLabel6.setText("Nombre (s):");

        jLabel7.setText("Nombre usuario:");

        jLabel8.setText("Password");

        jLabel10.setText("Confirmar password");

        jLabel11.setText("Rol:");

        jcb_roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE UN ROL --" }));
        jcb_roles.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_rolesItemStateChanged(evt);
            }
        });

        btn_crear.setText("GENERAR");
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        jLabel12.setText("Ingrese cualquier valor que desea buscar");

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
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(481, 481, 481)
                        .addComponent(lbl_idrol, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txt_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_paterno, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_password2)
                                        .addComponent(txt_materno)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel10))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jcb_roles, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_crear))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lbl_idrol, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcb_roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_crear)
                            .addComponent(txt_password2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
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
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcb_rolesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_rolesItemStateChanged
        try {
            MostrarIdRoles();
        } catch (SQLException ex) {
            Logger.getLogger(FrmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jcb_rolesItemStateChanged

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
        ValidarCredenciales();
    }//GEN-LAST:event_btn_crearActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        try {
            MostrarRegistros(txt_busqueda.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Panel_Alumnos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        jPanel2.setVisible(true);
    }//GEN-LAST:event_btn_generarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmUsuarios().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmUsuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void MostrarRoles() throws SQLException {
        st = conn.createStatement();
        try {
            String sql = "SELECT descripcion FROM rol";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                jcb_roles.addItem(rs.getString("descripcion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e.getMessage());
        }

    }

    public void MostrarIdRoles() throws SQLException {
        st = conn.createStatement();
        try {
            String sql = "SELECT id FROM rol WHERE descripcion ='" + jcb_roles.getSelectedItem().toString() + "'";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                lbl_idrol.setText(rs.getString("id"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar " + e.getMessage());
        }

    }

    public void Registrar(String paterno, String materno, String nombre, String usuario, String password, int rol) {

        String id_usuario = "";

        String sql = "INSERT INTO usuarios (paterno, materno, nombre, usuario, password, id_rol) VALUES (?,?,?,?,?,?)";

        try {
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM usuarios WHERE paterno LIKE '" + paterno + "' AND materno LIKE '" + materno + "' AND nombre LIKE '" + nombre + "' AND usuario LIKE '" + usuario +"' AND password LIKE '" + password + "'");
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "El usuario ya se encuentra registrado en sistema", "ERROR DE REGISTRO", JOptionPane.ERROR_MESSAGE);
            } else {
                pst = conn.prepareStatement(sql);
                pst.setString(1, paterno);
                pst.setString(2, materno);
                pst.setString(3, nombre);
                pst.setString(4, usuario);
                pst.setString(5, password);
                pst.setInt(6, rol);
                pst.executeUpdate();
                pst = conn.prepareStatement("SELECT MAX(id) as id from usuarios");
                rs = pst.executeQuery();
                if (rs.next()) {
                    id_usuario = rs.getString(String.valueOf("id"));
                }
                JOptionPane.showMessageDialog(null, "Registro Guardado correctamente, ID asignado " + id_usuario);
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
        txt_usuario.setText("");
        txt_password.setText("");
        txt_password2.setText("");
        jcb_roles.setSelectedIndex(0);
        lbl_idrol.setText("");
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
        modelo.addColumn("Usuario");
        modelo.addColumn("Password");
        modelo.addColumn("Rol");
        modelo.addColumn("Accion 1");
        modelo.addColumn("Accion 2");
        tbl_registros.setModel(modelo);
        String sql = "";
        if (busqueda.equals("")) {
            sql = "SELECT * FROM usuarios ORDER BY id_usuario ASC";
        } else {
            sql = "SELECT * FROM usuarios WHERE id_usuario LIKE '%" + busqueda + "%' OR paterno LIKE'%" + busqueda + "%'OR materno LIKE'%" + busqueda + "%'OR nombre LIKE'%" + busqueda + "%'OR usuario LIKE'%" + busqueda
                    + "%'OR id_rol LIKE'%" + busqueda + "%'";
        }
        Object puestos[] = new Object[9];
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
                puestos[6] = rs.getString(7);
                puestos[8] = btnm;
                puestos[9] = btne;
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
            String usuario = (String) tbl_registros.getValueAt(fila, 4).toString();
            String password = (String) tbl_registros.getValueAt(fila, 5).toString();
            String rol = (String) tbl_registros.getValueAt(fila, 6).toString();
            modificar.recibir(id, paterno, materno, nombre, password);
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
            pst = conn.prepareStatement("DELETE FROM usuarios WHERE id='" + id + "'");
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

    public void ValidarCredenciales() {
        try {
            st = conn.createStatement();
            String sql = "";
            if (jcb_roles.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Opcion no  valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else if (jcb_roles.getSelectedIndex() == 1) {
                sql = "SELECT * FROM administrador WHERE nombre='" + txt_nombre.getText() + "' and paterno='" + txt_paterno.getText() + "'and materno='" + txt_materno.getText() + "'and id_rol='" + Integer.parseInt(lbl_idrol.getText()) + "'";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (txt_password2.getText().equals(txt_password.getText())) {
                        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_usuario.getText(), txt_password2.getText(), Integer.parseInt(lbl_idrol.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales, favor de validar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Las credenciales no son correctas", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (jcb_roles.getSelectedIndex() == 2) {
                sql = "SELECT * FROM alumno WHERE nombre='" + txt_nombre.getText() + "' and paterno='" + txt_paterno.getText() + "'and materno='" + txt_materno.getText() + "'and id_rol='" + Integer.parseInt(lbl_idrol.getText()) + "'";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (txt_password2.getText().equals(txt_password.getText())) {
                        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_usuario.getText(), txt_password2.getText(), Integer.parseInt(lbl_idrol.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales, favor de validar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Las credenciales no son correctas", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (jcb_roles.getSelectedIndex() == 3) {
                sql = "SELECT * FROM encargado WHERE nombre='" + txt_nombre.getText() + "' and paterno='" + txt_paterno.getText() + "'and materno='" + txt_materno.getText() + "'and id_rol='" + Integer.parseInt(lbl_idrol.getText()) + "'";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (txt_password2.getText().equals(txt_password.getText())) {
                        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_usuario.getText(), txt_password2.getText(), Integer.parseInt(lbl_idrol.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales, favor de validar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Las credenciales no son correctas", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else if (jcb_roles.getSelectedIndex() == 4) {
                sql = "SELECT * FROM docente WHERE nombre='" + txt_nombre.getText() + "' and paterno='" + txt_paterno.getText() + "'and materno='" + txt_materno.getText() + "'and id_rol='" + Integer.parseInt(lbl_idrol.getText()) + "'";
                rs = st.executeQuery(sql);
                if (rs.next()) {
                    if (txt_password2.getText().equals(txt_password.getText())) {
                        Registrar(txt_paterno.getText(), txt_materno.getText(), txt_nombre.getText(), txt_usuario.getText(), txt_password2.getText(), Integer.parseInt(lbl_idrol.getText()));
                    } else {
                        JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales, favor de validar");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Las credenciales no son correctas", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Surgio un error "+e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crear;
    private javax.swing.JButton btn_generar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JComboBox<String> jcb_roles;
    private javax.swing.JLabel lbl_idrol;
    public javax.swing.JLabel lbl_nombre;
    private javax.swing.JTable tbl_registros;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_materno;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JTextField txt_paterno;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
