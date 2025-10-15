/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1tp3;

/*
Registro de Estudiantes
a. Crear una clase Estudiante con los atributos: nombre, apellido, curso, calificación.
Métodos requeridos: mostrarInfo(), subirCalificacion(puntos), bajarCalificacion(puntos).
Tarea: Instanciar a un estudiante, mostrar su información, aumentar y disminuir calificaciones.

*/
public class Ejercicio1TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Emiliano", "Vallejos", "Programacion 2", 7);
        
        estudiante1.mostrarInfo();
        
        // Aumentar calificaciones
        estudiante1.subirCalificacion(1.5); 
        
        // Disminuir calificaciones
        estudiante1.bajarCalificacion(2.0);
        
        // Mostrar la información final para confirmar el cambio.
        estudiante1.mostrarInfo();
        
    }
    
}
