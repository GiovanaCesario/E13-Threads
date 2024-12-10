package org.example.atividade03;

public class Comunicacao {

    boolean vezDoPar;

    public synchronized void imprimirNumeroPar(int i) throws InterruptedException {

        if (vezDoPar) {
            wait();
        }

        System.out.println(i);
        vezDoPar = !vezDoPar;
        notify();
    }

    public synchronized void imprimirNumeroImpar(int i) throws InterruptedException {

        if (!vezDoPar) {   //Vez do impar
            wait();
        }

        System.out.println(i);
        vezDoPar = !vezDoPar;
        notify();
    }
}
