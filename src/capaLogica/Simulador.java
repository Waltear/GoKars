/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.util.List;
import java.util.Random;

public class Simulador {
    private List<Competencia> competencias;
    private List<Competidor> competidores;
    private Random random;

    public Simulador(List<Competencia> competencias, List<Competidor> competidores) {
        this.competencias = competencias;
        this.competidores = competidores;
        this.random = new Random();
    }

    public void simularCompetencia(Competencia competencia) {
        System.out.println("Simulando: " + competencia.getNombre());

        for (Competidor competidor : competidores) {
            int tiempo = 3000 + random.nextInt(3001); // Tiempo aleatorio entre 3000 y 6000
            competidor.agregarTiempo(tiempo);
        }

        competidores.sort((c1, c2) -> Integer.compare(c1.getTiempoTotal(), c2.getTiempoTotal()));

        System.out.println("Resultados de la competencia:");
        for (Competidor competidor : competidores) {
            System.out.println("ID: " + competidor.getId() + " - Tiempo: " + competidor.getTiempoTotal());
        }
    }

    public void simularTodasLasCompetencias() {
        for (Competencia competencia : competencias) {
            simularCompetencia(competencia);
        }
    }
}
