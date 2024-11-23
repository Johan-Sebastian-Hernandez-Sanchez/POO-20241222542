package POOProyectoFinal.garajes;

import POOProyectoFinal.vehiculos.Vehiculo;

public class Garaje {
    private String nombreGaraje;

    // Getter para 'nombreGaraje'
    public String getNombreGaraje() {
        return nombreGaraje;
    }

    // Otros métodos de la clase

    private Vehiculo[] espacios;
    private int capacidad;
    private int ocupacionActual;
    private int maxMotosPermitidas;
    private int numMotos;

    public Garaje(String nombreGaraje, int capacidad, int maxMotosPermitidas) {
        this.nombreGaraje = nombreGaraje;
        this.capacidad = capacidad;
        this.espacios = new Vehiculo[capacidad];
        this.ocupacionActual = 0;
        this.maxMotosPermitidas = maxMotosPermitidas;
        this.numMotos = 0;
    }

    public boolean alquilarEspacio(Vehiculo vehiculo) {
        if (ocupacionActual >= capacidad) {
            System.out.println("El garaje está lleno.");
            return false;
        }
        if (vehiculo instanceof POOProyectoFinal.vehiculos.Moto && numMotos >= maxMotosPermitidas) {
            System.out.println("El garaje ha alcanzado el límite de motos permitidas.");
            return false;
        }
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i] == null) {
                espacios[i] = vehiculo;
                ocupacionActual++;
                if (vehiculo instanceof POOProyectoFinal.vehiculos.Moto) {
                    numMotos++;
                }
                System.out.println("Vehículo alquilado en el garaje.");
                return true;
            }
        }
        return false;
    }

    public boolean retirarEspacio(String placa) {
        for (int i = 0; i < capacidad; i++) {
            if (espacios[i] != null && espacios[i].getPlaca().equals(placa)) {
                if (espacios[i] instanceof POOProyectoFinal.vehiculos.Moto) {
                    numMotos--;
                }
                espacios[i] = null;
                ocupacionActual--;
                System.out.println("Vehículo retirado del garaje.");
                return true;
            }
        }
        System.out.println("No se encontró un vehículo con esa placa.");
        return false;
    }

    public double calcularIngresos() {
        double total = 0;
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo != null) {
                total += vehiculo.getCuotaMesGaraje();
            }
        }
        return total;
    }

    public void listarVehiculos() {
        System.out.println("Vehículos en el garaje " + nombreGaraje + ":");
        for (Vehiculo vehiculo : espacios) {
            if (vehiculo != null) {
                System.out.println("- Placa: " + vehiculo.getPlaca() + ", Marca: " + vehiculo.getMarca());
            }
        }
    }

    public int getOcupacionActual() {
        return ocupacionActual;
    }

    public int getNumMotos() {
        return numMotos;
    }
}