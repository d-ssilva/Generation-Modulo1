package Exercicios_aula16_POO;

public class Aviao {
	
	// ESTADOS
	private String modelo;
	private String empresa;
	
	// COMPORTAMENTOS
	private boolean operação;
	private boolean estado;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public boolean isOperação() {
		return operação;
	}
	public void setOperação(boolean operação) {
		this.operação = operação;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void Imprimirvalores()
	{
		System.out.printf("Modelo: %s\nEmpresa: %s\nOperação: %s\nEstado: %s", 
				modelo, empresa, operação, estado);
	}
}
