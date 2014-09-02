package com.inatel.ac308.encomendas;

import java.util.ArrayList;
import java.util.List;

public class Encomenda {

	private int status;
	private int numero;
	private String nomeDoCliente;

	private List<Configuracao> produtos = new ArrayList<Configuracao>();

	public Encomenda(int status, int numero, String nomeDoCliente) {
		this.setStatus(status);
		this.setNumero(numero);
		this.setNomeDoCliente(nomeDoCliente);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeDoCliente() {
		return nomeDoCliente;
	}

	public void setNomeDoCliente(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	public float calcularPrecoTotal() {
		return 0;
	}

	public void confirmarMontagem() {
		this.status = 2;
	}

	public void adicionarItem(Configuracao item) {
		produtos.add(item);
		this.status = 1;
	}

	public String gerarDetalhes() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(String.format("Status: %d%n", this.status));
		stringBuilder.append(String.format("Numero: %d%n", this.numero));
		stringBuilder.append(String.format("Nome: %s%n", this.nomeDoCliente));

		return stringBuilder.toString();
	}

}
