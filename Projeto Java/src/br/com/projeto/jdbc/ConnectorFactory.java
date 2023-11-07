/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author IAGUIN
 */
public class ConnectorFactory {
    
    public Connection getConnection(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Nao Conectado" + e);
            
        }
        
        try {
            
            return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdvendas","teste","123");
            
        } catch (Exception e) {
            
            throw new RuntimeException(e);
            
        }
        
    }
    
}
