package ejerciciosPracticos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rebek
 */
import java.util.Scanner;
public class ejerciciosPracticos {

    public static void main(String[] args) {
        
        //ejercicio1
        //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        //dos. El programa deberá después mostrar el resultado de la suma
        
        Scanner read = new Scanner(System.in);
        int  num1, num2;
        System.out.println("Ingrese un numero");
        num1 = read.nextInt();
        System.out.println("Ingrese otro numero");
        num2 = read.nextInt();
        System.out.println("La suma de los numeros es: " + (num1+num2));
    }
    
}
