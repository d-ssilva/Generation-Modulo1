package exercicios_aula18;

public class Preguica extends Animal implements AcoesAnimaisInterface{

	@Override
	public void som() 
	{
		System.out.println("N/A");
	}

	@Override
	public void dormir() 
	{
		System.out.println("ZzzzzZZZzzz..");
	}

	@Override
	public void correr() 
	{
		System.out.println("N/A");
	}

}
