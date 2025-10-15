/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4tp3;

/**
 *
 * @author emili
 */
class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    

    public Gallina (int idGallina, int edad){
    this.idGallina = idGallina;
    this.edad = edad;
    this.huevosPuestos = 0;
}

public void mostrarEstado(){
        System.out.println("Gallina - id: " + idGallina + ". Edad: " + edad + ". Huevos puestos: " + huevosPuestos);
    }


public void ponerHuevo() {
    this.huevosPuestos++;
        }

public void envejecer() {
    this.edad++;
    }

    
    public int getEdad() {
        return edad;
    }

    public int getIdGallina() {
        return idGallina;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }
        
}
