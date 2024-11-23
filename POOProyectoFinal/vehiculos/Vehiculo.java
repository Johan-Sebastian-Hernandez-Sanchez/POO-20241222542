package POOProyectoFinal.vehiculos;

// Clase base Vehiculo
public abstract class Vehiculo {
    protected String placa;
    protected String marca; // 'protected' permite acceso en subclases y el paquete.

    // Getter para 'marca'
    public String getMarca() {
        return marca;
    }

    // Otros métodos y código de la clase.

    protected double precio;
    protected int cilindraje;
    protected double impuestoCirculacion;
    protected double cuotaMesGaraje;

    // Constante para la cuota mensual por defecto
    private static final double CUOTA_DEFAULT = 100;

    public Vehiculo(String marca, double precio, int cilindraje) {
        this.placa = null; // Por defecto sin matrícula
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje = CUOTA_DEFAULT;
        calcularImpuestoCirculacion();
    }

    // Métodos getter y setter
    public String getPlaca() {
        return placa;
    }

    public boolean setPlaca(String placa) {
        if (placa != null && placa.length() == 6) {
            this.placa = placa;
            return true;
        }
        return false;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuota) {
        if (cuota >= 0) {
            this.cuotaMesGaraje = cuota;
        } else {
            throw new IllegalArgumentException("La cuota no puede ser negativa.");
        }
    }

    // Métodos abstractos
    protected abstract void calcularImpuestoCirculacion();
}