package org.example.atividade02;

public class Main {

    public static void main(String[] args) {

        Thread threadPares = new Thread(new NumerosPares());
        Thread threadImpares = new Thread(new NumerosImpares());

        threadImpares.start();
        threadPares.start();
    }
}
