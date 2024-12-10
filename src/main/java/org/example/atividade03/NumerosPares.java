package org.example.atividade03;

import java.util.Random;

public class NumerosPares implements Runnable {

    Comunicacao comunicacao;

    public NumerosPares(Comunicacao comunicacao) { this.comunicacao = comunicacao; }

    @Override
    public void run() {

        int i = 0;

        while (true) {

            try {

                if (i % 2 == 0) {
                    comunicacao.imprimirNumeroPar(i);
                }
                i++;

                Thread.sleep(new Random().nextInt(1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
