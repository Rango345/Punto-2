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
public class RectanguloTest {
    
 @Test
    public void testCalcularArea() {
       
        Rectangulo r = new Rectangulo(new Punto(2, 2), new Punto(6, 5));
        double area = r.calcularArea();
        assertEquals(12.0, area, 0.0001, "El área debe ser 12.0");
    }

    @Test
    public void testEscalar() {
        
        Rectangulo r = new Rectangulo(new Punto(1, 1), new Punto(3, 4));
        r.escalar(2.0);
        double nuevaArea = r.calcularArea();
        assertEquals(24.0, nuevaArea, 0.0001, "El área debe duplicarse correctamente");
    }

    @Test
    public void testMoverHorizontal() {
        Rectangulo r = new Rectangulo(new Punto(0, 0), new Punto(2, 2));
        r.moverHorizontal(3.0);

        
        assertEquals(3.0, r.contiene(new Punto(3, 1)) ? 3.0 : 0.0, 0.0001);
        assertTrue(r.contiene(new Punto(4, 1)), "El punto (4,1) debe estar dentro después de mover");
    }

    @Test
    public void testMoverVertical() {
        Rectangulo r = new Rectangulo(new Punto(0, 0), new Punto(2, 2));
        r.moverVertical(2.0);

        
        assertTrue(r.contiene(new Punto(1, 3)), "El punto (1,3) debe estar dentro después de mover");
        assertFalse(r.contiene(new Punto(1, 0)), "El punto (1,0) ya no debe estar dentro");
    }

    @Test
    public void testContiene() {
        Rectangulo r = new Rectangulo(new Punto(2, 2), new Punto(6, 5));

        
        assertTrue(r.contiene(new Punto(4, 3)), "El punto (4,3) debe estar dentro del rectángulo");

        
        assertFalse(r.contiene(new Punto(7, 6)), "El punto (7,6) no debe estar dentro del rectángulo");
    }
    
}
