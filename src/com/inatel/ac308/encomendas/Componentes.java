package com.inatel.ac308.encomendas;

public class Componentes {

	private String nome;
	private float preco;

	public Componentes(String nome, float preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String gerarDetalhes() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Status: %s%n", this.nome));
		stringBuilder.append(String.format("Numero: %f%n", this.preco));

		return stringBuilder.toString();
	}

}
