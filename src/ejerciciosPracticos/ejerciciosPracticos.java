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
        //ejercicio16
//        Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
//usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
//numero y si se encuentra repetido
        System.out.println("Ingrese la cantidad de cifras que desea obtener");
        int qant = read.nextInt();
        int vector [] = new int[qant];
        fillVector(vector, qant);
        findNumber(vector, qant);
    }
    public static void fillVector(int vector[], int qant){
        for (int i = 0; i < qant; i++) {
            vector[i] = (int) (Math.random() * 25 +1);
            System.out.print(vector[i] + " - ");
        }
    }
    
    public static void findNumber(int vector[], int qant){
        Scanner read = new Scanner(System.in);
        System.out.println("");
        System.out.println("Que numero desea buscar?");
        int finder = read.nextInt();
        int counter = 0;
        for (int i = 0; i < qant; i++) {
            if (vector[i] ==finder){
                System.out.println("El numero se encuentra en la posicion " + (i +1));
                counter ++;
            }
        }
        System.out.println("El numero se encontró " + counter + " veces.");
    }
}
