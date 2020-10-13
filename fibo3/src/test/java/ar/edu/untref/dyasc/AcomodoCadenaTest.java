package ar.edu.untref.dyasc;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AcomodoCadenaTest {

	@Test
	public void test() {
		
		AcomodoCadena ac = new AcomodoCadena("0 1 1 2 3 5 8 13 21 34", "-o=hi");
		String cadenaAcomodada = ac.cadenaAcomoada();
		Assert.assertEquals("34 21 13 8 5 3 2 1 1 0 ", cadenaAcomodada);
	
	}

}
