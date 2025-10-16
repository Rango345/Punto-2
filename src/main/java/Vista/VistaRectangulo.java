/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

import Modelo.Rectangulo;
import Modelo.Punto;
import javax.swing.JOptionPane;


/**
 *
 * @author oeara
 */
public class VistaRectangulo {
  public Rectangulo crearRectangulo() {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x1:"));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y1:"));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese x2:"));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese y2:"));

        return new Rectangulo(new Punto(x1, y1), new Punto(x2, y2));
    }

    public void mostrarMensaje(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public double leerNumero(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }

    public Punto leerPunto() {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese coordenada X del punto:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese coordenada Y del punto:"));
        return new Punto(x, y);
    }

    public int mostrarMenu() {
        String menu = """
        --- MENÚ RECTÁNGULO ---
        1. Crear rectángulo
        2. Mostrar área
        3. Escalar
        4. Mover horizontalmente
        5. Mover verticalmente
        6. Verificar si un punto está dentro
        7. Mostrar datos del rectángulo
        0. Salir
        """;
        String opcion = JOptionPane.showInputDialog(menu + "\nSeleccione una opción:");
        return (opcion != null && !opcion.isEmpty()) ? Integer.parseInt(opcion) : -1;
    }
}
