/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1tp3;

/**
 *
 * @author emili
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacionInicial) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        // Usamos el setter para asegurar la validación
        this.setCalificacion(calificacionInicial); 
    } 
    
        public void mostrarInfo() {
        System.out.println("--- Información del Estudiante ---");
        System.out.println("Nombre Completo: " + this.nombre + " " + this.apellido);
        System.out.println("Curso: " + this.curso);
        // Usamos printf para mostrar la calificación con dos decimales
        System.out.printf("Calificación: " + this.calificacion);
        System.out.println("----------------------------------");
    }
        
        
        public void subirCalificacion(double puntos) {
        // Validación simple para que no se sumen puntos negativos
        if (puntos > 0) {
            this.calificacion += puntos;
            System.out.println(this.nombre + ": Calificación subida en " + puntos + " puntos.");
            // limitar a un máximo de 10
            if (this.calificacion > 10.0) {
                this.calificacion = 10.0;
            }
        }
}

 public void bajarCalificacion(double puntos) {
        // Validación simple para que no se resten puntos negativos
        if (puntos > 0) {
            this.calificacion -= puntos;
            System.out.println(this.nombre + ": Calificación bajada en " + puntos + " puntos.");
            // Opcional: limitar a un mínimo de 0
            if (this.calificacion < 0.0) {
                this.calificacion = 0.0;
            }
        }
    }
 
  public void setCalificacion(double calificacion) {
        // Validación: la calificación debe estar entre 0.0 y 10.0
        if (calificacion >= 0.0 && calificacion <= 10.0) {
             this.calificacion = calificacion;
        } else {
             System.out.println("¡Error de validación! Calificación fuera de rango (0.0 a 10.0).");
        }
    }
 
     
     public String getNombre(){
          return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public String getCurso(){
        return curso;
    }
    
}
    
