/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5tp3;

/**
 *
 * @author emili
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    // Constante para el límite máximo de combustible
    private static final int LIMITE_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        // Inicializamos usando el método de recarga para aplicar el límite.
        recargarCombustible(combustibleInicial);
        System.out.println("Nave " + this.nombre + " lista para la misión.");
    }
    
    
public void mostrarEstado(){
        System.out.println("Combustible restante: " + this.combustible + " unidades.");
    }

  /**
     * Simula el despegue de la nave.
     */
    public void despegar() {
        if (this.combustible >= 10) {
            this.combustible -= 10; // Cuesta 10 unidades despegar
            System.out.println(this.nombre + " ha despegado con éxito. Combustible gastado: 10.");
        } else {
            System.out.println("¡ERROR! " + this.nombre + " no puede despegar. Combustible insuficiente.");
        }
    }

    /**
     * Permite a la nave avanzar, consumiendo combustible.
     * @param distancia La distancia a avanzar (cada unidad de distancia cuesta 1 unidad de combustible).
     */
    public void avanzar(int distancia) {
        // Regla: Validar que haya suficiente combustible.
        if (this.combustible >= distancia) {
            this.combustible -= distancia;
            System.out.println(this.nombre + " ha avanzado " + distancia + " unidades. Combustible actual: " + this.combustible);
        } else {
            System.out.println("¡ADVERTENCIA! Fallo al avanzar " + distancia + " unidades. Solo quedan " + this.combustible + " unidades de combustible.");
        }
    }

    /**
     * Recarga el combustible de la nave.
     * @param cantidad La cantidad de combustible a añadir.
     */
    public void recargarCombustible(int cantidad) {
        int nuevoTotal = this.combustible + cantidad;

        // Regla: Evitar que se supere el límite al recargar.
        if (nuevoTotal > LIMITE_COMBUSTIBLE) {
            int recargaEfectiva = LIMITE_COMBUSTIBLE - this.combustible;
            this.combustible = LIMITE_COMBUSTIBLE;
            System.out.println("Recarga LIMITADA: Solo se añadieron " + recargaEfectiva + " unidades (Límite: " + LIMITE_COMBUSTIBLE + ").");
        } else {
            this.combustible = nuevoTotal;
            System.out.println("Combustible recargado: +" + cantidad + " unidades.");
        }
    }
}
