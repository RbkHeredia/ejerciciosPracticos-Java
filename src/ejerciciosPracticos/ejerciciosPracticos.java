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
        //ejercicio4
//        Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
//Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados celsius");
        int celsius = read.nextInt();
        int F = 32 + (9 * celsius / 5);
        System.out.println(celsius + "°, equivalen a " + F + "F°");
    
    }
    
}
