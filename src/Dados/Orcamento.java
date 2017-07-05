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
    private double _valorMateriais;
    private double _valorTotal;
    private String _descricaoMateriais;
    private double ISS = 0.05;	
 

    private double calculaISS(double valortotal){
	return valortotal + (valortotal * ISS);
    }

    private double calculaTotal()
    {
     this._valorTotal = this._cargaHoraria * this.precoPorHora + this._valorMateriais;
     this.calculaISS(this.valorTotal); 
    )
}
