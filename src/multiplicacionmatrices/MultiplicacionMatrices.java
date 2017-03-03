/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionmatrices;

import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class MultiplicacionMatrices {
    public int matriz1[][],matriz2[][],filas1,columnas1,filas2,columnas2,datos;
    public MultiplicacionMatrices(){
        Scanner referencia = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);
        System.out.println("Referencia primer matriz");
        System.out.println("Ingrese cantidad de filas: ");
        filas1 = referencia.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        columnas1 = referencia.nextInt();
        
        for(int i=0;i<filas1;i++){
            for(int j=0;j<columnas1;j++){
                System.out.println("ingrese el dato de la fila "+i+" columna "+j);
                datos=numeros.nextInt();
                matriz1[i][j]=datos;
            }//forj
    }//fori
        System.out.println("Referencia segunda matriz");
        System.out.println("Ingrese cantidad de filas: ");
        filas2 = referencia.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        columnas2 = referencia.nextInt();
        
        for(int i=0;i<filas2;i++){
            for(int j=0;j<columnas2;j++){
                System.out.println("ingrese el dato de la fila "+i+" columna "+j);
                datos = referencia.nextInt();
                matriz2[i][j]=datos;
            }//forj
    }//fori
        validar();
}//consttructor

    public void validar(){
        if(columnas1==filas2){
            multiplicar();
        }//if
        else{
            System.out.println("No se puede realizar la multiplicacion");
        }//else
        
    }//validar
    
    public void multiplicar(){
        int[][] multiplicacion = new int[columnas1][filas2];
        for (int i=0; i < multiplicacion.length; i++) {
            for (int j=0; j < multiplicacion[i].length; j++) {
                for (int k=0; k<filas2; k++) {
                    multiplicacion [i][j] += matriz1[i][k]*matriz2[k][j]; 
                }//fork
            }//forj
        }//fori
        System.out.println("Matriz Resultado");
        for(int i=0;i<columnas1;i++){
            for(int j=0;j<filas2;j++){
                System.out.println("dato en fila "+i+" columna "+j+" ");
            }
        }//fori
    }//multiplicar
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MultiplicacionMatrices MultiplicacionMatrices = new MultiplicacionMatrices();
    }//main
    
}
