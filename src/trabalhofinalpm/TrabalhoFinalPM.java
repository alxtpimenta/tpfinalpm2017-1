/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinalpm;

import Dados.Arquivo;
import Dados.CadastroCliente;
import Dados.CadastroFuncionario;
import UI.Login;
import static UI.Login.cadastrarCliente;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;

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
    private static int cpfClienteAtivo;
    private static int cpfFuncionarioAtivo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        login = true;
        mainLoop = true;
        UI.Login loginWindow = UI.Login.prepararInterface();
        while(mainLoop)
        {
            while(login)
            {
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
                    cpfFuncionarioAtivo = UI.Dialog.intInput("Digite o CPF:");
                    if(Arquivo.verificarExistenciaCliente(cpfFuncionarioAtivo))
                    {
                        //FUNCIONARIO LOGADO
                    }
                    else
                    {
                        //ESTE CPF NAO ESTA REGISTRADO
                        cpfFuncionarioAtivo = 0;
                        //exibir mensagem de erro
                        UI.Dialog.outputDialog("Erro", "CPF nao cadastrado");
                    }
                }
                
                while(loginCliente)
                {
                    //LOGAR CLIENTE
                    cpfClienteAtivo = UI.Dialog.intInput("Digite o CPF:");
                    if(Arquivo.verificarExistenciaCliente(cpfClienteAtivo))
                    {
                        //CLIENTE LOGADO
                    }
                    else
                    {
                        //ESTE CPF NAO ESTA REGISTRADO
                        cpfClienteAtivo = 0;
                        //exibir mensagem de erro
                        UI.Dialog.outputDialog("Erro", "CPF nao cadastrado");
                    }
                }
                
                while(cadastroCliente)
                {
                    //CADASTRO DE CLIENTE
                    String nome, email;
                    int telefone,cpf;
                    CadastroCliente cliente;
                    nome = UI.Dialog.stringInput("Nome:");
                    cpf = UI.Dialog.intInput("CPF:");
                    email = UI.Dialog.stringInput("Email:");
                    telefone = UI.Dialog.intInput("Telefone:");
                    cliente = new CadastroCliente(0,cpf,nome,email,telefone);
                    Arquivo.cadastrarCliente(cliente);
                    
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
