/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.util.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Arquivo {
    
    private static final String diretorioClientes = "cadastro_cliente.txt";
    private static final String diretorioFuncionarios = "cadastro_funcionario.txt";
    private static final String diretorioArquivos = "cadastro_servico.txt";
    
    public static int retornarMatricula(int tipo) throws FileNotFoundException
    {
        String diretorio = null;
        
        switch (tipo) {
            case 1:
                diretorio = diretorioClientes;
                break;
            case 2:
                diretorio = diretorioFuncionarios;
                break;
            case 3:
                diretorio = diretorioArquivos;
                break;
            default:
                break;
        }
        
        File registros = new File(diretorio);
        Scanner scan = new Scanner(registros);
        String aux = null;
        String tokens[];
        
        while(scan.hasNextLine())
        {
            aux = scan.next();
        }
        scan.close();
        tokens = aux.split(";");
        return Integer.parseInt(tokens[0]);
    }
    
    public static boolean verificarExistenciaCliente(int cpf) throws FileNotFoundException
    {
        File clientes = new File(diretorioClientes);
        
        Scanner scan = new Scanner(clientes);
        
        String aux;
        String tokens[];
        boolean output = false;
        while(scan.hasNextLine())
        {
            aux = scan.next();
            tokens = aux.split(";");
            if(Integer.parseInt(tokens[1]) == cpf)
                output = true;
        }
        scan.close();
        return output;
    }
    
    public static List<CadastroCliente> carregarCadastroClientes() throws FileNotFoundException
    {
        File clientes = new File(diretorioClientes);
        
        Scanner scan = new Scanner(clientes);
        String aux;
        String tokens[];
        List<CadastroCliente> saida = new ArrayList<>();
        CadastroCliente instancia;
        //ARQUIVO NO FORMATO
        //int matricula; int cpf; string nome; string email; int telefone
        while(scan.hasNextLine())
        {
            aux = scan.nextLine();
            tokens = aux.split(";");
            instancia = new CadastroCliente(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],
                    tokens[3], Integer.parseInt(tokens[4]));
            saida.add(instancia);
        }
        scan.close();
        return saida;
    }
    
    public static void cadastrarCliente(CadastroCliente novo) throws IOException
    {
        String saida = Integer.toString(novo.getMatricula()) + ";" + Integer.toString(novo.getCPF()) + ";" + novo.getNome() + ";" +
                novo.getEmail() + ";" + Integer.toString(novo.getTelefone());
        File clientes = new File(diretorioClientes);
        BufferedWriter output = new BufferedWriter(new FileWriter(clientes, true));
        output.write(saida);
    }
    
    public static List<CadastroFuncionario> carregarCadastroFuncionario() throws FileNotFoundException
    {
        File funcionarios = new File(diretorioFuncionarios);
        
        Scanner scan = new Scanner(funcionarios);
        String aux;
        String tokens[];
        List<CadastroFuncionario> saida = new ArrayList<>();
        CadastroFuncionario instancia;
        //ARQUIVO NO FORMATO
        //int matricula; int cpf; string nome;string especialidade; string email; int telefone
        while(scan.hasNextLine())
        {
            aux = scan.nextLine();
            tokens = aux.split(";");
            instancia = new CadastroFuncionario(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],
                    tokens[3], tokens[4], Integer.parseInt(tokens[5]));
            saida.add(instancia);
        }
        scan.close();
        return saida;
    }
    
    public static void cadastrarFuncionario(CadastroFuncionario novo) throws IOException
    {
        String saida = Integer.toString(novo.getMatricula()) + ";" + Integer.toString(novo.getCPF()) + ";" + novo.getNome() + ";" +
                novo.getEspecialidade() + ";" + novo.getEmail() + ";" + Integer.toString(novo.getTelefone());
        File funcionarios = new File(diretorioFuncionarios);
        BufferedWriter output = new BufferedWriter(new FileWriter(funcionarios, true));
        output.write(saida);
    }
    
    public static List<CadastroServico> carregarCadastroServicos() throws FileNotFoundException
    {
        File servicos = new File(diretorioArquivos);
        
        Scanner scan = new Scanner(servicos);
        String aux;
        String tokens[];
        List<CadastroServico> saida = new ArrayList<>();
        CadastroServico instancia;
        //ARQUIVO NO FORMATO
        //int id;int matriculaCliente;int matriculaFuncionario; string descricao; int status
        while(scan.hasNextLine())
        {
            aux = scan.nextLine();
            tokens = aux.split(";");
            instancia = new CadastroServico(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]),
                    tokens[3], Integer.parseInt(tokens[4]));
            saida.add(instancia);
        }
        scan.close();
        return saida;
    }
    
    public static void cadastrarServico(CadastroServico novo) throws IOException
    {
        String saida = Integer.toString(novo.getID()) + ";" + Integer.toString(novo.getCpfCliente()) + ";" + Integer.toString(novo.getCpfFuncionario()) + ";" +
                novo.getDescricao() + ";" + Integer.toString(novo.getStatus());
        File servicos = new File(diretorioArquivos);
        BufferedWriter output = new BufferedWriter(new FileWriter(servicos, true));
        output.write(saida);
    }
    
    public static List<CadastroServico> retornarServicosCPF(List<CadastroServico> cadastros, int cpf)
    {
        List<CadastroServico> saida = new ArrayList<>();
        for(CadastroServico registro : cadastros)
        {
            if(registro.getCpfCliente() == cpf | registro.getCpfFuncionario() == cpf)
                saida.add(registro);
        }
        
        return saida;
    }
}
