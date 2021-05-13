package exercicios_aula18;

public class Cachorro extends Animal implements AcoesAnimaisInterface {	
	
	@Override
	public void som() 
	{
		System.out.println("Au au");		
	}

	@Override
	public void dormir() 
	{		
		System.out.println("ZzzZzz...");
	}

	@Override
	public void correr() 
	{
		System.out.println("Corre muito!");		
	}	
}
