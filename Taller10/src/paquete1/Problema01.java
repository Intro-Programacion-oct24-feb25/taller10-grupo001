/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[][] notas = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"jerry ponce ", "gabriela lewis", "david bell"};
        double suma = 0;
        double[] promedios = new double[3];

        for (int filas = 0; filas < notas.length; filas++) {
            for (int columnas = 0; columnas < notas[filas].length; columnas++) {
                suma = suma + notas[filas][columnas];

            }
            promedios[filas] = suma / notas[filas].length;
        }

    
    for (int i = 0; i< estudiantes.length; i++) {
            System.out.printf("%s tiene un promedio de: %.2f%n", estudiantes[i], promedios[i]);
    }
    }
}
