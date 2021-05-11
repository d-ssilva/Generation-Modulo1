package Projeto_Vac;
import java.util.*;
public class Verificação {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Especiais esp = new Especiais();
		Idade id = new Idade();		
		Pessoa pe = new Pessoa();
		Profissão prof = new Profissão();
		
		System.out.println("====================");
		System.out.println("     Sys - Vac");
		System.out.println("====================");
		
		// Inserção de dados
		System.out.print("Nome: ");		
		pe.setNome(l.next()); //  nome
		//System.out.println(pe.getNome());
		
		System.out.print("Endereço: "); // endereço
		pe.setEndereço(l.next());
		
		System.out.print("Idade: ");
		id.setIdade(l.nextInt());  //  idade
		
		System.out.print("Prioridade: " + id.condicaoIdade(id.getIdade()));
		
	}

}
