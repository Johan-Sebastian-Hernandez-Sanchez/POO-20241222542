package Ejercicio1;

public class Triangulo extends Forma implements IFormas {
    private double base;
    private double altura;

    // Constructor
    public Triangulo(String nombre, double posicionX, double posicionY, String color, double base, double altura) {
        super(nombre, posicionX, posicionY, color);
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    // Método para calcular el perímetro (triángulo isósceles)
    @Override
    public double calcularPerimetro() {
        double lado = Math.sqrt((base / 2) * (base / 2) + altura * altura);
        return 2 * lado + base;
    }

    // Getters y Setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}