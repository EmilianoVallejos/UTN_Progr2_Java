/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12tp2;

            // Ejercicio 12- Modificación de un array de precios y visualización de resultados.
        /*
            Arrays y Recursividad:
                    Crea un programa que:
            a. Declare e inicialice un array con los precios de algunos productos.
            b. Muestre los valores originales de los precios.
            c. Modifique el precio de un producto específico.
            d. Muestre los valores modificados.
            Salida esperada:
            Precios originales:
            Precio: $199.99
            Precio: $299.5
            Precio: $149.75
            Precio: $399.0
            Precio: $89.99
            Precios modificados:
            Precio: $199.99
            Precio: $299.5
            Precio: $129.99
            Precio: $399.0
            Precio: $89.99
            Conceptos Clave Aplicados:
            ✔ Uso de arrays (double[]) para almacenar valores.
            ✔ Recorrido del array con for-each para mostrar valores.
            ✔ Modificación de un valor en un array mediante un índice.
            ✔ Reimpresión del array después de la modificación.
        */
public class Ejercicio12TP2 {
    public static void imprimirPrecios(double[] arr) {
        // Recorre cada elemento (precio) en el array 'arr'
        for (double precio : arr) {
            // Utilizamos printf para asegurar que el formato de salida sea consistente (ej. con dos decimales).
            System.out.printf("Precio: " + precio);
        }
    }
    
    public static void main(String[] args) {
        
    double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
    
        System.out.println("Precios originales: ");
        imprimirPrecios(precios);
        
        //se modifica el precio del índice [2].
        precios[2] = 129.99;
        
        //Se reimprimen nuevamente los valores ya modificados.
        System.out.println("Precios modificados");
        imprimirPrecios(precios);
        
    
    
            
            
    }
    
}
