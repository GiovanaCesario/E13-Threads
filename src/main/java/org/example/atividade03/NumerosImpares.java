package org.example.atividade03;

import java.util.Random;

public class NumerosImpares implements Runnable {

    Comunicacao comunicacao;

    public NumerosImpares(Comunicacao comunicacao) { this.comunicacao = comunicacao; }

    @Override
    public void run() {

        int i = 0;

        while (true) {

            try {

                if (i % 2 != 0) {
                    comunicacao.imprimirNumeroImpar(i);
                }
                i++;

                Thread.sleep(new Random().nextInt(1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
