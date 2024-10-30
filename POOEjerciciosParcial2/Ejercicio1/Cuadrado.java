package Ejercicio1;

public class Cuadrado extends Forma implements IFormas {
    private double lado;

    // Constructor
    public Cuadrado(String nombre, double posicionX, double posicionY, String color, double lado) {
        super(nombre, posicionX, posicionY, color);
        this.lado = lado;
    }

    // Método para calcular el área
    @Override
    public double calcularArea() {
        return lado * lado;
    }

    // Método para calcular el perímetro
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }

    // Getters y Setters
    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
}