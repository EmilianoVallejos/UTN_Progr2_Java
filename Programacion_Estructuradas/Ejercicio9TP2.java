/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9tp2;

import java.util.Scanner;

/*
Ejercicio 9- Composición de funciones para calcular costo de envío y total de compra.
        

a. calcularCostoEnvio(double peso, String zona): 
    Calcula el costo de envío basado en la zona de envío (Nacional o Internacional) y el peso del paquete.
                Nacional: $5 por kg
                Internacional: $10 por kg
                
b. calcularTotalCompra(double precioProducto, double costoEnvio): 
    Usa calcularCostoEnvio para sumar el costo del producto con el costo de envío.
                
Desde main(), solicita el peso del paquete, la zona de envío y el precio del producto. 
Luego, muestra el total a pagar.

Ejemplo de entrada/salida:
                Ingrese el precio del producto: 50
                Ingrese el peso del paquete en kg: 2
                Ingrese la zona de envío (Nacional/Internacional): Nacional
                El costo de envío es: 10.0
                El total a pagar es: 60.0
        */
 
public class Ejercicio9TP2 {

    /**
     * @param args the command line arguments
     */
    public static double calcularCostoEnvio(double peso, String zona){
        if (zona.equalsIgnoreCase("Nacional")){
             return peso*5;} 
        else if (zona.equalsIgnoreCase("Internacional")){
            return peso*10;
        } 
        else{
            return 0;
        }
}            
                
    public static double calcularCostoTotal (double precioProducto, double costoEnvioCalculado){
        return precioProducto + costoEnvioCalculado;

}
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        //definir variables input:
        double peso, precio;
        String zona;
        
        //definir variables output/salida:
        double costoEnvioCalculado, costoTotal;
        
        
        //solicitar información a cliente
        System.out.println("Ingrese peso del producto: ");
        peso = input.nextDouble();
        
        System.out.println("Ingrese el precio del producto: ");
        precio = input.nextDouble();
        
        //Limpiar buffer
        input.nextLine();
        
        //se solicita zona
        System.out.println("Ingrese zona de envío - Nacional o Internacional -: ");
        zona = input.nextLine();
        
        costoEnvioCalculado= calcularCostoEnvio(peso, zona);
        
        costoTotal= calcularCostoTotal(precio, costoEnvioCalculado);
        
        System.out.println("---RESUMEN---");
        System.out.println("El costo de envío es: " + costoEnvioCalculado);
        System.out.println("El costo total (envio y producto): " + costoTotal);
        
        
        input.close();
               
    }   
}