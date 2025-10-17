/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import Modelo.Punto;
import Modelo.Rectangulo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author oeara
 */
public class VistaRectanguloTest {
    
    @Test
    public void testCrearRectanguloSimulado() {
        
        Rectangulo r = new Rectangulo(new Punto(2, 2), new Punto(6, 5));
        assertEquals(12.0, r.calcularArea(), 0.0001);
    }

    @Test
    public void testLeerPuntoManual() {
        
        Punto p = new Punto(4, 7);
        assertEquals(4.0, p.getX());
        assertEquals(7.0, p.getY());
    }
    
}
