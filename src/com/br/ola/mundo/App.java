package com.br.ola.mundo;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual a capacidade máxima do estoque?");
		int maximoProdutos = entrada.nextInt();
		System.out.println("Qual a capacidade minima do estoque?");
		int minimoProdutos = entrada.nextInt();
		
		int capacidadeMedia = (maximoProdutos + minimoProdutos)/ 2;
		
		System.out.println("A capacidade media é " + capacidadeMedia);
		
	}
	
}
