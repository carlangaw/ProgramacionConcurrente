/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuenteSemaforo;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carla Nuñez
 */
public class Coche implements Runnable {

    private Puente puente;
    private int patente;
    private boolean sentido;

    public Coche(Puente p, int pat, boolean sent) {
        puente = p;
        patente = pat;
        sentido = sent;

    }

    public void run() {
        Random r = new Random(System.currentTimeMillis());
        int t = r.nextInt(1000);

        if (sentido) { //cruce al sur

            try {
                puente.cruzarSur(patente);
                Thread.sleep(t);
                puente.salirSur(patente);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else{//cruce al norte
            try {

                puente.cruzarNorte(patente);
                Thread.sleep(t);
                puente.salirNorte(patente);
               
            } catch (InterruptedException ex) {
                Logger.getLogger(Coche.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
}
