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
        //ejercicio5
//        Escribir un programa que lea un número entero por teclado y muestre por pantalla el
//doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int number = read.nextInt();
        doubleNum(number);
         tripleNum(number);
         square(number);
    }
    
    public static void doubleNum(int number){
        int result = number * 2;
        System.out.println("El doble de " + number + " es " + result);
    }
    
    public static void tripleNum(int number){
        int result = number * 3;
        System.out.println("El triple de " + number + " es " + result);
    }
    
    public static void square(int number){
        double result = Math.sqrt(number);
        System.out.println("La raiz cuadrada de " + number + " es " + result);
    }
}
