/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import Modelo.Rectangulo;
import Modelo.Punto;
import javax.swing.JOptionPane;
/**
 *
 * @author oeara
 */
public class Main {
  public static void main(String[] args) {
        VistaRectangulo vista = new VistaRectangulo();
        Rectangulo rect = null;
        int opcion;

        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    rect = vista.crearRectangulo();
                    vista.mostrarMensaje("Rectángulo creado:\n" + rect);
                }
                case 2 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Primero debe crear un rectángulo.");
                    } else {
                        vista.mostrarMensaje("Área: " + rect.calcularArea());
                    }
                }
                case 3 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Primero debe crear un rectángulo.");
                    } else {
                        double factor = vista.leerNumero("Ingrese el factor de escala:");
                        rect.escalar(factor);
                        vista.mostrarMensaje("Rectángulo escalado:\n" + rect);
                    }
                }
                case 4 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Primero debe crear un rectángulo.");
                    } else {
                        double dx = vista.leerNumero("Ingrese desplazamiento horizontal:");
                        rect.moverHorizontal(dx);
                        vista.mostrarMensaje("Rectángulo movido:\n" + rect);
                    }
                }
                case 5 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Primero debe crear un rectángulo.");
                    } else {
                        double dy = vista.leerNumero("Ingrese desplazamiento vertical:");
                        rect.moverVertical(dy);
                        vista.mostrarMensaje("Rectángulo movido:\n" + rect);
                    }
                }
                case 6 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Primero debe crear un rectángulo.");
                    } else {
                        Punto p = vista.leerPunto();
                        if (rect.contiene(p)) {
                            vista.mostrarMensaje("El punto " + p + " está dentro del rectángulo.");
                        } else {
                            vista.mostrarMensaje("El punto " + p + " está fuera del rectángulo.");
                        }
                    }
                }
                case 7 -> {
                    if (rect == null) {
                        vista.mostrarMensaje("Aún no se ha creado un rectángulo.");
                    } else {
                        vista.mostrarMensaje("Datos del rectángulo actual:\n" + rect);
                    }
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Saliendo del progrma");
                default -> {
                    if (opcion != 0)
                        vista.mostrarMensaje("Opción no válida. Intente de nuevo.");
                }
            }

        } while (opcion != 0);
    }
}
