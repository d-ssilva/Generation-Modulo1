package exercicios_aula18;

public class Cavalo extends Animal implements AcoesAnimaisInterface {

	@Override
	public void som() 
	{
		System.out.println("Hin hi hi");		
	}

	@Override
	public void dormir() 
	{		
		System.out.println("...Zzz..");
	}

	@Override
	public void correr() 
	{
		System.out.println("Corre muitissimo!");		
	}
	

}
