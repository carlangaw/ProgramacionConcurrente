package eje2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carla Nuñez
 */
class ThreadTesting {

    public static void main(String[] args) {
        Thread miHilo = new MiEjecucion();
        miHilo.start();
        System.out.println("En el main");
    }
}
