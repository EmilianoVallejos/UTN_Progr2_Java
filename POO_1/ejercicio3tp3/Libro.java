/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3tp3;

/**
 *
 * @author emili
 */
public class Libro {
    private String titulo;
    private String autor;
    private int aniopublicacion;
    
public Libro (String titulo, String autor, int anioInicial){
    this.titulo = titulo;
    this.autor = autor;
    this.setAniopublicacion(anioInicial);
}

public void mostrarInfo(){
        System.out.println("Titulo: " + titulo + ". Autor: " + autor + ". Año de publicacion: " + aniopublicacion);
    }


public void setAniopublicacion(int aniopublicacion) {
    if(aniopublicacion>=1){
        this.aniopublicacion = aniopublicacion;
}   else {
    System.out.println("¡Error de validación!");
        }
   }

    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }

   
}
