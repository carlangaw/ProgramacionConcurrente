/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3ejer3;

/**
 *
 * @author Carla Nuñez
 */
public class VariableCompartida {

    int cont = 0;

    public void control() {

        cont++;

        cont = (cont % 3);
    }

    public synchronized void imprimir() {

        if (cont == 0) {
            System.out.print("A");
            control();

        }

        if (cont == 1) {
            System.out.print("BB");
            control();
        }

        if (cont == 2) {
            System.out.print("CCC");
            control();
        }

    }
}
