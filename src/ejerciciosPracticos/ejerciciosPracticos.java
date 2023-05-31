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
        //ejercicio7
//        Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
//la función equals() en Java.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String phrase = read.nextLine();
        compare(phrase);
    }
    public static void compare(String phrase){
        if(phrase.equals("eureka")){
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
