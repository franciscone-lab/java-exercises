package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class CalculadoraTroco {

    public static void main(String[] args) {
        Scanner leitorTroco = new Scanner(System.in);

        System.out.println("Digite o valor unitário do produto: ");
        Double valorUnitario = leitorTroco.nextDouble();

        System.out.println("Quantidade vendida: ");
        Integer qtdVendida = leitorTroco.nextInt();

        System.out.println("Valor pago pelo cliente: ");
        Double valorPago = leitorTroco.nextDouble();

        System.out.println(String.format("Seu troco será de R$ %.2f", 
                valorPago - (valorUnitario * qtdVendida)));
    }
}
