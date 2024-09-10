/*Una frutería ofrece las manzanas con descuento según la siguiente tabla:
NUM. DE KILOS COMPRADOS % DESCUENTO
0 - 2 0%
2.01 - 5 10%
5.01 - 10 15%
10.01 en adelante 20%
Determinar cuánto pagara una persona que compre manzanas es esa frutería.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        double kilosComprados, precioPorKilo = 3.00; // Precio por kilo de manzanas
        double descuento = 0.0, totalAPagar;
        
        // Solicitar al usuario la cantidad de kilos de manzanas que desea comprar
        System.out.print("Ingrese la cantidad de kilos de manzanas que desea comprar: ");
        kilosComprados = scanner.nextDouble();
        
        // Porcentaje de descuento según los kilos comprados
        if (kilosComprados > 0 && kilosComprados <= 2) {
            descuento = 0.0;
        } else if (kilosComprados > 2 && kilosComprados <= 5) {
            descuento = 0.10;
        } else if (kilosComprados > 5 && kilosComprados <= 10) {
            descuento = 0.15;
        } else if (kilosComprados > 10) {
            descuento = 0.20;
        }
        
        // Calcular el total a pagar sin descuento
        double totalSinDescuento = kilosComprados * precioPorKilo;
        
        // Calcular el total de descuento
        double montoDescuento = totalSinDescuento * descuento;
        
        // Calcular el total a pagar con descuento
        totalAPagar = totalSinDescuento - montoDescuento;
        
        // Mostrar resultados
        System.out.println("Precio por kilo: $" + precioPorKilo);
        System.out.println("Total sin descuento: $" + totalSinDescuento);
        System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("Total a pagar: $" + totalAPagar);
        
        // Kilos comprados
        int rangoKilos = (int) (kilosComprados / 5);
        switch (rangoKilos) {
            case 0:
                System.out.println("Compró menos de 5 kilos.");
                break;
            case 1:
                System.out.println("Compró entre 5 y 10 kilos.");
                break;
            default:
                System.out.println("Compró más de 10 kilos.");
                break;
        }
        
        for (int i = 1; i <= kilosComprados; i++) {
            System.out.println("Gracias por comprar " + i + " kilo(s) de manzanas.");
        }
        
        scanner.close();
    }
}

