/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

public class Solicitacao{
	
	//atributos
	
	public int numeroSolicitacao;
	public int matriculaCliente;
	public int profissionalDesejado;
	public String descricao;
	public int status;
	public int matriculaTecnico;
	public Orcamento orcamento;

	//metodos
	
	public void setNumeroSolicitacao(){
	// numeroSolicitacao = ;"consultar o nº da proxima posicao livre do array e registrar aqui"
	}
		
	public void set_matriculaCliente(int matricula){
	//matriculaCliente = ;"resulta de um evento na GUI"
	}
	
	public void set_matriculaTecnico(int matricula){
	//matriculaTecnico = ;"resulta de um evento na GUI"
	}
	
	public void setProfissionalDesejado(int tipo){
	//profissionalDesejado = ;"resulta de um evento na GUI"
	}
	
	public void setDescricao(String texto){
	//descricao = ;"resulta de um evento na GUI"	
	}
	
	public int setStatus(int status){
	// status = this.status;
		// esse e mais complicado, pode ser invocado por diversos metodos	
		
	}
	public String toString(){
        	return this.numeroSolicitacao +" , " + this.numeroMatriculaCliente +" , " + this.profissionalDesejado +" , " + this.descricao +" , " + this.status +" , " + this.matriculaTecnico;
	}
}