/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisge;

import Interfaces.FrmLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author gmgv_
 */
public class SISGE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException  {
        
        FrmLogin login = new FrmLogin();
        //login.setVisible(true);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmLogin().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FrmLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
       
    }
    
}
