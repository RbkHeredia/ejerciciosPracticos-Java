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
        //ejercicio20
//        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
//suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
//permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
//El programa deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.
        
        System.out.println("Cuadrado mágico");
        int matriz[][] = new int[3][3];
        int num;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                num = enterNumber();
                matriz[i][j] = num;
            }
        }
        imprimirMatriz(matriz);
        validar(matriz);
    }
    
    public static int enterNumber(){
        Scanner read = new Scanner(System.in);
        int n;
        System.out.println("Ingresa un numero");
        n = read.nextInt();
        while(n<0 || n>9){
            System.out.println("Numero equivocado. Ingresalo nuevamente");
            n= read.nextInt();
        } 
        return n;
    }
    
    public static void imprimirMatriz(int matriz[][]){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" +matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static void validar(int matriz[][]){
        int sumaFila1=0; 
        int sumaFila2=0; 
        int sumaFila3 = 0;
        int sumaCol1 = 0;
        int sumaCol2 = 0;
        int sumaCol3 = 0;
        int diagPrinc = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(i== 0){
                    sumaFila1 = sumaFila1 + matriz[i][j];
                } else if(i==1){
                    sumaFila2 = sumaFila2 + matriz[i][j];
                } else{
                    sumaFila3 = sumaFila3 + matriz[i][j];
                }
                if(j==0){
                    sumaCol1 = sumaCol1 +matriz[i][j];
                } else if(j==1){
                    sumaCol2 = sumaCol2+matriz[i][j];
                } else{
                    sumaCol3 = sumaCol3 +matriz[i][j];
                }
                if(i==j){
                    diagPrinc= diagPrinc+matriz[i][j];
                }
            }
        }
        if(sumaFila1 == sumaFila2 && sumaFila1 == sumaFila3 && sumaFila1 == sumaCol1 && sumaFila1 == sumaCol2 && sumaFila1 == sumaCol3 && sumaFila1 == diagPrinc){
            System.out.println("Es un cubo magico");
        }else{
            System.out.println("No es un cubo magico");
        }
        System.out.println("fila1: " +sumaFila1 +", fila2: "+ sumaFila2 +", fila3: "+sumaFila3+", col1: "+sumaCol1+", col2: "+sumaCol2+", col3: "+sumaCol3+", diagPrinc: "+diagPrinc);
    }
}
