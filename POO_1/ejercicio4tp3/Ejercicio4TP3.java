/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4tp3;

/*
    4. Gestión de Gallinas en Granja Digital
    a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos.
    Métodos requeridos: ponerHuevo(), envejecer(), mostrarEstado().
    Tarea: Crear dos gallinas, simular sus acciones (envejecer y poner huevos), y mostrar su estado.
 */
public class Ejercicio4TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(345098, 2);
        Gallina gallina2 = new Gallina(456876, 1);
        
        
        // Gallina 1: Pone 3 huevos y envejece
        gallina1.ponerHuevo(); 
        gallina1.ponerHuevo();
        gallina1.ponerHuevo(); // Puso 3 huevos en total
        gallina1.envejecer(); 

        // Gallina 2: Pone 1 huevo y envejece 2 veces (simulando 2 años)
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();
        
        // 3. Mostrar el estado final
        System.out.println("--- ESTADO FINAL (Después de Acciones) ---");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
        
    }
    
}
