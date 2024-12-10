package org.example.atividade04;

public class Contador implements Runnable{

    int valor;
    Thread[] threads = new Thread[5];

    public synchronized void incrementar() {
        valor++;
    }

    @Override
    public void run() {

        for(int i = 0; i < 100000; i++) {
            incrementar();
        }

        System.out.println("Thread " +  + Thread.currentThread().getId() + " terminou de incrementar");
    }

    public void threadsTrabalhando() {

        for(int i = 0; i < threads.length; i++) {

            try {
                threads[i] = new Thread(this);
                threads[i].start();
                threads[i].join();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Total: " + valor);
    }

}
