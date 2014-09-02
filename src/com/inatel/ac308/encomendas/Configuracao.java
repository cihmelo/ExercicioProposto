package com.inatel.ac308.encomendas;

import java.util.ArrayList;
import java.util.List;

public class Configuracao {

	private String nome;
	private String tipo;
	
	private List<Componentes> pecas = new ArrayList<Componentes>();
	
	public Configuracao(String nome, String tipo){
		this.nome = nome;
		this.tipo = tipo;
	
	}
	
	public float getPreco(){
		return 0;
	}
	
	public String gerarDetalhes(){
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Status: %s%n", this.nome));
		stringBuilder.append(String.format("Numero: %s%n", this.tipo));
		
		return stringBuilder.toString();
	}
	
	public void adicionarPeca(Componentes p){
		pecas.add(p);
	}
	
}
