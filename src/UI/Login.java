/*
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
    public JButton cadastrarFuncionario;
    private static Login instance;
    
    protected Login()
    {
        mainWindow = new JFrame("Login");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(100, 60);
        
        // obtem painel de conteudo
        Container container = mainWindow.getContentPane(); 
        
        // define layout
        container.setLayout( new FlowLayout() );
        

        loginFuncionario = new JButton("Login de Funcionario");
        loginFuncionario.setBounds(5, 5, 20, 10);
        
        loginCliente = new JButton("Login de Cliente");
        loginCliente.setBounds(25, 15, 20, 10);
        
        cadastrarCliente = new JButton("Cadastrar Cliente");
        cadastrarCliente.setBounds(45, 35, 20, 10);
        
        cadastrarFuncionario = new JButton("Cadastrar Funcionario");
        cadastrarFuncionario.setBounds(70, 40, 20, 10);
        
        container.add(loginCliente);
        container.add(loginFuncionario);
        container.add(cadastrarCliente);
        container.add(cadastrarFuncionario);



        mainWindow.setVisible(true);
        mainWindow.pack();
    }
    
    public static Login prepararInterface()
    {
        if(instance == null)
        {
            instance = new Login();
            
        }
        return instance;
    }


	public static void fecharInterface(JFrame moldura)
	{
		moldura.setVisible(false);
	}

}