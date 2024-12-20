/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Edgar Arias
 */
public class Problema08 {
    public static void main(String[] args) {
      
        double[][] dato1 = {{1, 2, 3}, {6, 8, 9}};
        double[][] dato2 = {{10, 1, 2}, {10, 9, 1}};

        
        double[][] resultado = new double[2][3];

        
        resultado[0][0] = dato1[0][0]; // 1
        resultado[0][1] = dato2[0][1]; // 1
        resultado[0][2] = dato2[0][2]; // 2
        resultado[1][0] = dato1[1][0]; // 6
        resultado[1][1] = dato1[1][1]; // 8
        resultado[1][2] = dato2[1][2]; // 1

        
        System.out.println("El arreglo generado es el siguiente:\n");
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                System.out.print((int) resultado[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


