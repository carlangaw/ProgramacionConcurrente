/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tp4ej14;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Carla Nuñez
 */
public class Confiteria {

    private Semaphore semMesa;
    private Semaphore SemMozo;
    private Semaphore SemCocinero;
    private Semaphore SemComida;
    private Semaphore BebidaEntregada;
    private int sillas;
    public static final String NEGRO = "\u001B[30m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public Confiteria() {
        //   semMesa = new Semaphore(1);
        SemMozo = new Semaphore(0);
        SemCocinero = new Semaphore(0);
        SemComida = new Semaphore(0);
        BebidaEntregada = new Semaphore(0);
        sillas = 2;

    }

    public synchronized boolean sentarse(String nom) throws InterruptedException {
        boolean entre = false;
        if (sillas > 0 && sillas < 3) {
            System.out.println("\u001B[32m El empleado:" + nom + " Se sienta el mesa ");
            entre = true;
            sillas--;

        } else {
            System.out.println("\u001B[36m El empleado:" + nom + " No se pudo sentar, vuelve mas tarde ");
        }
        return entre;
    }

    public synchronized void solicitarBebida(String nom) throws InterruptedException {
        SemMozo.release();
        System.out.println(nom + " : Solicita bebida");
        BebidaEntregada.acquire();
    }

    public void solicitarComida(String nom) {
        System.out.println(nom + " : Solicita comida");
        SemCocinero.release();
    }

    public void comer() throws InterruptedException {
        SemComida.acquire();
        System.out.println("\u001B[32m Estoy comiendo");
        Thread.sleep(2000);

    }

    public synchronized void irse(String nom) {
        sillas++;
        System.out.println("\u001B[32m" + nom + ": Terminé, me voy ");

    }

    public void atender(String nom) throws InterruptedException {
        System.out.println("\u001B[31m El mozo: " + nom + " está esperando empleado, mientras inventa nuevas versiones de pollo");
        SemMozo.acquire();
        System.out.println("\u001B[31m El mozo: " + nom + "le lleva la lista al empleado y espera");
        Thread.sleep(3000);
        BebidaEntregada.release();
        System.out.println("Bebida entregada");

    }

    public void cocinar(String nom) throws InterruptedException {
        System.out.println("\u001B[31m El cocinero: " + nom + " está esperando orden, mientras ordena su cocina");
        SemCocinero.acquire();
        System.out.println("\u001B[33m " + nom + ": está cocinando...");
        Thread.sleep(3000);
        System.out.println("\u001B[33m La comida está lista");
        SemComida.release();

    }

}
