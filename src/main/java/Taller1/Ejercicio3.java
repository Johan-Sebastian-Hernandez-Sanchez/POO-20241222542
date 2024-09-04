/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;
//Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA, de algún aparato, si esta cuesta U$500 o más. Además, independientemente de esto, ofrece un 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara, con IVA incluido, un cliente cualquiera por la compra de su aparato. El IVA es del 19%.
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        double precioReproductor, precioFinal, descuentoTotal = 0.0;
        final double IVA = 0.19;
        final double DESCUENTO_PRECIO = 0.10;
        final double DESCUENTO_MARCA = 0.05;
        // Solicitar al usuario el precio del reproductor y la marca
        System.out.print("Ingrese el precio del reproductor: $");
        precioReproductor = scanner.nextDouble();
        System.out.print("Ingrese la marca del reproductor: ");
        String marca = scanner.next();
        // Aplicar descuento por precio
        if (precioReproductor >= 500) {
            descuentoTotal += precioReproductor * DESCUENTO_PRECIO;
        }
        // Aplicar descuento por marca
        if (marca.equalsIgnoreCase("NOSY")) {
            descuentoTotal += precioReproductor * DESCUENTO_MARCA;
        }
        // Precio final con descuentos
        precioFinal = precioReproductor - descuentoTotal;        
        // Precio final con IVA
        double totalConIVA = precioFinal * (1 + IVA);        
        // Mostrar resultados
        System.out.println("Precio sin descuentos: $" + precioReproductor);
        System.out.println("Total descuentos aplicados: $" + descuentoTotal);
        System.out.println("Precio final antes de IVA: $" + precioFinal);
        System.out.println("Precio final con IVA: $" + totalConIVA);
        switch (marca.toLowerCase()) {
            case "nosy":
                System.out.println("Aprovechó un descuento adicional por la marca NOSY.");
                break;
            default:
                System.out.println("No obtuvo un descuento adicional por marca.");
                break;
        }
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("Paso " + (i + 1) + ": Precio original: $" + precioReproductor);
                    break;
                case 1:
                    System.out.println("Paso " + (i + 1) + ": Descuento total: $" + descuentoTotal);
                    break;
                case 2:
                    System.out.println("Paso " + (i + 1) + ": Precio final con IVA: $" + totalConIVA);
                    break;
            }
        }
        scanner.close();
    }
}
