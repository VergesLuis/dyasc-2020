package ar.edu.untref.dyasc;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

	@Test
	public void obtenerSubSerieTest() {
		
		Fibonacci fi = new Fibonacci();
		String subSerie = fi.obtenerSubSerie(8);

		Assert.assertEquals("0 1 1 2 3 5 8 13 ", subSerie);
	}
	
	
	@Test
	public void entregoSumaDeSerieTest() {
		
		Fibonacci fi = new Fibonacci();
		int suma = fi.entregoSumaDeSerie(8);

		Assert.assertEquals(33, suma);
	}

}
