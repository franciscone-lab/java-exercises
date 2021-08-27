package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a base: ");
        Integer base = leitor.nextInt();

        System.out.println("Digite o expoente: ");
        Integer expoente = leitor.nextInt();

        Integer resultado = 1;
        Double pr = Math.pow(base, expoente);
        
        for (int i = 1; i <= expoente; i++) {
            resultado *= base;
        }
        
        System.out.println("A prova real é: " + pr);
        System.out.println("O resultado do cálculo é " + resultado);
    }
}
