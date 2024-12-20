/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;
/**
 *
 * @author reroes
 */
import java.util.Scanner;
public class Problema04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] datos = new double[2][2];
        int fueraRango = 0; 

        
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.print("Ingrese un número para datos[" + i + "][" + j + "]: ");
                double valor = scanner.nextDouble();

                if (valor >= 1000 && valor <= 1199) {
                    datos[i][j] = valor; 
                } else {
                    datos[i][j] = 10; 
                    fueraRango++;   
                }
            }
        }

      
        System.out.println("\nContenido del arreglo:");
        for (double[] dato : datos) {
            for (int j = 0; j < dato.length; j++) {
                System.out.print(dato[j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nCantidad de valores fuera de rango: " + fueraRango);
    }
}

