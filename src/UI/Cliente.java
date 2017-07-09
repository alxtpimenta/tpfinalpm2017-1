/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class Cliente {
    
    public JFrame clientWindow;
    public JButton botao1;

    private static Cliente instance;
    
    protected Cliente()
    {
        clientWindow = new JFrame("Cliente");
        clientWindow.setLocationRelativeTo(null);
        clientWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientWindow.setSize(70, 50);
        
        // obtem painel de conteudo
        Container container = clientWindow.getContentPane(); 
        
        // define layout
        container.setLayout( new FlowLayout() );
        
        botao1 = new JButton("Novo Chamado");
        botao1.setBounds(5, 5, 20, 10);
    
        container.add(botao1);
        clientWindow.setVisible(true);
        clientWindow.pack();
    }
    
    public static Cliente prepararInterface()
    {
        if(instance == null)
        {
            instance = new Cliente();
            
        }
        return instance;
    }


	public static void fecharInterface(JFrame moldura)
	{
		moldura.setVisible(false);
	}

}