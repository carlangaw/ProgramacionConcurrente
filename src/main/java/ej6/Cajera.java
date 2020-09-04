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
public class Cajera {

    private String nombre;
// Agregar Constructor, y métodos de acceso

    public void procesarCompra(Cliente cliente, long timeStamp) {
        System.out.println("La cajera " + this.nombre +
        " COMIENZA A
PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre() + " EN EL
        TIEMPO: " + (System.currentTimeMillis() - timeStamp) / 1000 +
"seg");
for (int i = 0; i < cliente.getCarroCompra().length; i++) {
            this.esperarXsegundos(cliente.getCarroCompra()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + "->Tiempo: " + (System.currentTimeMillis() - timeStamp)
                    / 1000 + "seg");
        }
        System.out.println("La cajera " + this.nombre +" HA TERMINADO DE
PROCESAR " + cliente.getNombre() + " EN EL TIEMPO: " +
(System.currentTimeMillis() - timeStamp
    

) / 1000 + "seg");
}
}
