/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projeto.jdbc;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author IAGUIN
 */
public class TestaConexao {
    
    public static void main(String[] args) {
        
        try {
            
            new ConnectorFactory().getConnection();
            JOptionPane.showMessageDialog(null, "Conectado ao Banco de Dados");
            
        } catch (HeadlessException e) {
            
            JOptionPane.showMessageDialog(null, "Nao Conectado" + e);
            
        }
        
    }
    
}
