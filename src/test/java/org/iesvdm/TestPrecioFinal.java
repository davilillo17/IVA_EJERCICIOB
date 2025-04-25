package org.iesvdm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestPrecioFinal {

    @Test
    void testReducidoConMitad() {
        double resultado = CalculamosPrecioFinal.calcularPrecioFinal(25, "reducido", "mitad");
        assertEquals(13.75, resultado, 0.01);
    }

    @Test
    void testSuperreducidoConMeno5() {
        double resultado = CalculamosPrecioFinal.calcularPrecioFinal(50, "superreducido", "meno5");
        assertEquals(47.0, resultado, 0.01);
    }

    @Test
    void testGeneralCon5porc() {
        double resultado = CalculamosPrecioFinal.calcularPrecioFinal(100, "general", "5porc");
        assertEquals(114.95, resultado, 0.01);
    }

    @Test
    void testReducidoConNopro() {
        double resultado = CalculamosPrecioFinal.calcularPrecioFinal(40, "reducido", "nopro");
        assertEquals(44.0, resultado, 0.01);
    }
}
