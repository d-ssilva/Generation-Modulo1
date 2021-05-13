package aulaPlatColection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes_l {
	
	public static void main(String[] args) 
	{
		Collection <String> nomes = new ArrayList();	
		
		// adicionando valores a lista
		nomes.add("Mario");
		nomes.add("Maria");
		nomes.add("Juliana");
		nomes.add("Rafaela"); 
		
		// criando segunda lista
		Collection<String> nomes2 = Arrays.asList("João", "Joana");
		nomes.addAll(nomes2); // adicionando todos os nomes de lista 'nomes' para lista 
		                                     // nomes2		
		
		// Contem o nome "Maria" | usando o método 'contains'
		System.out.println("Contém o nome Maria? " + nomes.contains("Maria"));
		
		// removendo o "Mario" da lista | usando o método 'remove'
		nomes.remove("Mario");
		
		// percorrendo lista
		for (String name: nomes)
			{
				System.out.println("Nome: " + name);
			}
		
		// verificando se lista esta vazia | usando o método 'isEmpty'
		if (nomes.isEmpty())
		{
			System.out.println("Lista vazia");
		}
		else
		{
			System.out.println("Lista de nomes: " + nomes);
		}
		
		// limpando todos os elementos da lista | usando o método 'clear'
		nomes.clear();		
		System.out.println("Lista vazia -> " + nomes);
		
		
	}

}
