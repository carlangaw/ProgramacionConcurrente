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
public class CajeraThread extends Thread {

    private String nombre;
    private Cliente cliente;
    private long initialTime;
// Constructor, y métodos de acceso

    public void run() {
        System.out.println("La cajera " + this.nombre
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1) + "del cliente " + this.cliente.getNombre() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }
        System.out.println("La cajera" + this.nombre + "HA TERMINADO DEPROCESAR" + this.cliente.getNombre() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
    }

    public void esperarXsegundos(int delay) {

        try {
            Thread.sleep(delay * 1000);

        } catch (Exception e) {

        }

    }
}
