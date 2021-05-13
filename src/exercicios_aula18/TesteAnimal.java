package exercicios_aula18;
import java.util.Scanner;


public class TesteAnimal {

	public static void main(String[] args) 
	{		
			Scanner ler = new Scanner(System.in);
			Cachorro novoDog = new Cachorro();
			Cavalo novoCav = new Cavalo();
			Preguica novaPre = new Preguica();
			
			System.out.print("Nome cachorro: ");			
			novoDog.setNome(ler.next());
			
			System.out.print("Idade: ");
			novoDog.setIdade(ler.nextInt());
			
			System.out.print("Peso: ");
			novoDog.setPeso(ler.nextDouble());						
			
			System.out.printf("Nome: %s | Idade: %d | Peso: %.2f \n",novoDog.getNome(), novoDog.getIdade(), novoDog.getPeso());
		
			
			novoDog.correr();
			novoDog.dormir();
			novoDog.som();			
			

			// CAVALO
			System.out.print("Nome cavalo: ");			
			novoCav.setNome(ler.next());
			
			System.out.print("Idade: ");
			novoCav.setIdade(ler.nextInt());
			
			System.out.print("Peso: ");
			novoCav.setPeso(ler.nextDouble());						
			
			System.out.printf("Nome: %s | Idade: %d | Peso: %.2f \n",novoCav.getNome(), novoCav.getIdade(), novoCav.getPeso());
			
			novoCav.correr();
			novoCav.dormir();
			novoCav.som();
			
			// PREGUIÇA
			System.out.print("Nome preguiça: ");			
			novaPre.setNome(ler.next());
			
			System.out.print("Idade: ");
			novaPre.setIdade(ler.nextInt());
			
			System.out.print("Peso: ");
			novaPre.setPeso(ler.nextDouble());						
			
			System.out.printf("Nome: %s | Idade: %d | Peso: %.2f \n",novaPre.getNome(), novaPre.getIdade(), novaPre.getPeso());
					
			novaPre.correr();
			novaPre.dormir();
			novaPre.som();
			
			ler.close();
	}

}
