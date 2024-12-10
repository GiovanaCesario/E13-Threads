package org.example.atividade05;

import java.util.Random;

public class Consumidor implements Runnable{

    Fila fila;

    public Consumidor(Fila fila) { this.fila = fila; }

    @Override
    public void run() {

        while (true) {

            try {
                fila.consumir();

                Thread.sleep(new Random().nextInt(1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
