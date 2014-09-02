package com.inatel.ac308.encomendas;

import java.util.ArrayList;
import java.util.List;

public class Configuracao {

	private String nome;
	private String tipo;

	private List<Componentes> pecas = new ArrayList<Componentes>();

	public Configuracao(String nome, String tipo) {
		this.setNome(nome);
		this.setTipo(tipo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Componentes> getPecas() {
		return pecas;
	}

	public void setPecas(List<Componentes> pecas) {
		this.pecas = pecas;
	}

	public float getPreco() {
		return 0;
	}

	public String gerarDetalhes() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Status: %s%n", this.nome));
		stringBuilder.append(String.format("Numero: %s%n", this.tipo));

		return stringBuilder.toString();
	}

	public void adicionarPeca(Componentes p) {
		pecas.add(p);
	}

}
