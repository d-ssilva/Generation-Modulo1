package exercicios_aula16_POO;

public class EletronicoMain {

	public static void main(String[] args) {
		
		Eletronico el = new Eletronico();
		
		el.setPeça("Placa-mãe");
		el.setPreço(400.00);
		el.imprimir();
	}

}
