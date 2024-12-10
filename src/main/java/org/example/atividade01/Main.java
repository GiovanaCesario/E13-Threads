package org.example.atividade01;

public class Main {

    public static void main(String[] args) {

        PrimeiraThread Pthread = new PrimeiraThread();

        Thread thread = new Thread(Pthread);

        thread.start();
    }
}
