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

    public static void main(String[] args) {
        //ejercicio2
//        Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
//pantalla.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa tu numbre");
        String name= read.nextLine();
        System.out.println("Hola " +name);
    }
    
}
