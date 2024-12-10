package org.example.atividade02;

import java.util.Random;

public class NumerosPares implements Runnable {

    @Override
    public void run() {

        int i = 0;

        while(true) {

            if(i % 2 == 0) {
                System.out.println(i);
            }
            i++;

            try {
                Thread.sleep(new Random().nextInt(1000));

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
