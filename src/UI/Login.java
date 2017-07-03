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
public class Login 
{
    private static JFrame mainWindow;
    public static JButton loginFuncionario;
    public static JButton loginCliente;
    public static JButton cadastrarCliente;
    
    public Login()
    {
        mainWindow = new JFrame("Login");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(70, 50);
        
        loginFuncionario = new JButton("Funcionário");
        loginFuncionario.setBounds(5, 5, 20, 10);
        
        loginCliente = new JButton("Cliente");
        loginCliente.setBounds(25, 15, 20, 10);
        
        cadastrarCliente = new JButton("Cliente");
        cadastrarCliente.setBounds(45, 35, 20, 10);
        
        mainWindow.add(loginFuncionario);
        mainWindow.add(loginCliente);
        mainWindow.add(cadastrarCliente);
    }
}
