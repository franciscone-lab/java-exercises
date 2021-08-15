package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner leitorIdade = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitorIdade.nextLine();

        System.out.println(String.format("Olá, %s! Qual o ano de seu nascimento?",
                 nome));
        Integer anoNascimento = leitorIdade.nextInt();

        System.out.println(String.format("Em 2030 você terá %s anos",
                (2030 - anoNascimento)));
    }
}
