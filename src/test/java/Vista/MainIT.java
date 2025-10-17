/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Modelo.Punto;    
import Modelo.Rectangulo;
/**
 *
 * @author oeara
 */
public class MainIT {
    
    @Test
    public void testFlujoCompletoRectangulo() {
        
        Rectangulo rect = new Rectangulo(new Punto(2, 2), new Punto(6, 5));
        assertEquals(12.0, rect.calcularArea(), 0.0001, "Área inicial incorrecta");

        
        rect.escalar(2.0);
        assertEquals(48.0, rect.calcularArea(), 0.0001, "Área después de escalar incorrecta");

        
        rect.moverHorizontal(3.0);
        assertTrue(rect.contiene(new Punto(8, 6)), "El punto (8,6) debe estar dentro tras mover horizontalmente");

        
        rect.moverVertical(2.0);
        assertTrue(rect.contiene(new Punto(8, 8)), "El punto (8,8) debe estar dentro tras mover verticalmente");

        
        assertFalse(rect.contiene(new Punto(20, 20)), "El punto (20,20) no debe estar dentro del rectángulo");

        
        String descripcion = rect.toString();
        assertTrue(descripcion.contains("Área"), "El texto debe incluir información del área");
        assertTrue(descripcion.contains("Coordenadas actuales"), "Debe mostrar coordenadas actuales");
    }
}
