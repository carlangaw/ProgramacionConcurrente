/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ejer2.corregido;

/**
 *
 * @author Carla Nuñez
 */
public class Orco implements Runnable {

    Jugador j1;

    public Orco(Jugador jugador1) {
        j1 = jugador1;
    }

    public void run() {

        j1.quitarVida();

    }

}
