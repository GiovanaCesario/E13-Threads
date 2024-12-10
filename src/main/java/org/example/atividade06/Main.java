
package org.example.atividade06;


public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        int numProdutores = 7;
        int numConsumidores = 10;

        for (int i = 0; i < numProdutores; i++) {
            new Thread(new Produtor(fila)).start();
        }

        for (int i = 0; i < numConsumidores; i++) {
            new Thread(new Consumidor(fila)).start();
        }
    }
}
