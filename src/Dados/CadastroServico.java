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
    private final int _matriculaCliente;
    private final int _matriculaFuncionario;
    private int _status;
    private final String _descricao;
    private final int _id;
    public Orcamento _orcamento;
    
    public CadastroServico(int id,int matriculaCliente, int matriculaFuncionario, String descricao, int status)
    {
        this._descricao = descricao;
        this._matriculaCliente = matriculaCliente;
        this._matriculaFuncionario = matriculaFuncionario;
        this._status = status;
        this._id = id;
    }
    
    public int getMatriculaCliente()
    {
        return this._matriculaCliente;
    }
    
    public int getID()
    {
        return this._id;
    }
    
    public int getMatriculaFuncionario()
    {
        return this._matriculaFuncionario;
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
