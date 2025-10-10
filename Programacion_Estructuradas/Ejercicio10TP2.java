/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10tp2;

 // Ejercicio 10- Actualización de stock a partir de venta y recepción de productos.
import java.util.Scanner;


        /*
                Crea un método actualizarStock(int stockActual, int cantidadVendida,
                int cantidadRecibida), que calcule el nuevo stock después de una venta y recepción
                de productos:
                NuevoStock = StockActual − CantidadVendida + CantidadRecibida
                NuevoStock = CantidadVendida + CantidadRecibida
                Desde main(), solicita al usuario el stock actual, la cantidad vendida y la cantidad recibida, y muestra el stock actualizado.
                Ejemplo de entrada/salida:
                Ingrese el stock actual del producto: 50
                Ingrese la cantidad vendida: 20
                Ingrese la cantidad recibida: 30
                El nuevo stock del producto es: 60
        */

public class Ejercicio10TP2 {
    
    public static int actualizarStock( int stockActual , int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //variable entrada
        int stockActual, cantidadVendida, cantidadRecibida;
        
        //variable que almacena calculo de función
        int stockDisponible;
        
        System.out.println("Ingrese stock actual: ");
        stockActual = input.nextInt();
        
        System.out.println("Ingrese cantidad ventida: ");
        cantidadVendida = input.nextInt();
        
        System.out.println("Ingrese cantidad recibida: ");
        cantidadRecibida = input.nextInt();
        
        
        //llamar al método
       stockDisponible= actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        //publicar el resultado
        System.out.println("El nuevo stock del producto es: " + stockDisponible);
        
        input.close();
          
    }
    
}
