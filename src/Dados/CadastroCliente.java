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

    public CadastroCliente(int matricula, int cpf,String nome, String email, int telefone)
    {
        this._cpf = cpf;
        this._matricula = matricula;
        this._nome = nome;
        this._telefone = telefone;
        this._email = email;
    }

}
