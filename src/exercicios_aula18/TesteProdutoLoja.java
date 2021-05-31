package exercicios_aula18;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class TesteProdutoLoja {
	 public static void main(String[] args) {
		
	Scanner ler = new Scanner(System.in);
	ProdutosLoja p1 = new ProdutosLoja("Pasta",2);
	ProdutosLoja p2 = new ProdutosLoja("Panela",1);
	ProdutosLoja p3 = new ProdutosLoja("Pacote de algodão", 5);
	ProdutosLoja p4 = new ProdutosLoja("Desodorante", 3);
	
	
	Set<ProdutosLoja> listaProdutos = new SetProdutosLoja;
	
	System.out.println("|===================================|");
	System.out.println("Quantos produtos serão cadastrados: ");
	int cont = ler.nextInt();
	
	for (int i = 0; i <= cont; i ++) 
	{
		System.out.println("Produto: ");
		String nomeproduto = ler.next();
		System.out.println("Quantidade: ");
		int quant = ler.nextInt();
		
		p1.add(nomeproduto, quant);
	}	

	for (int i = 0; i <= cont; i ++) 
	{
		System.out.println("|" + get.ProdutosLoja(i) + " - " + get.ProdutosLoja(i) + " |");
	}
	}
}
