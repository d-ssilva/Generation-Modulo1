package Exercicios_aula16_POO;

public class Aviao {
	
	// ESTADOS
	private String modelo;
	private String empresa;
	
	// COMPORTAMENTOS
	private boolean opera��o;
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
	public boolean isOpera��o() {
		return opera��o;
	}
	public void setOpera��o(boolean opera��o) {
		this.opera��o = opera��o;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	public void Imprimirvalores()
	{
		System.out.printf("Modelo: %s\nEmpresa: %s\nOpera��o: %s\nEstado: %s", 
				modelo, empresa, opera��o, estado);
	}
}
