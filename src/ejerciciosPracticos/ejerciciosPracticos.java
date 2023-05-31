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
        //ejercicio10
//        Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
//números al usuario hasta que la suma de los números introducidos supere el límite inicial.
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor limite");
        int limit = read.nextInt();
        int num, total = 0;
        while(total <limit){
            System.out.println("Ingrese un valor a sumar");
            num = read.nextInt();
            total = total + num;
        }
        System.out.println("El limite" +limit + "ha sido superado. El total es: " +total);
    }
    
}
