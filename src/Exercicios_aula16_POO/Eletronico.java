package Exercicios_aula16_POO;

public class Eletronico {
	
	private String peça;
	private double preço;
	
	public String getPeça() {
		return peça;
	}
	public void setPeça(String peça) {
		this.peça = peça;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preco) {
		this.preço = preco;
	}	
	
	void imprimir()
	{
		System.out.printf("Peça: %s | R$ %.2f", peça, preço);
	}	
}
	