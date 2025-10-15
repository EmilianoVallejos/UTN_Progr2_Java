/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2tp3;

/*Registro de Mascotas
a. Crear una clase Mascota con los atributos: nombre, especie, edad.
Métodos requeridos: mostrarInfo(), cumplirAnios().
Tarea: Crear una mascota, mostrar su información, simular el paso del tiempo y verificar los cambios.
 */
public class Ejercicio2TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Bacco", "perro", 7);
        
        
        //Mostrar información de mascota
        mascota1.mostrarInfo();
        
        //Subir edad de mascota
        mascota1.subirEdad(5);
        
        //Mostrar información de mascota nuevamente
        mascota1.mostrarInfo();
    }
}
