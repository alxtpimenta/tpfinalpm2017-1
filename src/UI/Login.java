/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

/**
 *
 * @author alex
 */
public class Login 
{
    public JFrame mainWindow;
    public JButton loginFuncionario;
    public JButton loginCliente;
    public JButton cadastrarCliente;
    private static Login instance;
    
    protected Login()
    {
        mainWindow = new JFrame("Login");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(70, 50);
        
        // obtem painel de conteudo
        Container container = mainWindow.getContentPane(); 
        
        // define layout
        container.setLayout( new FlowLayout() );
        
        loginFuncionario = new JButton("Funcionário");
        loginFuncionario.setBounds(5, 5, 20, 10);
        
        loginCliente = new JButton("login Cliente");
        loginCliente.setBounds(25, 15, 20, 10);
        
        cadastrarCliente = new JButton("cadastrar Cliente");
        cadastrarCliente.setBounds(45, 35, 20, 10);
        
        container.add(loginCliente);
        container.add(loginFuncionario);
        container.add(cadastrarCliente);



        mainWindow.setVisible(true);
    }
    
    public static Login prepararInterface()
    {
        if(instance == null)
        {
            instance = new Login();
            
        }
        return instance;
    }
}
