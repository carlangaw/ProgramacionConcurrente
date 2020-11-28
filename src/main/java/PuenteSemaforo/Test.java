/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuenteSemaforo;

/**
 *
 * @author Carla Nuñez
 */
public class Test {

    public static void main(String[] args) {
        Puente p = new Puente();
        int cant1 = 5;
        int cant2 = 15;
        Thread[] coche1 = new Thread[cant1];
        Thread[] coche2 = new Thread[cant2];

        for (int i = 0; i < coche1.length; i++) {
            coche1[i] = new Thread(new Coche(p, i, true));
        }
        for (int i = 5; i < coche2.length; i++) {
            coche2[i] = new Thread(new Coche(p, i, false));

        }
        for (int i = 0; i < coche1.length; i++) {
            coche1[i].start();
        }
        for (int i = 5; i < coche2.length; i++) {
            coche2[i].start();

        }

    }
}
