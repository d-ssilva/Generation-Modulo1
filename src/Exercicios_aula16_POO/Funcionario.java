package exercicios_aula16_POO;
import java.util.*;
public class Funcionario {
	Scanner input = new Scanner(System.in);
	private String nome, cargo;
	private double salario;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void cadastrar()
	{
		System.out.print("NOME: ");
		nome = input.next();
		setNome(nome);
		
		System.out.print("CARGO: ");
		cargo = input.next();
		setCargo(cargo);
		
		System.out.print("SALÁRIO: ");
		salario = input.nextDouble();
		setSalario(salario);
		
		System.out.print("IDADE: ");
		idade = input.nextInt();
		setIdade(idade);
	}
	public void imprimir()
	{
		System.out.printf("|Nome: %s |\n|Cargo: %s |\n|Salário: %.2f |\n|Idade: %d |\n|", nome, cargo, salario, idade);
	}
}
