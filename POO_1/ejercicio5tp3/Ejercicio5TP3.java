/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5tp3;

/*
5. Simulación de Nave Espacial
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia), recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar 
y evitar que se supere el límite al recargar.
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin recargar,
luego recargar y avanzar correctamente. Mostrar el estado al final.

 */
public class Ejercicio5TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // 1. Corrección de sintaxis y Creación de la nave
        // Tarea: Crear una nave con 50 unidades de combustible.
        NaveEspacial naveOdisea = new NaveEspacial("Odisea-1", 50);

        naveOdisea.mostrarEstado(); 

        // 2. Simular Despegue (gasta 10 unidades)
        naveOdisea.despegar(); // Combustible pasa a 40

        // 3. Intentar avanzar SIN recargar (la distancia es 50, solo tiene 40)
        System.out.println("--- Intentando Avance 1 (Fallo esperado) ---");
        naveOdisea.avanzar(50); // Fallará la validación y no avanzará.

        naveOdisea.mostrarEstado(); 

        // 4. Recargar combustible (Tarea: recargar)
        System.out.println("\n--- Recargando Combustible ---");
        naveOdisea.recargarCombustible(70); // 40 + 70 = 110. Se limitará a 100.

        // 5. Intentar avanzar CORRECTAMENTE
        System.out.println("\n--- Intentando Avance 2 (Exitoso) ---");
        naveOdisea.avanzar(60); // 100 - 60 = 40.

        // 6. Mostrar el estado al final.
        naveOdisea.mostrarEstado();
    }
}
