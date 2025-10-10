/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tp2;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Ejercicio4TP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio 4- Calculadora de descuentos según categoría.
            /*
                Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
                Luego, aplique los siguientes descuentos:
                Categoría A: 10% de descuento
                Categoría B: 15% de descuento
                Categoría C: 20% de descuento
                El programa debe mostrar el precio original, el descuento aplicado y el precio final
            */
        Scanner input = new Scanner(System.in);
        double precio, descuento, precioFinal;
        
        
        System.out.println("Ingrese precio de producto:");
        precio = input.nextDouble(); input.nextLine();
        
        System.out.println("Ingrese categoría A, B o C: ");
        String catABC = input.nextLine().toUpperCase();
        
        switch (catABC) {
            case "A" -> {
                descuento = precio * 0.10; //10% de descuento
                precioFinal = precio - descuento;
                System.out.println("Precio original: $" + precio); 
                System.out.println("Categoría: A (10% descuento)"); 
                System.out.println("Descuento aplicado: $" + descuento); 
                System.out.println("Precio final: $" + precioFinal); 
            }
            case "B" -> {
                descuento = precio * 0.15; //15% descuento
                precioFinal = precio - descuento;
                System.out.println("Precio original: $" + precio); 
                System.out.println("Categoría: B (15% descuento)"); 
                System.out.println("Descuento aplicado: $" + descuento); 
                System.out.println("Precio final: $" + precioFinal);
            }
            case "C" -> { descuento = precio * 0.20; // 20% 
            precioFinal = precio - descuento; 
            System.out.println("\n--- Resumen de Compra ---"); 
            System.out.println("Precio original: $" + precio); 
            System.out.println("Categoría: C (20% descuento)"); 
            System.out.println("Descuento aplicado: $" + descuento); 
            System.out.println("Precio final: $" + precioFinal);
            }
            default -> {
                System.out.println("Categoría inválida. Use A, B o C.");
            }
        }                
                input.close();
                        }
        }
    
    
    

