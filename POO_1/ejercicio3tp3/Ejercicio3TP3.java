/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3tp3;

/*
Encapsulamiento con la Clase Libro
a. Crear una clase Libro con atributos privados: titulo, autor, añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación para añoPublicacion.

Tarea: Crear un libro, intentar modificar el año con un valor inválido 
y luego con uno válido, mostrar la información final.
 */
public class Ejercicio3TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Meditaciones", "Marco Aurelio", 2014);
        
        libro1.mostrarInfo();
        
        libro1.setAniopublicacion(-1);
        
        
        
        libro1.setAniopublicacion(1940);
        
        libro1.mostrarInfo();
    }
    
}
