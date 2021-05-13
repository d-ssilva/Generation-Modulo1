package tratamentoDeErros;

public class TestaErro {
	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception!");
		vetor[4] = 1;
		System.out.println("Após a exception!");
	}
}
