package tratamentoDeErros;

public class TestaErro {
	public static void main(String[] args) {
		
		int[] vetor = new int[4];
		
		System.out.println("Antes da exception!");
		try {
		vetor[4] = 1;
		}catch(ArrayIndexOutOfBoundsException){
			System.out.println("Após a exception!");
		}
	}
}
