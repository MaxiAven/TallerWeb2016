package ar.edu.unlam.tallerweb.triangulo;

public class Triangulo {
	
	private Integer base = 0;
	private Integer altura = 0;
	private Integer resultado = 0;

	public void calculaArea(){
		
		resultado=(base*altura)/2;
		
	}
	
	public void calcularPerimetro(){
		
		resultado= base * 3;
		
	}
	
	public Integer mostrarResultado(){
		return resultado;
		
	}
}
