/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3;

/**
 *
 * @author Carla Nuñez
 */
public class PruebaRunnable {

    public static void main(String[] args) {
        int a = 0;
        // 2 objetos definen los métodos run
        PingPong o1 = new PingPong("PING", 33);
        PingPong o2 = new PingPong("PONG", 10);
        // Se crean los hilos
        Thread t1 = new Thread(o1);
        Thread t2 = new Thread(o2);
        // se activan los hilos
        t1.start();
        for (int i = 1; i < 5000; i++) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

            }
        }
        t2.start();

    }
}
