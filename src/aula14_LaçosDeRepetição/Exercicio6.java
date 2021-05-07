<<<<<<< HEAD
package aula14_LaçosDeRepetição;
import java.util.*;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		//Escrever um programa que receba vários números inteiros no teclado. 
		//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		int num, cont = 0, tot = 0;		
		do {
			System.out.printf("N%d: ", (cont+1));
			num = l.nextInt();
			cont ++;
			tot += num;			
		}while(num != 0);
		cont -= 1;
		double media = tot / cont;
		System.out.println("=================");
		System.out.printf("SOMA: %d\nMEDIA: %.2f", tot, media );
	}

}
=======
package aula14_LaçosDeRepetição;
import java.util.*;
public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		//Escrever um programa que receba vários números inteiros no teclado. 
		//E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
		int num, cont = 0, tot = 0;		
		do {
			System.out.printf("N%d: ", (cont+1));
			num = l.nextInt();
			cont ++;
			tot += num;			
		}while(num != 0);
		cont -= 1;
		double media = tot / cont;
		System.out.println("=================");
		System.out.printf("SOMA: %d\nMEDIA: %.2f", tot, media );
	}

}
>>>>>>> 8636bee9fc48ab6792c9d088d328dcbc7de304b9
