package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollection {
		
	public static void main(String[] args) {
			
		String aula1 =  "logica";
		String aula2 =  "java";
		String aula3 =  "tcc";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula3);
		aulas.add(aula2);
		
		
		//System.out.println(aulas);
		//Foreach: como funciona	--------------------	
		for( String i : aulas)
		{
			System.out.printf("Aula: %s \n", i);
		}
		//-------------------- Foreach: como funciona
		
		
		// For 'convencional' - percorre todos os índices da collection -----
		for(int i = 0; i < aulas.size(); i++)
		{
			System.out.println("Aula: " + aulas.get(i));
		}
		// ----- For 'convencional' - percorre todos os índices da collection
		
		// tamanho de uma colection
		System.out.println(aulas.size());
		
		// collection ordenada
		System.out.println("========");
		Collections.sort(aulas);
		System.out.println(aulas);
	}

}
