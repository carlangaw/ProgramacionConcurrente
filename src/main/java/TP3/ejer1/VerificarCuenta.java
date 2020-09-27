/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3.ejer1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carla Nuñez
 */
public class VerificarCuenta implements Runnable {

    private CuentaBanco cb = new CuentaBanco();

    // de hacer retiro

    public void run() {
        for (int i = 0; i <= 3; i++) {
            try {
                cb.HacerRetiro(10);
                if (cb.getBalance() < 0) {
                    System.out.println("La cuenta está sobregirada.");
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(VerificarCuenta.class
                        .getName()).
                        log(Level.SEVERE, null, ex);
            }
        }
    }
}
