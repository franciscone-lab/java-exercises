package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Integer posicaoSorteio = 0;
        Integer numeroCerto = 0;

        System.out.println("Digite um número de 1 a 100: ");
        Integer numeroEscolhido = leitor.nextInt();

        for (Integer sorteios = 0; sorteios < 200; sorteios++) {
            Integer numeroSorteio = ThreadLocalRandom.current().nextInt(0, 200);
            if (numeroSorteio.equals(numeroEscolhido)) {
                numeroCerto++;
                posicaoSorteio = sorteios;
            } else if (numeroSorteio % 2 == 0) {
                numerosPares++;
            } else if (numeroSorteio % 2 == 1) {
                numerosImpares++;
            }
        }

        System.out.println("O número " + numeroEscolhido + " apareceu " +
                numeroCerto + " vezes! Sendo o primeiro no " +posicaoSorteio+
                "º sorteio." + "\nQtd. de números pares sorteados: " + 
                numerosPares + "\nQtd. de números ímpares sorteados: " 
                + numerosImpares);
    }
}
