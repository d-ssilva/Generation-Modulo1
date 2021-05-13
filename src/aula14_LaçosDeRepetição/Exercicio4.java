package aula14_LaçosDeRepetição;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l = new Scanner(System.in);
		int idade, sexo, perfil, contCalmo = 0, contMN = 0,
				contHA = 0, contOC = 0, cont40 = 0, cont18 = 0,
				flag, totg = 0;
		System.out.print("Quantos cadastros deseja realizar: ");
		flag = l.nextInt();
	
		while(totg <= (flag-1)) {				
			System.out.println("===================================");
			System.out.print("Idade -> ");
			idade = l.nextInt();
			
			System.out.println("===================================");
			System.out.println("               SEXO");
			System.out.print("[1 - Fem | 2 - Masc | 3 - Outros] -> ");
			sexo = l.nextInt();
			
			System.out.println("===================================");
			System.out.println("               PERFIL");
			System.out.print("[1 - Calmo(a) | 2 - Nervoso(a) | 3 - Agressivo(a)] -> ");
			perfil = l.nextInt();
			
			totg += 1;
			
			if(perfil == 1) {// pessoas calmas
				contCalmo += 1; 
			}if(sexo == 1 && perfil == 2) {// mulheres nervosas
				contMN += 1;  			
			}if(sexo == 2 && perfil == 3) { //  homens agressivos
				contHA += 1;
			}if(sexo == 3 && perfil == 1) { // outros calmos
				contOC += 1;
				
			}if(idade >= 40 && perfil == 2) {
				cont40 += 1;
			}if(idade <= 18  && perfil == 1) {
				cont18 += 1;
			}			
		}		
		System.out.println("\n===================================");
		System.out.printf("• Número de pessoas calmas: %d \r\n"
				+ "• Número de mulheres nervosas: %d \r\n"
				+ "• Número de homens agressivos: %d \r\n"
				+ "• Número de outros calmos: %d \r\n"
				+ "• Número de pessoas nervosas com mais de 40 anos: %d \r\n"
				+ "• Número de pessoas calmas com menos de 18 anos: %d"
				+ "\n• TOTAL CADASTRADOS: %d \r\n", contCalmo, contMN, contHA,
				contOC, cont40, cont18, totg);
		l.close();
	}

}
