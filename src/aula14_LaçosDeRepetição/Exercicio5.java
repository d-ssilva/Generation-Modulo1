package aula14_LaçosDeRepetição;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
		//No final, mostre a soma dos números digitados.(DO...WHILE)
		int cont = 0, num, tot = 0;
		System.out.println("=================");
		do {	
		System.out.printf("N%d: ", (cont+1));
		num = l.nextInt();
		cont ++;
		tot += num;
		}while(num != 0);
		System.out.println("=================");
		System.out.println("SOMA: " + tot);
	
	}

}
