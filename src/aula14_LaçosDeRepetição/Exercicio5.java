package aula14_La�osDeRepeti��o;
import java.util.*;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
		//No final, mostre a soma dos n�meros digitados.(DO...WHILE)
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
