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
public class PrincipalDos {
    public static void main(String[] args) {
        Entrenador entrenador1 = new Entrenador("René",25,"Futbol");
        Entrenador entrenador2 = new Entrenador();
        
        System.out.printf("%s\n", entrenador1);
        System.out.printf("%s\n",entrenador2);
    }
}
