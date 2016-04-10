package ar.edu.unlam.tallerweb.triangulo;

import org.junit.Assert;
import org.junit.Test;



public class testTriangulo {

	@Test
	public void testCalculaArea() {
		
		Triangulo area = new Triangulo();
		Integer cantidadEsperada = 5;
		area.calculaArea(2,5);
		Integer cantidadObtenida = area.mostrarResultado();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	
	}
	
	@Test
	public void testCalculaPerimetro(){
		
		Triangulo perimetro = new Triangulo();
		Integer cantidadEsperada = 15;
		perimetro.calcularPerimetro(5);
		Integer cantidadObtenida = perimetro.mostrarResultado();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	}

}
