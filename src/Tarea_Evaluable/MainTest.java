package Tarea_Evaluable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void crearFigura() {
        String [] separador = {"Circulo", "2"};
        Main.crearFigura(separador);
        assertEquals(1, Main.Figuras.size());
    }

    @Test
    void menu() {
    }

    @Test
    void ejecucion() {
    }

    @Test
    void area() {
    }

    @Test
    void perimetro() {
    }

    @Test
    void duplica() {
    }

    @Test
    void dividir2() {
    }
}
