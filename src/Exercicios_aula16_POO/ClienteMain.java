package Exercicios_aula16_POO;

import java.util.Scanner;

public class ClienteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl = new Cliente();
		Scanner input = new Scanner(System.in);
		String nome;
		int idade;
		
		System.out.print("Escreva seu nome: ");
		nome = input.next();
		System.out.print("Insira sua idade: ");
		idade = input.nextInt();
		System.out.println("=========================");
		
		cl.setNomeCliente(nome);
		cl.setIdade(idade);
		cl.imprimirNome();
		cl.imprimirIdade();
		input.close();
	}

}
