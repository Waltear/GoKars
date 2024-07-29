/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capaLogica;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class GeneradorCompetidores {
    private static final int NUM_COMPETIDORES = 50; 
    private static final int ID_MIN = 100;
    private static final int ID_MAX = 500; 
    private static final int  EDAD_MIN = 18; 
    private static final int EDAD_MAX = 80; 
    
    
    private List <Competidor> competidores; 
    private Random random; 

   public GeneradorCompetidores(){
     this.competidores = new ArrayList<>(); 
     this.random = new Random(); 
     
     
     

}  
     
     
   
public void generarCompetidores() {
    while (competidores.size() < NUM_COMPETIDORES){
       int id = ID_MIN + random.nextInt(ID_MAX - ID_MIN +1 ); 
       int edad = EDAD_MIN + random.nextInt(EDAD_MAX - EDAD_MIN + 1 ); 
       
       if (!idExistente(id)){
         String categoria = determinarCategoria(edad); 
         String equipo = determinarEquipo(edad); 
         Competidor competidor = new Competidor (id , edad , categoria , equipo);
         competidores.add(competidor); 
       
       
       }
    
    }


}



private boolean idExistente(int id ){
  for (int i = 0 ; i < competidores.size(); i++){
      if(competidores.get(i).getId()== id){
        return true; 
      
      }

}
    return false; 
     
     }
     
     

private String determinarCategoria(int edad) {
        if (edad >= 18 && edad <= 25) {
            return "Juvenil";
        } else if (edad >= 26 && edad <= 35) {
            return "Adulto";
        } else if (edad >= 36 && edad <= 45) {
            return "Adulto Mayor";
        } else if (edad >= 46 && edad <= 55) {
            return "Veterano";
        } else {
            return "Oro";
        }
    }

    private String determinarEquipo(int edad) {
        if (edad >= 18 && edad <= 20) {
            return "Rápidos(as) y Furiosos(as)";
        } else if (edad >= 21 && edad <= 30) {
            return "Velocidad Total";
        } else if (edad >= 31 && edad <= 50) {
            return "Prudencia";
        } else {
            return "Prudencia Total";
        }
    }

    public void mostrarCompetidores() {
        for (int i = 0; i < competidores.size(); i++) {
            System.out.println(competidores.get(i));
        }
    }

    public List<Competidor> getCompetidores() {
        return competidores;
    }
     
     
     
     
   
   
   
   
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
