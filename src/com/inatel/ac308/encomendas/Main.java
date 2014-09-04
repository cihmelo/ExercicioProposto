package com.inatel.ac308.encomendas;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	HashMap<Integer, Encomenda> hashMap = new HashMap<Integer, Encomenda>();
	
	public static void main(String[] args) {

		System.out.println("****MENU****");
		System.out.println("1. Cadastrar");
		System.out.println("2. Imprimir");
		System.out.print("Escolha uma opção: ");

		Scanner scanner = new Scanner(System.in);

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			new Main().cadastrar();
			break;
		case 2:
			new Main().listar();
			break;
		case 3:
			return;

		}

	}

	private void cadastrar() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Entre com o nome do componente: ");
		String nomeComponente = scanner.next();
		System.out.println("Entre com o preço do componente: ");
		float preco = scanner.nextFloat();
		
		Componentes componente = new Componentes(nomeComponente,preco);
		
		System.out.println("Entre com o nome da configuração: ");
		String nomeConfiguracao = scanner.next();
		System.out.println("Entre com o tipo da configuração: ");
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
		
	}

	private void listar() {

	}

}
