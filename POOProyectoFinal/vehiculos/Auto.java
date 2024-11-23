package POOProyectoFinal.vehiculos;

public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(String marca, double precio, int cilindraje, boolean tieneRadio, boolean tieneNavegador) {
        super(marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
        calcularImpuestoCirculacion();
        if (cilindraje > 2499) {
            this.cuotaMesGaraje *= 1.2; // Incremento del 20% por cilindraje alto
        }
    }

    @Override
    protected void calcularImpuestoCirculacion() {
        this.impuestoCirculacion = this.precio * 0.02;
        if (tieneRadio) {
            this.impuestoCirculacion += this.precio * 0.01; // Incremento del 1% si tiene radio
        }
        if (tieneNavegador) {
            this.impuestoCirculacion += this.precio * 0.02; // Incremento del 2% si tiene navegador
        }
    }
}