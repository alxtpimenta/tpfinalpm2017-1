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
public abstract class Cadastro {

    protected int _matricula;
    protected String _nome;
    protected String _email;
    protected int _telefone;
    protected int _cpf;
    
    public int getMatricula()
    {
        return this._matricula;
    }
    public String getNome()
    {
        return this._nome;
    }
    
    
    public int getTelefone()
    {
        return this._telefone;
    }
    
    public String getEmail()
    {
        return this._email;
    }
    
    public int getCPF()
    {
        return this._cpf;
    }

    public void setCPF(int cpf)
    {
      this._cpf = cpf;
    }
}
