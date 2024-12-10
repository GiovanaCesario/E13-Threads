package org.example.atividade03;

public class Main {

    public static void main(String[] args) {

        Comunicacao comunicacao = new Comunicacao();

        Thread threadPares = new Thread(new NumerosPares(comunicacao));
        Thread threadImpares = new Thread(new NumerosImpares(comunicacao));

        threadImpares.start();
        threadPares.start();
    }
}
