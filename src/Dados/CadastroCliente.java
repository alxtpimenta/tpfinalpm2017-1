/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author alex
 */
public class CadastroCliente extends Cadastro 
{
    private final int _cpf;

    
    public CadastroCliente(int matricula, int cpf,String nome, String email, int telefone)
    {
        this._cpf = cpf;
        this._matricula = matricula;
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }
    
    public String getNome()
    {
        return this._nome;
    }
    
    public int getCPF()
    {
        return this._cpf;
    }
    
    public int getTelefone()
    {
        return this._telefone;
    }
    
    public String getEmail()
    {
        return this._email;
    }
}
