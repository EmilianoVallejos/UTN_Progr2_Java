/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio5TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                // Ejercicio 5- Suma de números pares (While).
         /*
                Escribe un programa que solicite números al usuario y sume solo los números pares.
                El ciclo debe continuar hasta que el usuario ingrese el número 0, 
                momento en el que se debe mostrar la suma total de los pares ingresados.
                    Ejemplo de entrada/salida:
                Ingrese un número (0 para terminar): 4
                Ingrese un número (0 para terminar): 7
                Ingrese un número (0 para terminar): 2
                Ingrese un número (0 para terminar): 0
        La suma de los números pares es: 6
        */
                     
            Scanner input = new Scanner(System.in); 
            int numero; 
            int sumaPares = 0; 
            
            System.out.print("Ingrese un número (o 0 para terminar): "); 
            numero = input.nextInt(); 
            
            while (numero != 0) { 
                if (numero % 2 == 0){ 
                    sumaPares += numero;
                } 
            System.out.print("Ingrese un número (0 para terminar): "); 
            numero = input.nextInt();
                } 
            System.out.println("La suma de los números pares es: " + sumaPares); 
            input.close();
                            
        
        
    }
    
}
