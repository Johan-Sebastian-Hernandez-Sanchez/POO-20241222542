/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;
//En una tienda de computadoras se planea ofrecer a los clientes un descuento que depender del número de equipos que compre. Si las computadoras son menos de cinco se les dará un 10% de descuento sobre el total de la compra; si el número de computadoras es mayor o igual a cinco pero menos de diez se le otorga un 20% de descuento; y si son 10 o más se les da un 40% de descuento. El precio de cada computadora es de U$500.
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Precio de cada computadora
        final double PRECIO_COMPUTADORA = 500.00;
        double descuento = 0.0;
        double totalAPagar;       
        // Solicitar al usuario el número de computadoras
        System.out.print("Ingrese el número de computadoras que desea comprar: ");
        int numeroComputadoras = scanner.nextInt();       
        // Calcular el descuento según el número de computadoras
        if (numeroComputadoras < 5) {
            descuento = 0.10;  // 10% de descuento
        } else if (numeroComputadoras >= 5 && numeroComputadoras < 10) {
            descuento = 0.20;  // 20% de descuento
        } else if (numeroComputadoras >= 10) {
            descuento = 0.40;  // 40% de descuento
        }
        // Calcular el total sin descuento
        double totalSinDescuento = numeroComputadoras * PRECIO_COMPUTADORA;
        // Aplicar el descuento
        double montoDescuento = totalSinDescuento * descuento;
        totalAPagar = totalSinDescuento - montoDescuento;
        // Mostrar resultados
        System.out.println("El precio sin descuento es: $" + totalSinDescuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("El total a pagar es: $" + totalAPagar);
        // Dependiendo del número de computadoras
        switch (numeroComputadoras) {
            case 1:
                System.out.println("¡Gracias por su compra! Compró una computadora.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("¡Gracias por su compra! Compró " + numeroComputadoras + " computadoras.");
                break;
            default:
                System.out.println("¡Gracias por su compra! Aprovechó un descuento especial.");
                break;
        }
        for (int i = 0; i < numeroComputadoras; i++) {
            System.out.println("Gracias por comprar con nosotros!");
        }
        scanner.close();
    }
}