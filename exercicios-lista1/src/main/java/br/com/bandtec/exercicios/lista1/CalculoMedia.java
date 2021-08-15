package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class CalculoMedia {

    public static void main(String[] args) {
        Scanner leitorAluno = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeAluno = leitorAluno.nextLine();

        System.out.println("Digite a 1ª nota: ");
        Double nota1 = leitorAluno.nextDouble();

        System.out.println("Digite a 2ª nota: ");
        Double nota2 = leitorAluno.nextDouble();

        System.out.println(String.format("Olá, %s. Sua média foi de %.1f",
                nomeAluno, ((nota1 + nota2) / 2)));
    }
}
