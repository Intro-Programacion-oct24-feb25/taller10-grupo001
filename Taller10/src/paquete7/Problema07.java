/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete7;

/**
 *
 * @author Edgar Arias
 */
public class Problema07 {

    public static void main(String[] args) {

        double[][] dato1 = {{0, 2, 0}, {1, 0, 0}};
        //double[][] dato1 = {{0, 0, 0}, {0, 0, 0}};

        boolean esNulo = esArregloNulo(dato1);

        if (esNulo) {
            System.out.println("El arreglo es NULO (la suma de sus elementos es 0).");
        } else {
            System.out.println("El arreglo NO es NULO (la suma de sus elementos no es 0).");
        }
    }

    public static boolean esArregloNulo(double[][] arreglo) {
        double suma = 0;

        
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                suma += arreglo[i][j];
            }
        }
        return false;

    }
}

