package aula14_La�osDeRepeti��o;
import java.util.*;
public class Exercicio2 {
	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		int nP = 0, nI = 0, num, flag = 0;
		Scanner l = new Scanner(System.in);
		for(;flag < 10; flag ++) {
			System.out.printf("%d� n�mero: ", (flag+1));
			num = l.nextInt();
			if (num % 2 == 0) {
				nP += 1;
			}
			else{
				nI += 1;
			}			
		}
		System.out.println("====================");
		System.out.printf("PARES: %d\nIMPARES: %d", nP, nI);
	}

}
