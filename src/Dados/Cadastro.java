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
    private final String _nome;
    private final String _email;
    private final int _telefone;

    
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
}
