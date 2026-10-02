package com.estiven.descuentos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoTest {
    @Test
    void veintePorCientoDe20000Da16000() {
        //dado
        double precio = 20000;
        double porcentaje = 20;
        //cuando
        double resultado = Descuento.calcular(precio, porcentaje);
        //Entonces
        assertEquals(15000, resultado);
    }

    @Test
    void ceroPorCientoDejaElMismoPrecio() {
        assertEquals(20000, Descuento.calcular(20000, 0));
    }

    @Test
    void porcentajeMayorA100LanzaExcepcion() {
        assertThrows(IllegalArgumentException.class,
                () -> Descuento.calcular(20000, 150));
    }
}
