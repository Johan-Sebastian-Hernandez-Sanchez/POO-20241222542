package Ejercicio15;

public class Prueba {
    public static void main(String[] args) {
        CambioRelaciones cambio1 = new CambioRelaciones(10);
        CambioRelaciones cambio2 = new CambioRelaciones(20);

        System.out.println("cambio1 es mayor que cambio2: " + cambio1.esMayor(cambio2));
        System.out.println("cambio1 es menor que cambio2: " + cambio1.esMenor(cambio2));
        System.out.println("cambio1 es igual a cambio2: " + cambio1.esIgual(cambio2));
    }
}