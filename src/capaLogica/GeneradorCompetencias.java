/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeneradorCompetencias {
    private static final String[] NOMBRES_COMPETENCIAS = {
        "Gran Premio Mangos",
        "Gran Premio Hato",
        "Gran Premio Chuchecas",
        "Gran Premio Ganaderos",
        "Gran Premio Pampa"
    };

    private List<Competencia> competencias;
    private Random random;

    public GeneradorCompetencias() {
        this.competencias = new ArrayList<>();
        this.random = new Random();
    }

    public void generarCompetencias() {
        List<String> nombres = new ArrayList<>();
        Collections.addAll(nombres, NOMBRES_COMPETENCIAS);
        Collections.shuffle(nombres);

        for (String nombre : nombres) {
            int distancia = Competencia.generarDistancia();
            competencias.add(new Competencia(nombre, distancia));
        }
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void mostrarCompetencias() {
        for (Competencia competencia : competencias) {
            System.out.println(competencia);
        }
    }
}
