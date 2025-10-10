/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tp2;

import java.util.Scanner;
/**
 *
 * @author emili
 */
public class Ejercicio1TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Ejercicio 1- Verificación de año bisiesto.
            /* Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. 
        Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400.
        */
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Ingrese año: ");
        int anioUsuario = input.nextInt();
        
        //declaramos una variable tipo boolean para almacenar resultado
        boolean bisiesto = false;
        
        
        if ((anioUsuario % 4 == 0 && anioUsuario % 100 != 0) || (anioUsuario % 400 == 0)){
           bisiesto = true;
        }
        
        if (bisiesto){
            System.out.println("El año ingresado: "+ anioUsuario + " SI es año bisiesto.");
        } else {
            System.out.println("El año ingresado: " + anioUsuario + " NO es bisiesto.");
        }
        
    input.close();
            }
}
    
    

