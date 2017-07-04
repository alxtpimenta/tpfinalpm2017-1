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
public class CadastroFuncionario extends Cadastro 
{
    private String _especialidade;

    
    public CadastroFuncionario(int matricula,String nome, String especialidade, String email, int telefone)
    {
        this._especialidade = especialidade;
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }
    
    public String getEspecialidade()
    {
        return this._especialidade;
    }

    public void setEspecialidade(String texto)
    {
        this._especialidade = texto;
    }
}