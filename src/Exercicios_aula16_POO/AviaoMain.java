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
		
		System.out.print("Em opera��o [0-N/1-S]: ");
		op = input.nextBoolean();
		av.setOpera��o(op);
		
		System.out.print("Status [0-Indispon�vel/1-Dipon�vel]: ");
		st = input.nextBoolean();
		av.setEstado(st);
		
		
		av.Imprimirvalores();
		input.close();
	}

}
