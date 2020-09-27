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
public class Jugador {

    int vida = 10;

    public int obtenerVida() {
        return vida;
    }

    public void setVida(int a) {
        this.vida = a;
    }

    public synchronized void curar() {

        this.setVida((this.obtenerVida()) + 3);

        System.out.println("Vida curada, VIDA: " + this.obtenerVida());
    }

    public synchronized void quitarVida() {

        this.setVida((this.obtenerVida()) - 3);
        System.out.println("vida restada, VIDA: " + this.obtenerVida());

    }
}
