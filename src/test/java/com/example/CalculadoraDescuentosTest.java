package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDescuentosTest {
    
    @Test
    void testDescuentoNormal() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(80.0, calc.calcularPrecioFinal(100.0, 20.0));
    }

    @Test
    void testDescuentoCero() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(100.0, calc.calcularPrecioFinal(100.0, 0.0));
    }

    @Test
    void testDescuentoCien() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertEquals(0.0, calc.calcularPrecioFinal(100.0, 100.0));
    }

    @Test
    void testPrecioNegativo() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertThrows(IllegalArgumentException.class, () -> calc.calcularPrecioFinal(-10.0, 20.0));
    }

    @Test
    void testDescuentoInvalido() {
        CalculadoraDescuentos calc = new CalculadoraDescuentos();
        assertThrows(IllegalArgumentException.class, () -> calc.calcularPrecioFinal(100.0, 150.0));
    }
}