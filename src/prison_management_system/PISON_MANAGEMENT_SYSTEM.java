/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pison_management_system;

import static sun.security.jgss.GSSUtil.login;

/**
 *
 * @author Constantino Muianga
 */
public class PISON_MANAGEMENT_SYSTEM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
}
