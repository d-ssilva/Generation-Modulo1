package exercicios_aula16_POO;

import java.util.Scanner;

public class AviaoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aviao av = new Aviao();
		Scanner input = new Scanner(System.in);
		String mod, emp;
		boolean op, st;
		
		System.out.print("Modelo: ");
		mod = input.next();
		av.setModelo(mod);
		
		System.out.print("Empresa: ");
		emp = input.next();
		av.setEmpresa(emp);
		
		System.out.print("Em operação [0-N/1-S]: ");
		op = input.nextBoolean();
		av.setOperação(op);
		
		System.out.print("Status [0-Indisponível/1-Diponível]: ");
		st = input.nextBoolean();
		av.setEstado(st);
		
		
		av.Imprimirvalores();
		input.close();
	}

}
