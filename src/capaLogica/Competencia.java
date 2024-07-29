/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

/**
 *
 * @author Simon
 */
public class Competencia {
    private String nombre; 
    private int distanciaKm; 

    public Competencia(String nombre, int distanciaKm) {
        this.nombre = nombre;
        this.distanciaKm = distanciaKm;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDistanciaKm(int distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaKm() {
        return distanciaKm;
    }
    
      @Override
    public String toString() {
        return "Nombre: " + nombre + ", Distancia: " + distanciaKm + " km";
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}














