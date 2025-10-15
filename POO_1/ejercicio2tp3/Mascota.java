/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2tp3;

/**
 *
 * @author emili
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;
    
    public Mascota (String nombre, String especie, int edadInicial){
        this.nombre = nombre;
        this.especie = especie;
        this.setEdad(edadInicial);
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre + ". Especie: " + especie + ". Edad: " + edad);
    }
    
    
       public void setEdad(int edad) {
        if(edad>=1){
        this.edad = edad;
    } else {
             System.out.println("¡Error de validación!");
        }
   }
       
        public void subirEdad(int anios) {
        // Validación simple para que no se sumen años en negativo
        if (anios > 0) {
            this.edad += anios;
            System.out.println(this.nombre + ": cumplio " + anios + " años.");
        }
    }
       
       
        public String getNombre(){
          return nombre;
    }
         public String getEspecie(){
          return especie;
    }
    
}
