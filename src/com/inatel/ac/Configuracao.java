package com.inatel.ac;

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
		return new String();
	}
	
	public void adicionarPeca(Componentes p){
		pecas.add(p);
	}
	
}
