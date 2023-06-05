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
        //ejercicio17
//        Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
//de 2 dígitos, etcétera (hasta 5 dígitos).
        Scanner read = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de valores que deseas ver");
        int q = read.nextInt();
        int vector[] = new int[q];
        for (int i = 0; i < q; i++) {
            vector[i] = (int) (Math.random()*25000);
            System.out.println(vector[i] + " - ");
        }
        counter(vector, q);
    }
    public static void counter(int vector[], int q){
        int counter, rest;
        for (int i = 0; i < q; i++) {
            rest = vector[i];
            counter = 1;
            while (rest >= 10){
                rest = rest /10;
                counter++;
            }
            System.out.println("cantidad de digitos: " + counter);
        }
    }
}
