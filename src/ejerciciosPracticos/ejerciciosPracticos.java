package ejerciciosPracticos;

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
        //ejercicio15
        //Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
//muestre por pantalla en orden descendente.
        int vector [] = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }
        writeVector(vector);
    }
    public static void writeVector(int vector []){
        for (int i : vector) {
            System.out.print(vector[i] + " - ");
        }
    }
}
