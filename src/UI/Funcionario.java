/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.*;

/**
 *
 * @author alex
 */
public class Funcionario {
    public JFrame mainWindow;
    public JButton editarChamado;
    
    private static Funcionario instance;
    
    private Funcionario()
    {
        mainWindow = new JFrame("Login");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(500, 400);
        
        editarChamado = new JButton("Editar chamado");
        
        editarChamado.setBounds(50, 20, 400, 90);
        
        mainWindow.add(editarChamado);
    }
    
    public static Funcionario prepararInterface()
    {
        if(instance == null)
        {
            instance = new Funcionario();
            
        }
        return instance;
    }
    
}
