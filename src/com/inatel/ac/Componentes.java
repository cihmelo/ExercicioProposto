package com.inatel.ac;

public class Componentes {

	private String nome;
	private float preco;
	
	public Componentes(String nome, float preco){
		this.nome = nome;
		this.preco = preco;
	}
	
	public String gerarDetalhes(){
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Status: %s%n", this.nome));
		stringBuilder.append(String.format("Numero: %f%n", this.preco));
		
		return stringBuilder.toString();
	}
	
}
