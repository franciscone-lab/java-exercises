package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class UsoScanner {

    public static void main(String[] args) {

        // Representa um objeto ou uma "instância" do tipo Scanner
        Scanner leitor = new Scanner(System.in);
//        Scanner leitorNumero = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();

        System.out.println(String.format("Nome digitado: %s Idade digitada: %d "
                + "Altura digitada: %.2f", nome, idade, altura));
    }
}
