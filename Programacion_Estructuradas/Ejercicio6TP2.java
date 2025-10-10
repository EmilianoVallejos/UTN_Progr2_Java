/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio6TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 6- Contador de positivos, negativos y ceros(for).
            /*
            Escribe un programa que pida al usuario ingresar 10 números enteros y
            cuente cuántos son positivos, negativos y cuántos son ceros.
            
            */
            
            Scanner input = new Scanner(System.in); 
            int numUser; 
            int numPos = 0, numNeg = 0, numCeros = 0;
            for (int i = 1; i <= 10; i++) { 
                System.out.print("Ingrese el número " + i + ": ");
                numUser = input.nextInt();
                if (numUser > 0) { 
                    numPos++; 
                } else if (numUser < 0) { 
                    numNeg++; 
                } else { numCeros++; }
            } 
            System.out.println("Resultados:");
            System.out.println("Positivos: " + numPos);
            System.out.println("Negativos: " + numNeg);
            System.out.println("Ceros: " + numCeros);
            
            input.close();
            
    }
    
}
