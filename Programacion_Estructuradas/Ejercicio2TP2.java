/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio2TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     // Ejercicio 2- Determinar el mayor de tres nros.
    /* Escribe un programa en Java que pida al usuario 
    tres números enteros y determine cuál es el mayor. 
        */
            
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.print("Ingrese el primer numero entero: ");
             num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero entero: ");
             num2 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el tercer numero entero: ");
             num3 = Integer.parseInt(input.nextLine());
                
             if (num1>num2 && num1>num3) {
                 System.out.println("El primer numero ingresado es el mayor");
            } else if (num2>num1 && num2>num3) {
                System.out.println("El segundo numero ingresado es el mayor");            
        }
             else{
            System.out.println("El tercer numero ingresado es el mayor");
        }
        input.close();
                
    }
    
}
