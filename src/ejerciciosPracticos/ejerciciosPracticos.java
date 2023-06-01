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
        //ejercicio14
//        Crea una aplicación que a través de una función nos convierta una cantidad de euros
//introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
//función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
//una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
//(void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a convertir");
        int euros = read.nextInt();
        read.nextLine();
        System.out.println("Ingrese la moneda de conversion: dolar, yen, libra");
        String moneda = read.nextLine();
        conversion(euros, moneda);
    }
    public static void conversion(int euros, String moneda){
        Scanner read = new Scanner(System.in);
        float total = 0;
        switch(moneda){
            case "dolar":
                total = (float) (euros * 1.28611);
                break;
            case "yen":
                total = (float) (euros * 129.858);
                break;
            case "libra":
                total = (float) (euros *0.86);
                break;
            default:
                System.out.println("Valor incorrecto. Ingrese nuevamente el tipo de moneda: dolar, yen, libra");
        }
        System.out.println(euros +" euros son: " + total + moneda);
    }
}
