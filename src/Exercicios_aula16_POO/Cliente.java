package exercicios_aula16_POO;

public class Cliente {
	
	private String nomeCliente;
	private int idade;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void imprimirNome()
	{
		System.out.println(nomeCliente);
	}
	void imprimirIdade() 
	{
		System.out.println(idade);
	}
}
