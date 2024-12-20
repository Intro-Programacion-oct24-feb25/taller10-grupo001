/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Problema02 {
     public static void main(String[] args) {
    Scanner datos = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5]; 
        double[] suma = new double[2]; 

        for (int filas = 0; filas < vendedores.length; filas++) {
            for (int columna = 0; columna < 5; columna++) {
                System.out.printf("Ingrese las ventas diarias para %s (día %d): ", vendedores[filas], columna + 1);
                ventas[filas][columna] = datos.nextDouble(); 
                suma[filas] += ventas[filas][columna]; 
            }
        }

        System.out.println("\nResultados:");
        for (int filas = 0; filas < vendedores.length; filas++) {
            System.out.printf("El vendedor(a) %s ha realizado un total de: %.2f $ en ventas.%n", 
                vendedores[filas], suma[filas]);
        }
}
}
