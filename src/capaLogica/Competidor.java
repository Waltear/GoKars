/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.util.ArrayList;
import java.util.List;

public class Competidor {
    private int id;
    private int edad;
    private String categoria;
    private String equipo;
    private List<Integer> tiempos;

    public Competidor(int id, int edad, String categoria, String equipo) {
        this.id = id;
        this.edad = edad;
        this.categoria = categoria;
        this.equipo = equipo;
        this.tiempos = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getEquipo() {
        return equipo;
    }

    public void agregarTiempo(int tiempo) {
        tiempos.add(tiempo);
    }

    public int getTiempoTotal() {
        return tiempos.stream().mapToInt(Integer::intValue).sum();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Edad: " + edad + ", Categoría: " + categoria + ", Equipo: " + equipo;
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
