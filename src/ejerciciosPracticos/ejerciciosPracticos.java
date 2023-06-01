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
        //ejercicio13
//        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
//cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
//* * * *
//*      *
//*      *
//* * * *
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos en cada lado");
        int n = read.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    
}
