package aula15_VetorMatriz;
import java.util.*;
public class Exercicio4 {

	public static void main(String[] args) {
		Random rn = new Random();
		Scanner l = new Scanner(System.in);
		// TODO Auto-generated method stub
		int mat1[][] = new int [2][2];
		int mat2[][] = new int [2][2];
		int opc;
		//Valores em MAT1
		for (int l1 = 0; l1 < mat1.length ; l1++) {
			System.out.println();
			for (int c = 0; c < mat1[0].length ; c++) {
				mat1[l1][c] = rn.nextInt(26);
			}
		}
		//Valores em MAT2
		for (int l1 = 0; l1 < mat2.length ; l1++) {
			System.out.println();
			for (int c = 0; c < mat2[0].length ; c++) {
				mat2[l1][c] = rn.nextInt(26);
			}
		}
		System.out.println("========================");
		System.out.println("     ESCOLHA OPÇÕES     ");
		System.out.println("========================");
		System.out.println("[1] - somar as duas matrizes ");
		System.out.println("[2] - subtrair a primeira matriz da segunda");
		System.out.println("[3] - adicionar uma constante as duas matrizes");
		System.out.println("[4] - imprimir as duas matrizes ");
		System.out.println("[5] - para sair");
		System.out.println("========================");
		System.out.print("Digite aqui -> ");
		opc = l.nextInt();
		while(opc == 1 || opc == 2 || opc == 3 || opc == 4){
			switch (opc) {
				case 1:
					int matSoma[][] = new int [2][2];				
					for (int l1 = 0; l1 < mat2.length ; l1++) {
						System.out.println();
						for (int c = 0; c < mat2[0].length ; c++) {
							matSoma[l1][c] = mat2[l1][c] + mat1[l1][c];
							System.out.print(matSoma[l1][c] + " ");
						}
					}
					break;
				case 2:
					int matSub[][] = new int [2][2];				
					for (int l1 = 0; l1 < mat2.length ; l1++) {
						System.out.println();
						for (int c = 0; c < mat2[0].length ; c++) {
							matSub[l1][c] = mat2[l1][c] - mat1[l1][c];
							System.out.print(matSub[l1][c] + " ");
						}
					}
					break;
				case 3:
					System.out.print("Número: ");
					int CONSTANTE = l.nextInt();
					for (int l1 = 0; l1 < 3 ; l1++) {
						System.out.println();
						for (int c = 0; c < 3 ; c++) {
							mat2[l1][c] += CONSTANTE; 
							mat1[l1][c] += CONSTANTE;		
					}
				}
					break;
				case 4:
					for (int l1 = 0; l1 < 3 ; l1++) {
						System.out.println();
						for (int c = 0; c < 3 ; c++) {
							System.out.println(mat1[l1][c] + " "); 					
					}
				}
					for (int l1 = 0; l1 < 3 ; l1++) {
						System.out.println();
						for (int c = 0; c < 3 ; c++) {
							System.out.println(mat2[l1][c] + " "); 					
					}
				}
					break;
				default:
					System.out.println("Número Inválido!");
				break;
			}
		}		
	}
}
