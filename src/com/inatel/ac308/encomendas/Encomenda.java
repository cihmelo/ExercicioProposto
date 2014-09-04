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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Encomenda other = (Encomenda) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

}
