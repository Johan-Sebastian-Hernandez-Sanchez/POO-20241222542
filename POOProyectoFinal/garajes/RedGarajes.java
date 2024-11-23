package POOProyectoFinal.garajes;

import java.util.ArrayList;

public class RedGarajes {
    private ArrayList<Garaje> garajes;

    public RedGarajes() {
        this.garajes = new ArrayList<>();
    }

    public void agregarGaraje(Garaje garaje) {
        garajes.add(garaje);
        System.out.println("Garaje agregado a la red.");
    }

    public void eliminarGaraje(String nombreGaraje) {
        garajes.removeIf(g -> g.getNombreGaraje().equals(nombreGaraje));
        System.out.println("Garaje eliminado de la red.");
    }

    public Garaje buscarGaraje(String nombreGaraje) {
        for (Garaje garaje : garajes) {
            if (garaje.getNombreGaraje().equals(nombreGaraje)) {
                return garaje;
            }
        }
        return null;
    }

    public void listarTodosVehiculos() {
        for (Garaje garaje : garajes) {
            garaje.listarVehiculos();
        }
    }

    public double calcularIngresosTotales() {
        double total = 0;
        for (Garaje garaje : garajes) {
            total += garaje.calcularIngresos();
        }
        return total;
    }
}