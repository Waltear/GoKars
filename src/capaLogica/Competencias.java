/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.util.Random;

public class Competencias {
    private String nombre;
    private int distanciaKilometros;

    public Competencias(String nombre, int distanciaKilometros) {
        this.nombre = nombre;
        this.distanciaKilometros = distanciaKilometros;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDistanciaKilometros() {
        return distanciaKilometros;
    }

    @Override
    public String toString() {
        return nombre + " - " + distanciaKilometros + " km";
    }

    public static int generarDistancia() {
        Random random = new Random();
        int vueltas = 30 + random.nextInt(21); // Número aleatorio entre 30 y 50
        int pulgadasPorVuelta = 8150;
        double kilometros = vueltas * pulgadasPorVuelta * 0.0000254; // Conversión de pulgadas a kilómetros
        return (int) kilometros;
    }
}
