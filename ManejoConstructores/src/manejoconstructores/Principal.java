/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoconstructores;

/**
 *
 * @author javie
 */
public class Principal {

    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("René", 25, "Futbol");
        Entrenador entrenador2 = new Entrenador();

        System.out.printf("entrenador1 Nombre:%s - Edad %d - Deporte %s\n",
                entrenador1.getNombre(),
                entrenador1.getEdad(),
                entrenador1.getDeporte());
        System.out.printf("entrenador2 Nombre:%s - Edad %d\n", 
                entrenador2.getNombre(),
                entrenador2.getEdad());
        entrenador1.setNombre("Rolando");
        System.out.printf("entrenador1 Nombre:%s - Edad %d\n", 
                entrenador1.getNombre(),
                entrenador1.getEdad());
    }
}
