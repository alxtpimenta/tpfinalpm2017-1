/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Scanner;

/**
 *
 * @author alex
 */
public class Arquivo {
    
    private static String diretorio;
    private static File arquivo = new File(diretorio);
    private static  Scanner leitor;
    
    public static void cadastrarCliente(CadastroCliente cliente) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String aux = null;
        String tokens[];
        int matricula;
        
        leitor = new Scanner(arquivo);
        while(leitor.hasNextLine())
        {
            aux = leitor.next();
        }
        leitor.close();
        tokens = aux.split(";");
        matricula = Integer.parseInt(tokens[0]);
        
        Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(diretorio), "utf-8"));
        
        String output = Integer.toString(matricula) + ';' + Integer.toString(cliente.getCPF()) +';'+ cliente.getNome() + ';' + cliente.getEmail()
                + ';' + Integer.toString(cliente.getTelefone());
        writer.write(output);
        
        
    }
    
    public static void cadastrarFuncionario(CadastroFuncionario funcionario) throws FileNotFoundException, UnsupportedEncodingException, IOException
    {
        String aux = null;
        String tokens[];
        int matricula;
        
        leitor = new Scanner(arquivo);
        while(leitor.hasNextLine())
        {
            aux = leitor.next();
        }
        leitor.close();
        tokens = aux.split(";");
        matricula = Integer.parseInt(tokens[0]);
        
        Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(diretorio), "utf-8"));
        
        String output = Integer.toString(matricula) + ';'+ funcionario.getNome() + ';' + funcionario.getEmail()
                + ';' + Integer.toString(funcionario.getTelefone()) + ';' + funcionario.getEspecialidade();
        
        writer.write(output);
    }
    
    public static void cadastrarServico(Cadastro servico)
    {
        
    }
    
    public static int retornarMatricula(int cpf) throws FileNotFoundException
    {
        String aux = null;
        String tokens[];
        
        leitor = new Scanner(arquivo);
        while(leitor.hasNextLine())
        {
            aux = leitor.next();
        }
        leitor.close();
        tokens = aux.split(";");
        return Integer.parseInt(tokens[0]);
    }
    
    public static CadastroFuncionario recuperarCadastroFuncionario(int matricula) throws FileNotFoundException
    {
        String aux = null;
        String tokens[];
        boolean seek = true;
        
        leitor = new Scanner(arquivo);
        while(seek);
        {
            aux = leitor.next();
            tokens = aux.split(";");
            if(leitor.hasNextLine())
                seek = true;
            else
                seek = false;
            
            if(Integer.parseInt(tokens[0]) == matricula)
                seek = false;
        }
        leitor.close();
        if(Integer.parseInt(tokens[0]) == matricula)
        {
            CadastroFuncionario output = new CadastroFuncionario(Integer.parseInt(tokens[0]),tokens[1],tokens[4],tokens[2],Integer.parseInt(tokens[3]));
            return output;
        }
        else
            return null;
    }
    
    private static CadastroCliente recuperarCadastroCliente(int matricula) throws FileNotFoundException
    {
        String aux = null;
        String tokens[];
        boolean seek = true;
        
        leitor = new Scanner(arquivo);
        while(seek);
        {
            aux = leitor.next();
            tokens = aux.split(";");
            if(leitor.hasNextLine())
                seek = true;
            else
                seek = false;
            
            if(Integer.parseInt(tokens[0]) == matricula)
                seek = false;
        }
        leitor.close();
        if(Integer.parseInt(tokens[0]) == matricula)
        {
            CadastroCliente output = new CadastroCliente(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]),tokens[2],tokens[3],Integer.parseInt(tokens[4]));
            return output;
        }
        else
            return null;
    }
}
