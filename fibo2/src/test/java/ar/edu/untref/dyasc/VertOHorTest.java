package ar.edu.untref.dyasc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class VertOHorTest {
	
	@Test
    public void Testhd() {

         VertOHor clase = new VertOHor();

        String[] cadena = clase.determinarOpcion("-o=hd", 12);
        String[] probar ={"0","1","1","2","3","5","8","13","21","34","55","89"};
        
        assertThat((cadena).equals(probar));        
    }
	
	
	@Test
    public void Testhi() {

         VertOHor clase = new VertOHor();

        String[] cadena = clase.determinarOpcion("-o=hi", 12);
        String[] probar ={"89","55","34","21","13","8","5","3","2","1","1","0"};
        
        assertThat((cadena).equals(probar));        
    }
}
