package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numeroTabuada = leitor.nextInt();
        
        System.out.println("\n");
        System.out.println("Tabuada do " + numeroTabuada);
        System.out.println("\n");
        for (int i = 0; i <= 10; i++) {

            System.out.println(numeroTabuada + " X " + i + " = "
                    + numeroTabuada * i);
        }
    }
}
