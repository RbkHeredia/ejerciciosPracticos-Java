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
        //ejercicio12
        //Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
//dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
//fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
//X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
//especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
//de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
//incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java Substring(), Length(), equals().
        Scanner read = new Scanner(System.in);
        System.out.println("Simulador de RS232");
        String word;
        int correct = 0, wrong=0;
        do{
            System.out.println("Ingresa una palabra de 5 caracteres que comience con X y termine con O");
            word = read.nextLine();
            int longitud = word.length();
            if (word.equals("&&&&&")){
                break;
            }
            if (longitud==5){
                String firstLetter = word.substring(0,1);
                String lastLetter = word.substring(4,5);
                if(firstLetter.equals("X") && lastLetter.equals("O")){
                    System.out.println("Correcto");
                    correct++;
                }else{
                    System.out.println("Incorrecto");
                    wrong++;
                }
            }else{
                System.out.println("Verificar cantidad de caracteres");
                wrong ++;
            }
        }while(!word.equals("&&&&&"));
        System.out.println("La cantidad de veces correctas es: " + correct);
        System.out.println("La cantidad de veces incorrectas es: " + wrong);

    }
    
}
