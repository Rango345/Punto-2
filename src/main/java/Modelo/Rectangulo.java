/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author oeara
 */
public class Rectangulo {
    private Punto p1; 
    private Punto p2; 

    
    private final Punto p1Original;
    private final Punto p2Original;

    
    public Rectangulo(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
        
        this.p1Original = new Punto(p1.getX(), p1.getY());
        this.p2Original = new Punto(p2.getX(), p2.getY());
    }

    
    public double calcularArea() {
        double base = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        return base * altura;
    }

    
    public void escalar(double factor) {
        double nuevoX = p1.getX() + (p2.getX() - p1.getX()) * factor;
        double nuevoY = p1.getY() + (p2.getY() - p1.getY()) * factor;
        p2 = new Punto(nuevoX, nuevoY);
    }

    
    public void moverHorizontal(double dx) {
        p1.mover(dx, 0);
        p2.mover(dx, 0);
    }

    
    public void moverVertical(double dy) {
        p1.mover(0, dy);
        p2.mover(0, dy);
    }

    
    public boolean contiene(Punto p) {
        double minX = Math.min(p1.getX(), p2.getX());
        double maxX = Math.max(p1.getX(), p2.getX());
        double minY = Math.min(p1.getY(), p2.getY());
        double maxY = Math.max(p1.getY(), p2.getY());
        return (p.getX() >= minX && p.getX() <= maxX &&
                p.getY() >= minY && p.getY() <= maxY);
    }

    
    @Override
    public String toString() {
        double base = Math.abs(p2.getX() - p1.getX());
        double altura = Math.abs(p2.getY() - p1.getY());
        double area = calcularArea();

        return """
               ────────────────────────────────
               Información del Rectángulo
               ────────────────────────────────
               Coordenadas actuales:
               p1: %s
               p2: %s

               Dimensiones:
               Base: %.2f
               Altura: %.2f
               Área: %.2f

               Coordenadas originales:
               p1: %s
               p2: %s
               ────────────────────────────────
               """.formatted(p1, p2, base, altura, area, p1Original, p2Original);
    }
}
