package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Sorteio {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Integer posicaoSorteio = 0;
        Boolean encontrou = false;

        System.out.println("Digite um número de 1 a 100: ");
        Integer numeroEscolhido = leitor.nextInt();

        while (numeroEscolhido < 0 || numeroEscolhido > 100) {
            System.err.println("Digite um valor válido (entre 1 à 100)");
            numeroEscolhido = leitor.nextInt();
        }

        for (Integer sorteios = 0; sorteios < 200; sorteios++) {
            Integer numeroSorteio = ThreadLocalRandom.current().nextInt(0, 200);
            if (numeroSorteio.equals(numeroEscolhido) && !encontrou) {
                posicaoSorteio = sorteios;
                encontrou = true;
            }

            if (numeroSorteio % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }
        }

        if (encontrou) {
            System.out.println(String.format("O número %d foi sorteado na posição %d"
                    + "º sorteio.\nQtd. de números pares sorteados: %d\nQtd de números"
                    + " impares sorteados: %d", numeroEscolhido, posicaoSorteio,
                    numerosPares, numerosImpares));
        } else {
            System.out.println(String.format("O número %d não foi sorteado...",
                    numeroEscolhido));
        }

    }
}
