package aula16_POO;

public class Bicicleta {
	int velocidade = 0;
	int marcha = 1;
	
	void mudarMarcha(int novoValor) {
		marcha = novoValor;
	}

	void aumentarVelocidade(int incremento) {
		velocidade = velocidade + incremento;
	}
	void aplicarFreios(int decremento) {
		velocidade -= decremento;
	}
}
