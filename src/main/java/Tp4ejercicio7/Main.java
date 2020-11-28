/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp4ejercicio7;

/**
 *
 * @author Carla Nuñez
 */
public class Main {

    public static void main(String[] args) {
        CentroImpresion imagen = new CentroImpresion();
        Thread[] clientes = new Thread[9];

        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = new Thread(new ClienteImpresion("Cliente " + i, imagen));

        }
        for (int i = 0; i < clientes.length; i++) {
            clientes[i].start();

        }
    }
}
