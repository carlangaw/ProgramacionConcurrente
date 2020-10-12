/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp4ej14;

/**
 *
 * @author Carla Nuñez
 */

import java.util.logging.Level;
import java.util.logging.Logger;
import utiles.Aleatorio;

/**
 *
 * @author Chino
 */
public class Empleado implements Runnable {

    private String nombre;
    private Confiteria confiteria;

    public Empleado(String n, Confiteria confi) {
        confiteria = confi;
        nombre = n;

    }

    public void run() {
        boolean entre = false;
        try {
            while (!entre) {

                switch (utiles.Aleatorio.intAleatorio(1, 4)) {
                    case 1:
                        System.out.println(nombre + " Intenta pedir bebida");
                        entre = confiteria.sentarse(nombre);
                        if (entre) {
                            confiteria.solicitarBebida(nombre);
                            confiteria.irse(nombre);
                        } else {
                            Thread.sleep(3000);
                        }
                        break;
                    case 2:
                        System.out.println(nombre + " Intenta pedir comida");
                        entre = confiteria.sentarse(nombre);
                        if (entre) {
                            confiteria.solicitarComida(nombre);
                            confiteria.comer();
                            confiteria.irse(nombre);
                        }
                         {
                            Thread.sleep(3000);
                        }
                        break;
                    case 3:
                        System.out.println(nombre + " Intenta pedir bebida y comida");
                        entre = confiteria.sentarse(nombre);
                        if (entre) {
                            confiteria.solicitarBebida(nombre);
                            confiteria.solicitarComida(nombre);
                            confiteria.comer();
                            confiteria.irse(nombre);
                        }
                        Thread.sleep(3000);
                        break;
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
