/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11tp2;

// Ejercicio 11- Cálculo de descuento especial usando una variable global.

import java.util.Scanner;

        /*
            Declara una variable global Ejemplo de entrada/salida: = 0.10. 
            Luego, crea un método calcularDescuentoEspecial(double precio) 
            que use la variable global para calcular el descuento especial del 10%.
            Dentro del método, declara una variable local descuentoAplicado, 
            almacena el valor del descuento y muestra el precio final con descuento.
            
            Ejemplo de entrada/salida:
            Ingrese el precio del producto: 200
            El descuento especial aplicado es: 20.0
            El precio final con descuento es: 180.0
        */
        
public class Ejercicio11TP2 {
    
    public static final double TASA_DESCUENTO = 0.10;
    
    public static void calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio * TASA_DESCUENTO;
        
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
       
    }    
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        double precio;
        
        System.out.println("Ingrese precio del producto: ");
        precio = input.nextDouble();
        
               //llamada al método:
        calcularDescuentoEspecial(precio);
        
        input.close();
   }
   
}
