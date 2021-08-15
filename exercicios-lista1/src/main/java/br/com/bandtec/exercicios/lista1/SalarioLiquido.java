package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class SalarioLiquido {

    public static void main(String[] args) {

        Scanner leitorSalario = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        Double salarioBruto = leitorSalario.nextDouble();

        System.out.println("Digite a condução diária só de ida da casa para o"
                + "trabalho: ");
        Double vt = leitorSalario.nextDouble();

        Double descontosTotais = (((salarioBruto * 0.1) + (salarioBruto * 0.2))
                + (vt * 2 * 22));

        System.out.println(String.format("Seu salário bruto é R$ %.2f, tem um total "
                + "de R$ %.2f em descontos e receberá um líquido de R$ %.2f",
                salarioBruto,
                descontosTotais, (salarioBruto - descontosTotais)));

    }
}
