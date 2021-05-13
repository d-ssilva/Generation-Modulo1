package exercicios_aula18;

public class ProdutosLoja {
	
	private String produto;
	private int qtd;
	
	public ProdutosLoja(String produto, int qtd) 
	{
		super();
		this.produto = produto;
		this.qtd = qtd;
	}
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}	
}
