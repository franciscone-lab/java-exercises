package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;

public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer somaNumeros = 0;
        System.out.println("Digite um número: ");
        Integer numeroDigitado = leitor.nextInt();

        do {
            somaNumeros += numeroDigitado;
            System.out.println("Digite novamente...");
            numeroDigitado = leitor.nextInt();

        } while (numeroDigitado != 0);

        System.out.println("Soma de números lidos: " + somaNumeros);
    }
}
