/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4ejercicio8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carla Nuñez
 */
public class Atleta implements Runnable {
    protected String nombre;
    protected int turno;
    Testigo testigo;
    
    public Atleta (String nom , int tur , Testigo tes){
        nombre=nom;
        turno=tur;
        testigo=tes;
    }
    
    public void run(){
        try {
            testigo.correr(nombre, turno);
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
