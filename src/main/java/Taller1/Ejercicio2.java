/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;
//En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”, que consiste en lo siguiente:
//Si se compran menos de cinco llantas el precio es de U$100 cada una, de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.
//Obtener la cantidad de dinero que una persona tiene que pagar por cada una de las llantas que compra y la que tiene que pagar por el total de la compra.
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Variables
        double precioPorLlanta = 0.0;
        double totalAPagar;
        // Solicitar al usuario el número de llantas
        System.out.print("Ingrese el número de llantas que desea comprar: ");
        int numeroLlantas = scanner.nextInt();
        // Determinar el precio por llanta según la cantidad
        if (numeroLlantas < 5) {
            precioPorLlanta = 100.00;
        } else if (numeroLlantas >= 5 && numeroLlantas <= 10) {
            precioPorLlanta = 75.00;
        } else if (numeroLlantas > 10) {
            precioPorLlanta = 50.00;
        }
        // Calcular el total a pagar
        totalAPagar = numeroLlantas * precioPorLlanta;
        // Mostrar resultados
        System.out.println("El precio por llanta es: $" + precioPorLlanta);
        System.out.println("El total a pagar por " + numeroLlantas + " llantas es: $" + totalAPagar);
        // Cantidad de llantas
        switch (numeroLlantas) {
            case 1:
                System.out.println("Compró una llanta.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Compró " + numeroLlantas + " llantas.");
                break;
            default:
                System.out.println("Aprovechó un descuento por comprar " + numeroLlantas + " llantas.");
                break;
        }
        for (int i = 1; i <= numeroLlantas; i++) {
            System.out.println("Llanta " + i + ": $" + precioPorLlanta);
        }
        scanner.close();
    }
}
