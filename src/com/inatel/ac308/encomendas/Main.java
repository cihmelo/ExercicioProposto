package com.inatel.ac308.encomendas;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	HashMap<Integer, Encomenda> hashMap = new HashMap<Integer, Encomenda>();
	
	public static void main(String[] args) {

		new Main().exibeMenu();

	}
	
	private void exibeMenu(){
		
		System.out.println("****MENU****");
		System.out.println("1. Cadastrar");
		System.out.println("2. Imprimir");
		System.out.print("Escolha uma op��o: ");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			cadastrar();
			break;
		case 2:
			listar();
			break;
		case 3:
			return;

		}
	}

	private void cadastrar() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o nome do componente: ");
		String nomeComponente = scanner.next();
		System.out.println("Entre com o pre�o do componente: ");
		float preco = scanner.nextFloat();
		
		Componentes componente = new Componentes(nomeComponente,preco);
		
		System.out.println("Entre com o nome da configura��o: ");
		String nomeConfiguracao = scanner.next();
		System.out.println("Entre com o tipo da configura��o: ");
		String tipo = scanner.next();

		Configuracao configuracao = new Configuracao(nomeConfiguracao, tipo);
		configuracao.adicionarPeca(componente);
		
		System.out.println("Entre com o status da encomenda: ");
		int status = scanner.nextInt();
		System.out.println("Entre com numero da encomenda: ");
		int numero = scanner.nextInt();
		System.out.println("Entre com o nome do cliente: ");
		String nomeDoCliente = scanner.next();
		
		Encomenda encomenda = new Encomenda(status, numero, nomeDoCliente);
		encomenda.adicionarItem(configuracao);
		
		hashMap.put(encomenda.hashCode(), encomenda);
		
		exibeMenu();
		
	}

	private void listar() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o numero da encomenda: ");
		int numero = scanner.nextInt();
		Encomenda encomenda = hashMap.get(hashCode(numero));
		
		System.out.println("Encomenda: " + encomenda.gerarDetalhes());
		
	}

	public int hashCode(int numero) {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
	
}
