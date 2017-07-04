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
    
    public static void cadastrarCliente(Cadastro cliente) throws FileNotFoundException, UnsupportedEncodingException
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
        
        
    }
    
    public static void cadastrarFuncionario(Cadastro funcionario)
    {
        
    }
    
    public static void cadastrarServico(Cadastro servico)
    {
        
    }
    
    public static int retornarMatricula(int cpf)
    {
        
    }
    
    public static Cadastro recuperarCadastro(int matricula)
    {
        
    }
}
