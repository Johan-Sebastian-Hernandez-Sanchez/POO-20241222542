/*Estudiante: Johan Sebastián Hernández Sánchez
Codigo: 20241222542
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcialdepoo20241222542;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Parcialdepoo20241222542 {
    public static void main(String[] args) {
        int numPilotos = 10; // Número de pilotos
        int[][] tiempos = new int[numPilotos][5];
        Random rand = new Random();
        
        for (int i = 0; i < numPilotos; i++) {
            tiempos[i][0] = 90 + rand.nextInt(31); // Practica 1: 90-120
            tiempos[i][1] = 90 + rand.nextInt(31); // Practica 2: 90-120
            tiempos[i][2] = (int) (0.9 * (tiempos[i][0] + tiempos[i][1]) / 2); // Clasificación: 10% más rápido
            tiempos[i][3] = 85 + rand.nextInt(31); // Sprint: 85-115
            tiempos[i][4] = 85 + rand.nextInt(31); // Carrera: 85-115
        }
        
        Scanner scanner = new Scanner(System.in);
        
        // Reporte de piloto
        System.out.print("Ingrese el número del piloto (0 a " + (numPilotos - 1) + "): ");
        int pilotoSeleccionado = scanner.nextInt();
        
        if (pilotoSeleccionado >= 0 && pilotoSeleccionado < numPilotos) {
            int tiempo1 = tiempos[pilotoSeleccionado][0];
            int tiempo2 = tiempos[pilotoSeleccionado][1];
            int tiempoClasificacion = tiempos[pilotoSeleccionado][2];
            int tiempoSprint = tiempos[pilotoSeleccionado][3];
            int tiempoCarrera = tiempos[pilotoSeleccionado][4];
            double promedio = (tiempo1 + tiempo2 + tiempoClasificacion + tiempoSprint + tiempoCarrera) / 5.0;
            
            System.out.println("No. Piloto: " + pilotoSeleccionado);
            System.out.println("Tiempo Practica 1: " + tiempo1);
            System.out.println("Tiempo Practica 2: " + tiempo2);
            System.out.println("Tiempo Clasificación: " + tiempoClasificacion);
            System.out.println("Tiempo Sprint: " + tiempoSprint);
            System.out.println("Tiempo Carrera: " + tiempoCarrera);
            System.out.printf("Promedio general del fin de semana: %.2f\n", promedio);
        } else {
            System.out.println("Número de piloto no válido.");
        }
        
        double promedioGeneral = 0;
        int pilotoMasRapido = 0, pilotoMasLento = 0;
        int tiempoMasRapido = Integer.MAX_VALUE, tiempoMasLento = Integer.MIN_VALUE;
        double[] promedios = new double[numPilotos];
        
        for (int i = 0; i < numPilotos; i++) {
            int sumaTiempos = 0;
            for (int j = 0; j < 5; j++) {
                sumaTiempos += tiempos[i][j];
            }
            promedios[i] = sumaTiempos / 5.0;
            promedioGeneral += promedios[i];
            
            if (promedios[i] < tiempoMasRapido) {
                tiempoMasRapido = (int) promedios[i];
                pilotoMasRapido = i;
            }
            if (promedios[i] > tiempoMasLento) {
                tiempoMasLento = (int) promedios[i];
                pilotoMasLento = i;
            }
        }
        
        promedioGeneral /= numPilotos;
        
        System.out.printf("Promedio del fin de semana de todos los pilotos: %.2f\n", promedioGeneral);
        System.out.println("Piloto más rápido: " + pilotoMasRapido + " con tiempo " + tiempoMasRapido);
        System.out.println("Piloto más lento: " + pilotoMasLento + " con tiempo " + tiempoMasLento);
        
        // Eveeto más rápido
        double[] promediosEventos = new double[5];
        for (int j = 0; j < 5; j++) {
            double sumaEventos = 0;
            for (int i = 0; i < numPilotos; i++) {
                sumaEventos += tiempos[i][j];
            }
            promediosEventos[j] = sumaEventos / numPilotos;
        }
        
        double menorPromedio = promediosEventos[0];
        int eventoMasRapido = 0;
        for (int j = 1; j < 5; j++) {
            if (promediosEventos[j] < menorPromedio) {
                menorPromedio = promediosEventos[j];
                eventoMasRapido = j;
            }
        }
        
        String[] nombresEventos = {"Practica 1", "Practica 2", "Clasificación", "Sprint", "Carrera"};
        System.out.printf("Evento más rápido en promedio del fin de semana: %s con tiempo promedio %.2f\n", 
                          nombresEventos[eventoMasRapido], menorPromedio);
        
        scanner.close();
    }
}