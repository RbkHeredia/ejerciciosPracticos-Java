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
        //ejercicio21
        int matriz10[][] = new int[10][10];
        int matriz3[][] = new int[3][3];
        boolean validacion=false;
        System.out.println("Matriz 10 x 10");
        matriz10 = generarMatriz(10);
        System.out.println("------------------");
        System.out.println("Matriz 3 x 3");
        matriz3 = generarMatriz(3);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                validacion= validar(matriz10, matriz3, i, j);
                if(validacion){
                    System.out.println("Se encontro una coincidencia en la fila "+ i +", columna "+j);
                }
            }
        }
    }
    
    public static int[][] generarMatriz(int num){
        int matriz[][] = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                matriz[i][j] = (int)(Math.random()*2);
                if(matriz[i][j]<10){
                    System.out.print("[0"+matriz[i][j]+"]");
                } else{
                    System.out.print("["+matriz[i][j]+"]");
                }
                
            }
            System.out.println("");
        }
        return matriz;
    }
    
    public static boolean validar(int matriz10[][], int matriz3[][], int fila, int col){
        
        int counter = 0;
        boolean exist = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz3[i][j]== matriz10[i+fila][j+col]){
                    counter = counter +1;
                    if (counter == 9){
                        exist = true;
                    } 
                }
            }
        }
        return exist;
    }
}
