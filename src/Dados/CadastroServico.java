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
public class CadastroServico extends Cadastro 
{
    private final int _cpfCliente;
    private final int _cpfFuncionario;
    private int _status;
    private final String _descricao;
    private final int _id;
    public Orcamento _orcamento;
    
    public CadastroServico(int id,int matricula,int cpfCliente, String descricao, int status)
    {
        this._descricao = descricao;
        this._cpfCliente = cpfCliente;
        this._cpfFuncionario = 0;
        this._status = status;
        this._id = id;
        this._matricula = matricula;
    }
    
    public int getCpfCliente()
    {
        return this._cpfCliente;
    }
    
    public int getID()
    {
        return this._id;
    }
    
    public int getCpfFuncionario()
    {
        return this._cpfFuncionario;
    }
    
    public int getStatus()
    {
        return this._status;
    }
    
    public void alterarStatus(int status)
    {
        this._status = status;
    }
    
    public String getDescricao()
    {
        return this._descricao;
    }
}
