/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio3TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // Ejercicio 3- Clasificación de edad.        
            /*
                Escribe un programa en Java que solicite al usuario 
                su edad y clasifique su etapa de vida según la siguiente tabla:
                        Menor de 12 años: "Niño"
                        Entre 12 y 17 años: "Adolescente"
                        Entre 18 y 59 años: "Adulto"
                        60 años o más: "Adulto mayor"
        */
        
        Scanner input = new Scanner(System.in);
        int edadUsuario;
        
        System.out.println("Ingrese su edad: ");
        edadUsuario = Integer.parseInt(input.nextLine());
        
        if (edadUsuario<12) {
            System.out.println("Niño");
            } else if (edadUsuario>=12 && edadUsuario<=17) {
            System.out.println("Adolescente");
        } else {
            System.out.println("Adulto mayor");
            }
        input.close();
        
        
    }
    
}
