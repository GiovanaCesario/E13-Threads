package org.example.atividade06;

import java.util.Random;

public class Produtor implements Runnable {

    Fila fila;

    public Produtor(Fila fila) { this.fila = fila; }

    @Override
    public void run() {

        while (true) {

            try {
                fila.produzir(fila.size());

                Thread.sleep(new Random().nextInt(1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
