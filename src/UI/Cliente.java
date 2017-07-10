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
import javax.swing.JTextField;

/**
 *
 * @author alex
 */
public class Cliente {
    
    public JFrame clientWindow;
    public JFrame solicitacoesWindow;
    public JButton adicionarSolicitacao, listarSolicitacoes;
    public JTextField conteudo;

    private static Cliente instance;
    
    protected Cliente()
    {
        clientWindow = new JFrame("Cliente");
        clientWindow.setLocationRelativeTo(null);
        clientWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clientWindow.setSize(70, 50);
        
        solicitacoesWindow = new JFrame("Solicitacoes");
        solicitacoesWindow.setLocationRelativeTo(null);
        solicitacoesWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        solicitacoesWindow.setSize(400, 300);
        
        // obtem painel de conteudo
        Container container = clientWindow.getContentPane(); 
        
        // define layout
        container.setLayout( new FlowLayout() );
        
        //
        Container containerSolicitacoes = solicitacoesWindow.getContentPane();
        containerSolicitacoes.setLayout(new FlowLayout());
        
        conteudo = new JTextField();
        
        solicitacoesWindow.add(conteudo);
        
        
        adicionarSolicitacao = new JButton("AdicionarSolicitacao");
        adicionarSolicitacao.setBounds(5, 5, 20, 10);
    
        container.add(adicionarSolicitacao);
        
        listarSolicitacoes = new JButton("ListarSolicitacao");
        listarSolicitacoes.setBounds(5, 5, 20, 10);
    
        container.add(listarSolicitacoes);       
        
        
        clientWindow.setVisible(true);
        clientWindow.pack();
        solicitacoesWindow.pack();
        
        
        
        
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