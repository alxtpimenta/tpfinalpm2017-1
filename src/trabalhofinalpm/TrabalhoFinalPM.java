/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinalpm;

import UI.Login;
import static UI.Login.cadastrarCliente;
import java.awt.event.ActionEvent;

/**
 *
 * @author alex
 */
public class TrabalhoFinalPM {

    private static boolean mainLoop = false;
    private static boolean login = false;
    private static boolean loginCliente = false;
    private static boolean loginFuncionario = false;
    private static boolean cadastroCliente = false;
    private static boolean telaCliente = false;
    private static boolean telaFuncionario = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login = true;
        mainLoop = true;
        while(mainLoop)
        {
            while(login)
            {
                UI.Login loginWindow = new UI.Login();
                loginWindow.loginFuncionario.addActionListener((ActionEvent e) -> {
                    loginFuncionario = true;
                    //LOGIN DE FUNCIONARIO
                });
                loginWindow.loginCliente.addActionListener((ActionEvent e) -> {
                    loginCliente = true;
                    //LOGIN DE CLIENTE
                });
                loginWindow.cadastrarCliente.addActionListener((ActionEvent e) -> {
                    cadastroCliente = true;
                    //CADASTRO DE CLIENTE
                });
                while(loginFuncionario)
                {
                    //LOGAR FUNCIONARIO
                }
                
                while(loginCliente)
                {
                    //LOGAR CLIENTE
                }
                
                while(cadastroCliente)
                {
                    //CADASTRO DE CLIENTE
                }
                //FIM DA TELA DE LOGIN
            }
            while(telaCliente)
            {
                //TELA DO CLIENTE
            }
            while(telaFuncionario)
            {
                //TELA DO FUNCIONARIO
            }
        }
    }
    
}
