package ar.edu.untref.dyasc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculadoraTest {

    @Test
    public void cuandoSeSuman0Con0SeObtiene0() {

        Calculadora calculadora = new Calculadora();

        Integer resultado = calculadora.sumar(0, 0);

        assertThat(resultado).isEqualTo(0);

    }

    @Test
    public void cuandoSeSuma1Con1SeObtiene2() {

        Calculadora calculadora = new Calculadora();

        Integer resultado = calculadora.sumar(1, 1);

        assertThat(resultado).isEqualTo(2);

    }

    @Test
    public void cuandoSeSuma1Con2SeObtiene3() {

        Calculadora calculadora = new Calculadora();

        Integer resultado = calculadora.sumar(1, 2);

        assertThat(resultado).isEqualTo(3);

    }
    
}
