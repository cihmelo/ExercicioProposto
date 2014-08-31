package com.inatel.ac;

import java.util.ArrayList;
import java.util.List;

public class Encomenda {

	private int status;
	private int numero;
	private String nomeDoCliente;
	
	private List<Configuracao> produtos = new ArrayList<Configuracao>(); 
	
	public Encomenda(int status, int numero, String nomeDoCliente){	
		this.status = status;
		this.numero = numero;
		this.nomeDoCliente = nomeDoCliente;
	}
	
	public float calcularPrecoTotal(){
		return 0;
	}
	
	public void confirmarMontagem(){
		this.status = 2;
	}
	
	public void adicionarItem(Configuracao item){
		produtos.add(item);
		this.status = 1;
	}
	
	public String gerarDetalhes(){
		return new String();
	}
	
}
