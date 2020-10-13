package ar.edu.untref.dyasc;

//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CrearCadenaOpcionesTest {

	@Test
	public void obtenerCadenaOpcionestest() {
		
		CrearCadenaOpciones cco = new CrearCadenaOpciones("-o=hi", "-f=Hola", "-m=l");
		String cadenaOpciones = cco.obtenerCadenaOpciones();
		
		Assert.assertEquals("HFL", cadenaOpciones);
	}

}
