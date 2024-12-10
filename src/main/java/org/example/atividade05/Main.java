package org.example.atividade05;

public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        Thread consumidor = new Thread(new Consumidor(fila));
        Thread produdor = new Thread(new Produtor(fila));

        consumidor.start();
        produdor.start();
    }
}
