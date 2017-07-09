/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author alex
 */
public class Cliente
{
    public JFrame mainWindow;
    public JButton novoChamado;
    public JButton editarChamado;
    
    private static Cliente instance;
    
    private Cliente()
    {
        mainWindow = new JFrame("Login");
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(500, 400);
        
        novoChamado = new JButton("Abrir chamado");
        editarChamado = new JButton("Editar chamado");
        
        novoChamado.setBounds(50, 20, 400, 30);
        editarChamado.setBounds(50, 20, 400, 90);
        
        mainWindow.add(novoChamado);
        mainWindow.add(editarChamado);
    }
    
    public static Cliente prepararInterface()
    {
        if(instance == null)
        {
            instance = new Cliente();
            
        }
        return instance;
    }
}
