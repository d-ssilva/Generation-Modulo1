package aula14_LaçosDeRepetição;
import java.util.*;
public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos.
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		int idade = 0, tot21 = 0, tot50 = 0;		
		Scanner l = new Scanner(System.in);
		while (idade != -99) {
			System.out.println("====================");
			System.out.print("IDADE: ");
			idade = l.nextInt();
			if(idade < 21) {
				tot21 += 1;
			}else if(idade > 50){
				tot50 += 1;				
			}
		}
		System.out.println("==================================");
		System.out.printf("Total de pessoas acima de 50 anos: %d", tot50);
		System.out.printf("\nTotal de pessoas abaixo de 21 anos: %d", tot21);
	}

}
