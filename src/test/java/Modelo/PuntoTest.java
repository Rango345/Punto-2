/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

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
public class PuntoTest {
    
 @Test
    public void testConstructor() {
        Punto p = new Punto(3.5, -2.0);
        assertEquals(3.5, p.getX(), 0.0001);
        assertEquals(-2.0, p.getY(), 0.0001);
    }

    @Test
    public void testMover() {
        Punto p = new Punto(2.0, 3.0);
        p.mover(4.0, -1.0);

        assertEquals(6.0, p.getX(), 0.0001);
        assertEquals(2.0, p.getY(), 0.0001);
    }
}
