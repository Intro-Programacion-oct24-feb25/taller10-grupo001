/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {
    public static void main(String[] args) {
        String[][] estudiantes = {
            {"Sarah Ward", "Philip Payne"},
            {"Carrie Burton", "Lauren Rice"},
            {"Emma Escobar", "Lori Flores"},
            {"Steven West", "Toni Martin"}
        };

        String acumulador = ""; 

       
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                String nombre = estudiantes[i][j];

                
                if (nombre.length() == 11) {
                    acumulador += nombre + "\n"; 
                }
            }
        }

      
        System.out.println("Estudiantes con nombres de 11 caracteres:\n");
        System.out.println(acumulador);
    }
}


