package com.inatel.ac308.encomendas;

public class Main {

	public static void main(String[] args){
		
		Encomenda encomenda = new Encomenda(0,12345,"Paulo Barbosa");
		System.out.println(encomenda.gerarDetalhes());
	
		
	}
	
}