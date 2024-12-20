/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int fueraDeRango = 0; 

        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print("Ingrese un número para datos[" + i + "][" + j + "]: ");
                double valor = scanner.nextDouble();

                if (valor >= 1000 && valor <= 1199) {
                    datos[i][j] = valor; 
                } else {
                    datos[i][j] = 10; 
                    fueraDeRango++;  
                }
            }
        }

      
        System.out.println("\nContenido del arreglo:");
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print(datos[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nCantidad de valores fuera de rango: " + fueraDeRango);
    }
}

