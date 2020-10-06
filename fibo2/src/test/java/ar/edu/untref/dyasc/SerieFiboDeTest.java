package ar.edu.untref.dyasc;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class SerieFiboDeTest {

    @Test
    public void unTestBasico() {

        SerieFibo clase = new SerieFibo();

        String cadena = clase.getSubserie(5);

        assertThat(cadena).isEqualTo("0 1 1 2 3");
        
        
    }
    @Test
    public void otroTestBasico() {

        SerieFibo clase = new SerieFibo();

        String cadena2 = clase.getSubserie(8);

        
        assertThat(cadena2).isEqualTo("0 1 1 2 3 5 8 13");
        
    }

}


