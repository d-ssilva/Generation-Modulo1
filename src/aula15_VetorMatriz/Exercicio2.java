package aula15_VetorMatriz;
import java.util.*;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet[] = new int[6];
		int somaPar = 0, somaImpar = 0;		
		Random rn = new Random();
		/*Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		� Os n�meros pares digitados;  
		� A soma dos n�meros pares digitados; 
		� Os n�meros �mpares digitados; 
		� A quantidade de n�meros �mpares digitados.*/
		
		
		System.out.print("Numeros pares sorteados: ");
		for (int i = 0; i < vet.length ; i++) {
			vet[i] = rn.nextInt(26); // atribui��o de valores aleat�rios			
			if(vet[i] % 2 == 0) {
				somaPar += vet[i];				
				System.out.print(vet[i] + " ");		
			}	
		}
		System.out.print("| Soma dos n�meros pares: " + somaPar);
		System.out.print("\nNumeros impares sorteados: ");
		for (int j = 0; j < vet.length ; j++ ) {
			if (vet[j] % 2 != 0) {
				System.out.print(vet[j] + " ");
				somaImpar += vet[j];
			}
		}
		System.out.print("| Soma dos n�meros impares: " + somaImpar);
	}

}
