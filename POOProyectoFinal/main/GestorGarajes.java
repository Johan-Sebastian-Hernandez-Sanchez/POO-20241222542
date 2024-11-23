package POOProyectoFinal.main;

import POOProyectoFinal.vehiculos.*;
import POOProyectoFinal.garajes.*;
import java.util.Scanner;

public class GestorGarajes {
    public static void main(String[] args) {
        RedGarajes red = new RedGarajes();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Gestión de Garajes ---");
            System.out.println("1. Crear Garaje");
            System.out.println("2. Alquilar espacio");
            System.out.println("3. Retirar vehículo");
            System.out.println("4. Listar vehículos");
            System.out.println("5. Calcular ingresos totales");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Nombre del garaje: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Capacidad del garaje: ");
                    int capacidad = scanner.nextInt();
                    System.out.print("Máximo de motos permitido: ");
                    int maxMotos = scanner.nextInt();
                    red.agregarGaraje(new Garaje(nombre, capacidad, maxMotos));
                }
                case 2 -> {
                    System.out.print("Nombre del garaje: ");
                    String nombreGaraje = scanner.nextLine();
                    Garaje garaje = red.buscarGaraje(nombreGaraje);
                    if (garaje != null) {
                        System.out.print("Placa del vehículo: ");
                        String placa = scanner.nextLine();
                        System.out.print("Tipo de vehículo (1: Moto, 2: Auto, 3: Camion): ");
                        int tipo = scanner.nextInt();
                        // Creación de vehículo según tipo
                        Vehiculo vehiculo;
                        if (tipo == 1) {
                            vehiculo = new Moto("Genérica", 5000, 250, false);
                        } else if (tipo == 2) {
                            vehiculo = new Auto("Genérica", 10000, 1600, true, false);
                        } else {
                            vehiculo = new Camion("Genérica", 20000, 3000, 2, 10);
                        }
                        vehiculo.setPlaca(placa);
                        garaje.alquilarEspacio(vehiculo);
                    } else {
                        System.out.println("Garaje no encontrado.");
                    }
                }
                case 3 -> {
                    System.out.print("Nombre del garaje: ");
                    String nombreGaraje = scanner.nextLine();
                    Garaje garaje = red.buscarGaraje(nombreGaraje);
                    if (garaje != null) {
                        System.out.print("Placa del vehículo: ");
                        String placa = scanner.nextLine();
                        garaje.retirarEspacio(placa);
                    } else {
                        System.out.println("Garaje no encontrado.");
                    }
                }
                case 4 -> {
                    red.listarTodosVehiculos();
                }
                case 5 -> {
                    System.out.println("Ingresos totales: $" + red.calcularIngresosTotales());
                }
                case 6 -> {
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
}