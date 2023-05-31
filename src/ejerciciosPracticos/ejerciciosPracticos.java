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
        //ejercicio11
//        Realizar un programa que pida dos números enteros positivos por teclado y muestre por
//pantalla el siguiente menú:
//
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:
//
//El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
//y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
//Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
//directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
//desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
//programa, caso contrario se vuelve a mostrar el menú.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = read.nextInt();
        int option;
        boolean out = false;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija una opcion:");
            option = read.nextInt();
            switch (option){
                case 1:
                    sumar(num1, num2);
                    break;
                case 2:
                    restar(num1,num2);
                    break;
                case 3:
                    multiplicar(num1,num2);
                    break;
                case 4:
                    division(num1, num2);
                    break;
                case 5:
                    System.out.println("Estas seguro de salir? s/n");
                    read.nextLine();
                    String res = read.nextLine();
                    if (res.equals("s")){
                        out = true;
                    }
                    break;
            }
        } while (out == false);
        System.out.println("Hasta la próxima!");
    }
    public static void sumar(int num1, int num2){
        int total = num1 + num2;
        System.out.println("La suma de " +num1 +" y el numero "+num2+ " es: " + total);
    }
    public static void restar(int num1, int num2){
        int total = num1 - num2;
        System.out.println("La resta de " +num1 +" y el numero "+num2+ " es: " + total);
    }
    public static void multiplicar(int num1, int num2){
        int total = num1 * num2;
        System.out.println("La multiplicacion de " +num1 +" y el numero "+num2+ " es: " + total);
    }
    public static void division(int num1, int num2){
        double total = num1 / num2;
        System.out.println("La division de " +num1 +" y el numero "+num2+ " es: " + total);
    }
}
