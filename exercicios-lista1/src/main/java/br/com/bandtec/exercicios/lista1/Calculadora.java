package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Double numeroUm = terminal.nextDouble();

        System.out.println("Digite outro número: ");
        Double numeroDois = terminal.nextDouble();

        System.out.println(String.format("Resultado da soma: %.2f \n Resultado da"
                + " subtração: "
                + "%.1f \n Resultado da multiplicação: %.1f \n Resultado da divisão: "
                + "%.1f", (numeroUm + numeroDois), (numeroUm - numeroDois),
                (numeroUm * numeroDois), (numeroUm / numeroDois)));
    }
}
