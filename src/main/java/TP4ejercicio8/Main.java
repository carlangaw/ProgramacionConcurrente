/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4ejercicio8;



/**
 *
 * @author Carla Nuñez
 */
public class Main {

    public static void main(String[] args) {
        Testigo bandera = new Testigo();
        Thread atleta1 = new Thread(new Atleta("Carla", 1, bandera));
        Thread atleta2 = new Thread(new Atleta("Matias", 2, bandera));
        Thread atleta3 = new Thread(new Atleta("Peluson", 4, bandera));
        Thread atleta4 = new Thread(new Atleta("Stuart", 3, bandera));
        atleta1.start();
        atleta2.start();
        atleta3.start();
        atleta4.start();

    }

}
