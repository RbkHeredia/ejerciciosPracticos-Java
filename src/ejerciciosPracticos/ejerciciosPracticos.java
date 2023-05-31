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
        Scanner read = new Scanner(System.in);
        //ejercicio6
//        Crear un programa que dado un numero determine si es par o impar.
        
        System.out.println("Ingrese un numero para saber si es par o impar");
        int number = read.nextInt();
        parOImpar(number);
    }
    public static void parOImpar(int number){
        if(number%2== 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
