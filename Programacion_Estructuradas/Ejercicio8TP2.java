/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8tp2;

import java.util.Scanner;

/** Ejercicio 8- Cálculo del precio final con impuesto y descuento.
        /*
            Crea un método calcularPrecioFinal(double impuesto, double descuento) que calcule el precio final de un producto en un e-commerce. La fórmula es:
            PrecioFinal = PrecioBase + (PrecioBase×Impuesto) − (PrecioBase×Descuento) 
            PrecioFinal = PrecioBase + (PrecioBase \times Impuesto) - (PrecioBase \times Descuento)
            
            Desde main(), solicita el precio base del producto, el porcentaje de impuesto y 
            el porcentaje de descuento, llama al método y muestra el precio final.
            Ejemplo de entrada/salida:
            Ingrese el precio base del producto: 100
            Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): 10
            Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): 5
            El precio final del producto es: 105.0
        */
 
public class Ejercicio8TP2 {
     public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Se aplica la fórmula: PrecioBase + (Impuesto) - (Descuento)
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);}
        // También se ppodría simplificar haciendo: return precioBase * (1 + impuesto - descuento);
    
    public static void main(String[] args) {
            
        Scanner input = new Scanner (System.in);
        double precioBase, impuestoPorcentaje, descuentoPorcentaje, precioFinal;
        
      
        System.out.println("Ingrese el precio base del producto: ");
        precioBase = input.nextDouble();
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        impuestoPorcentaje = input.nextDouble();
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo 5 para 5%: ");
        descuentoPorcentaje = input.nextDouble();
        
          // --- PREPARACIÓN DE PARÁMETROS ---
        // Convertir los porcentajes a su valor decimal (ej: 10 / 100 = 0.10)
        double impuestoDecimal = impuestoPorcentaje / 100.0;
        double descuentoDecimal = descuentoPorcentaje / 100.0;
        
        // Llamar al método y obtener el precio final
        // Se llama al método con el precio base, y los valores decimales de impuesto y descuento.
        precioFinal = calcularPrecioFinal(precioBase, impuestoDecimal, descuentoDecimal);
        
        //Se muestra el resultado
        System.out.print("El precio final del producto es: " + precioFinal);
        
        // Cerrar el Scanner
        input.close();
        
    }
    
}
