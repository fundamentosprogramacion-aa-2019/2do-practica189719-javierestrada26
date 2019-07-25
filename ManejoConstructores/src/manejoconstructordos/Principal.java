/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructordos;

/**
 *
 * @author JAVIER
 */
public class Principal {
    public static void main(String[] args) {
       Ciudad c1 = new Ciudad("Cuenca","Azuay");
      Ciudad c2 = new Ciudad("Quito","Pichincha");
      Ciudad c3 = new Ciudad("Guayaquil","Guayas");
      
      Equipo eq1 = new Equipo ("Deportivo Cuenca", c1);
      Equipo eq2 = new Equipo ("Aucas", c2);
      Equipo eq3 = new Equipo ("Barcelona", c3);
      Equipo eq4 = new Equipo ("Guayaquil City", c3);
      
      EntrenadorUno entrenador1 = new EntrenadorUno("Luis Soler", 59,
      "Fútbol", 9500, eq1);
      EntrenadorUno entrenador2 = new EntrenadorUno("José Shurer", 60,
      "Fútbol", 8500, eq2);
      EntrenadorUno entrenador3 = new EntrenadorUno("Leonardo Ramos", 55,
      "Fútbol", 10500, eq3);
      EntrenadorUno entrenador4 = new EntrenadorUno("Paul Gavilanes", 45,
      "Fútbol", 5500, eq4);  
      
      EntrenadorUno [] entrenadores = new EntrenadorUno[4];
      entrenadores [0] = entrenador1;
      entrenadores [1] = entrenador2;
      entrenadores [2] = entrenador3;
      entrenadores [3] = entrenador4;
      
      OperacionEntrenador operacion = new OperacionEntrenador(entrenadores);
      operacion.establecerPromedioEdades();
      operacion.establecerPromedioSalarios();
      System.out.printf("%s\n", operacion); 
    }
    
}
