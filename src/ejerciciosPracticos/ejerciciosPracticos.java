package ejerciciosPracticos;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebek
 */
public class ejerciciosPracticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio3
//        Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
//en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.

    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.nextLine();
        String min = frase.toLowerCase();
        String may = frase.toUpperCase();
        System.out.println("Minuscula: " +min);
        System.out.println("Mayuscula: " +may);
    
    }
    
}
