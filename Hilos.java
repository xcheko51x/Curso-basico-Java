/*
    Multithreading es una característica de Java que permite la ejecución concurrente de dos o más partes de un programa 
    para una utilización máxima de la CPU. Cada parte de dicho programa se llama hilo. 
    Entonces, los hilos son procesos livianos dentro de un proceso.

    Los hilos se pueden crear utilizando dos mecanismos:

     - Extender la clase Thread
     - Implementar la interfaz Runnable
*/

class Hilos {
    public static void main(String[] args) {

        /*
        // EXTENDS THREAD
        new NuevoHiloThread(); // crea un nuevo hilo
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo principal: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo principal.");
        }
        System.out.println("Sale del hilo principal.");

        // IMPLEMENTACION DE RUNNABLE
        new NuevoHilo(); // crea un nuevo hilo
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo principal: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo principal.");
        }
        System.out.println("Sale del hilo principal."); */

        // MULTI HILOS
        new MultiHilos("Uno"); // comienzan los hilos
        new MultiHilos("Dos");
        new MultiHilos("Tres");
        try {
            // espera un tiempo para que terminen los otros hilos
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo principal");
        }
        System.out.println("Sale del hilo principal.");
    }
}

// IMPLEMENTACION DE EXTENDS THREAD
class NuevoHiloThread extends Thread {
    NuevoHiloThread() {
        super("Hilo Demo"); // Crea un nuevo hilo
        System.out.println("Hilo hijo: " + this);
        start(); // Comienza el hilo
    }

    public void run() {// Este es el punto de entrada del segundo hilo
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo hijo.");
        }
        System.out.println("Sale del hilo hijo.");
    }
}

// IMPLEMENTACION DE RUNNABLE
class NuevoHilo implements Runnable {
    Thread hilo;

    NuevoHilo() {
        hilo = new Thread(this, "Hilo hijo");// Crea un nuevo hilo
        System.out.println("Hilo hijo: " + hilo);
        hilo.start(); // Comienza el hilo
    }

    public void run() {// Punto de entrada del segundo hilo
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Hilo hijo: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupcion del hilo hijo.");
        }
        System.out.println("Sale del hilo hijo.");
    }
}

class MultiHilos implements Runnable {
    String nombre; // nombre del hilo
    Thread hilo;

    MultiHilos(String nombreHilo) {
        nombre = nombreHilo;
        hilo = new Thread(this, nombre);
        System.out.println("Nuevo hilo: " + hilo);
        hilo.start(); // Comienza el hilo
    }

    // Este es el punto de entrada del hilo.
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(nombre + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(nombre + "Interrupcion del hilo hijo" + nombre);
        }
        System.out.println("Sale del hilo hijo" + nombre);
    }
}