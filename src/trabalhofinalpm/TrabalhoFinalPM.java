/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhofinalpm;

import Dados.*;
import UI.*;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

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
    private static boolean cadastroFuncionario = false;
    private static boolean telaCliente = false;
    private static boolean telaFuncionario = false;
    private static boolean registrarChamado = false;
    private static int cpfClienteAtivo;
    private static int cpfFuncionarioAtivo;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        login = true;
        mainLoop = true;
        List<CadastroCliente> listaClientes;
        List<CadastroFuncionario> listaFuncionarios;
        List<CadastroServico> listaServicos;
        UI.Login loginWindow = UI.Login.prepararInterface();
        UI.Cliente clienteWindow = UI.Cliente.prepararInterface();
        while(mainLoop)
        {
            while(login)
            {
                loginWindow.mainWindow.setVisible(true);
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
                loginWindow.cadastrarFuncionario.addActionListener((ActionEvent e) -> {
                    cadastroFuncionario = true;
                    //CADASTRO DE CLIENTE
                });
                //Atualizar registros na memoria
                listaClientes = Arquivo.carregarCadastroClientes();
                listaFuncionarios = Arquivo.carregarCadastroFuncionario();
                listaServicos = Arquivo.carregarCadastroServicos();
                while(loginFuncionario)
                {
                	//MONTA TELA ESPECIFICA
                	UI.Funcionario FuncionarioWindow = UI.Funcionario.prepararInterface();
                    //LOGAR FUNCIONARIO
                    cpfFuncionarioAtivo = UI.Dialog.intInput("Digite o CPF:");
                    if(Arquivo.verificarExistenciaCliente(cpfFuncionarioAtivo))
                    {
                        //FUNCIONARIO LOGADO
                        loginFuncionario = false;
                        login = false;
                        loginWindow.mainWindow.setVisible(false);
                        telaFuncionario = true;
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
                	//MONTA TELA ESPECIFICA
                	UI.Cliente ClientWindow = UI.Cliente.prepararInterface();
                    //LOGAR CLIENTE
                    cpfClienteAtivo = UI.Dialog.intInput("Digite o CPF:");
                    if(Arquivo.verificarExistenciaCliente(cpfClienteAtivo))
                    {
                        //CLIENTE LOGADO
                        loginCliente = false;
                        login = false;
                        loginWindow.mainWindow.setVisible(false);
                        telaCliente = true;
                        clienteWindow.clientWindow.setVisible(true);
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
                    int matricula,telefone,cpf;
                    CadastroCliente cliente;
                    nome = UI.Dialog.stringInput("Nome:");
                    cpf = UI.Dialog.intInput("CPF:");
                    email = UI.Dialog.stringInput("Email:");
                    telefone = UI.Dialog.intInput("Telefone:");
                    matricula = Arquivo.retornarMatricula(1);
                    cliente = new CadastroCliente(matricula,cpf,nome,email,telefone);
                    Arquivo.cadastrarCliente(cliente);
                    cadastroCliente = false;
                    
                }
                while(cadastroFuncionario)
                {
                    //CADASTRO DE CLIENTE
                    String nome, email,especialidade;
                    int matricula,telefone,cpf;
                    CadastroFuncionario funcionario;
                    nome = UI.Dialog.stringInput("Nome:");
                    cpf = UI.Dialog.intInput("CPF:");
                    email = UI.Dialog.stringInput("Email:");
                    telefone = UI.Dialog.intInput("Telefone:");
                    especialidade = UI.Dialog.stringInput("Especialidade:");
                    matricula = Arquivo.retornarMatricula(2);
                    funcionario = new CadastroFuncionario(matricula,cpf,nome,especialidade,email,telefone);
                    Arquivo.cadastrarFuncionario(funcionario);
                    cadastroFuncionario = false;
                    
                }
                //FIM DA TELA DE LOGIN
            }
            while(telaCliente)
            {
                //TELA DO CLIENTE
                clienteWindow.adicionarSolicitacao.addActionListener((ActionEvent e) -> {
                    registrarChamado = true;
                });
                
                clienteWindow.listarSolicitacoes.addActionListener((ActionEvent e) -> {
                    registrarChamado = true;
                });
                
                if(registrarChamado)
                {
                    CadastroServico novoServico;
                    int matricula,telefone,cpfCliente,cpfFuncionario;
                    String descricao;
                    matricula = Arquivo.retornarMatricula(3);
                    descricao = UI.Dialog.stringInput("Digite a descricao do chamado");
                    novoServico = new CadastroServico(matricula,cpfClienteAtivo,descricao,1);
                    Arquivo.cadastrarServico(novoServico);
                    registrarChamado = false;
                    
                }
            }
            while(telaFuncionario)
            {
                //TELA DO FUNCIONARIO
            }
        }
    }
    
}

