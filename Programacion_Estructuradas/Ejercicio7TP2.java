/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio7TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // Ejercicio 7- Validación de nota entre 0 y 10(do-while).
        /*
        Escribe un programa que solicite al usuario una nota entre 0 y 10. 
        Si el usuario ingresa un número fuera de este rango, 
        debe seguir pidiéndole la nota hasta que ingrese un valor válido.
        Ejemplo de entrada/salida:
        Ingrese una nota (0-10): 15
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): -2
        Error: Nota inválida. Ingrese una nota entre 0 y 10.
        Ingrese una nota (0-10): 8
        Nota guardada correctamente
        */
               
        Scanner input = new Scanner(System.in); 
        int nota;
        do { System.out.print("Ingrese una nota (0-10): ");
            nota = input.nextInt();
            if (nota < 0 || nota > 10){ 
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            } 
        } while (nota < 0 || nota > 10); 
        System.out.println("Nota guardada correctamente."); 
        input.close();
        
    }
    
}
