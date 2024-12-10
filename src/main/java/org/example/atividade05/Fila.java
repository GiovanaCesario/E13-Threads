package org.example.atividade05;

import java.util.ArrayList;
import java.util.List;

public class Fila {

    List<Integer> fila = new ArrayList<>();

    public synchronized void produzir(int i) throws InterruptedException {

        while (fila.size() == 10) {   //Se a fila estiver cheia
            wait();
        }

        fila.add(i);
        System.out.println("Produziu: " + i);
        notify();
    }

    public synchronized void consumir() throws InterruptedException {

        if (fila.isEmpty()) {   //Se estiver vazia
            wait();
        }

        System.out.println("Removeu: " + fila.get(0));
        fila.remove(0);
        notify();
    }

    public int size() {
        return fila.size();
    }
}
