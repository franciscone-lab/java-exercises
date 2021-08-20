package br.com.bandtec.projeto2.nivelamento;

import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {

        System.out.println("Exemplo 01: for");

        for (Integer i = 0; i <= 10; i++) {
            System.out.println("Loop: " + i);
        }

        System.out.println("\nExemplo 02: while");
        Integer i = 0;
        while (i <= 10) {
            System.out.println("Loop: " + i);
            i++;
        }

        Scanner registro = new Scanner(System.in);

        System.out.println("Digite a resposta para vida: ");
        Integer numeroDigitado = registro.nextInt();

        while (numeroDigitado != 42) {
            System.out.println("Resposta errada ...");
            System.out.println("Digite novamente: ");
            numeroDigitado = registro.nextInt();
        }

        System.out.println("A resposta para vida é: " + numeroDigitado);

        System.out.println("\nExemplo 03: do while");
        Integer numeroDigitado2;

        do {
            System.out.println("Digite novamente: ");
            numeroDigitado2 = registro.nextInt();

        } while (numeroDigitado2 != 42);
    }
}
