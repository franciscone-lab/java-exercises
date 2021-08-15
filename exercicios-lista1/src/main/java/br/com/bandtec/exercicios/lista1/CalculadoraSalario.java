package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class CalculadoraSalario {

    public static void main(String[] args) {
        Scanner leitorSalario = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        Double salario = leitorSalario.nextDouble();

        System.out.println("Digite a porcentagem do imposto: ");
        Integer imposto = leitorSalario.nextInt();

        System.out.println(String.format("Salário: R$ %.2f \t Imposto: %d "
                + "\t Salário líquido: R$ %.2f",
                salario, imposto, (salario - (salario * imposto / 100))));
    }
}
