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
public class Orcamento 
{
    private int _cargaHoraria;
    private int _precoPorHora;
    private int _cpfCliente;
    private double _valorMateriais;
    private double _valorTotal;
    private String _descricaoMateriais;
    private String _solicitacao;
    private String _nomeFuncionario;
    private String _nomeCliente;

    
    // atualiza o valor total com o calculo do ISS
    
    public double ISS()
    {
    	valorTotal = 1.05 * valorTotal;
    	return valorTotal;
    	
    }
}
