package br.com.bandtec.projeto2.nivelamento;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomicos {

    public static void main(String[] args) {
        // Math.random();
        System.out.println("Usando Math.random()");
        System.out.println(Math.random() * 10);

        System.out.println("\n" + "-".repeat(30));

        // Random - classe resposável por gerar randômicos
        Random gerador = new Random();
        System.out.println("\nUsando Classe Random");
        System.out.println("Random: int");
        System.out.println(gerador.nextInt(10));
        System.out.println("\nRandom: double");
        System.out.println(gerador.nextDouble());
        System.out.println("\nRandom: boolean");
        System.out.println(gerador.nextBoolean());

        System.out.println("\n" + "-".repeat(30));

        System.out.println("\nUsando o ThreadLocalRandom");
        System.out.println(ThreadLocalRandom.current().nextInt(-10, 11));
        System.out.println(ThreadLocalRandom.current().nextDouble());
        System.out.println(ThreadLocalRandom.current().nextBoolean());

    }
}
