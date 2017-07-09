package UI;

import javax.swing.*;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class Funcionario {

    
    public JFrame FuncionarioWindow;
    public JButton abrirOrdemServico;
    public static JButton editarOrdemServico;

    private static Funcionario instance;
    
    protected Funcionario()
    {
    	FuncionarioWindow = new JFrame("Funcionario");
    	FuncionarioWindow.setLocationRelativeTo(null);
    	FuncionarioWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	FuncionarioWindow.setSize(500, 400);
        
        // obtem painel de conteudo
        Container container = FuncionarioWindow.getContentPane(); 
        
        // define layout
        container.setLayout( new FlowLayout() );
        
        abrirOrdemServico = new JButton("abrirOrdemServico");
        abrirOrdemServico.setBounds(5, 5, 20, 10);   
        container.add(abrirOrdemServico);
        
        //
       editarOrdemServico = new JButton("editarOrdemServico");
       editarOrdemServico.setBounds(50, 20, 400, 90); 
       container.add(editarOrdemServico);



        FuncionarioWindow.setVisible(true);

    }
    
    public static Funcionario prepararInterface()
    {
        if(instance == null)
        {
            instance = new Funcionario();
            
        }
        return instance;
    }


	public static void fecharInterface(JFrame moldura)
	{
		moldura.setVisible(false);
	}

}