package Exercicios_aula16_POO;

public class Eletronico {
	
	private String pe�a;
	private double pre�o;
	
	public String getPe�a() {
		return pe�a;
	}
	public void setPe�a(String pe�a) {
		this.pe�a = pe�a;
	}
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double preco) {
		this.pre�o = preco;
	}	
	
	void imprimir()
	{
		System.out.printf("Pe�a: %s | R$ %.2f", pe�a, pre�o);
	}	
}
	