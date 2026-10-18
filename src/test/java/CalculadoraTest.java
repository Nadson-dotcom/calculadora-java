
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarDoisNumeros() {
        assertEquals(8.0, calculadora.soma(5.0, 3.0), 0.0001);
    }

    @Test
    void deveSubtrairDoisNumeros() {
        assertEquals(2.0, calculadora.subtrair(5.0, 3.0), 0.0001);
    }

    @Test
    void deveMultiplicarDoisNumeros() {
        assertEquals(15.0, calculadora.multiplicar(5.0, 3.0), 0.0001);
    }

    @Test
    void deveDividirDoisNumeros() {
        assertEquals(2.0, calculadora.dividir(6.0, 3.0), 0.0001);
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(
                ArithmeticException.class,
                () -> calculadora.dividir(6.0, 0.0)
        );
    }
}

