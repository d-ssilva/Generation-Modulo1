package aula15_VetorMatriz;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. 
		 * O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.*/
		// TODO Auto-generated method stub
		int vet[] = new int[6];
		int simples;
		
		//a)
		vet[0]= 1;
		vet[1]= 0;
		vet[2]= 5;
		vet[3]= -2;
		vet[4]= -5;
		vet[5]= 7;
		
		//b)
		simples = vet[0] + vet[1] + vet[5];
		System.out.println("Valor SIMPLES: " + simples);
		
		//c)
		vet[4] = 100;
		System.out.println("Valor na posi��o 4: " + vet[4]);
		
		//d)
		System.out.print("Valores do vetor: ");
		for (int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + " ");
		}
	}

}
