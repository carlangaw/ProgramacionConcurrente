/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6;

/**
 *
 * @author Carla Nuñez
 */
public class Cliente {

    private String nombre;
    private int[] carroCompra;
// Constructor y métodos de acceso

    public Cliente(String nombre, int[] carroCompra) {
        this.nombre = nombre;
        this.carroCompra = carroCompra;

    }

    public String getNombre() {
        return this.nombre;
    }

    public int[] getCarroCompra() {
        return this.carroCompra;
    }
}
