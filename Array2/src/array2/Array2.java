/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array2;

import java.util.Random;

/**
 *
 * @author alumnom
 */
public class Array2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random rand=new Random();
    int[] arrayAle=new int[13];
    int h1=0;
    for(int i=0;i<arrayAle.length;i++){
        h1=rand.nextInt(14);
        arrayAle[i]=h1;
    }
        System.out.println("Numeros generados");
        
    for(int i=0;i<arrayAle.length;i++){
        System.out.println(arrayAle[i]);
    }
    }
    
}
