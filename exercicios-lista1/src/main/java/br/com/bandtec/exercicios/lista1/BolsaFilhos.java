package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class BolsaFilhos {

    public static void main(String[] args) {
        Scanner leitorFilhos = new Scanner(System.in);

        System.out.println("Quantos filhos de 0 a 3 anos possui:");
        Integer filhos0a3 = leitorFilhos.nextInt();

        System.out.println("Quantos filhos de 4 a 16 anos possui:");
        Integer filhos4a16 = leitorFilhos.nextInt();

        System.out.println("Quantos filhos de 17 a 18 anos possui:");
        Integer filhos17a18 = leitorFilhos.nextInt();

        System.out.println(String.format("Você tem um total de %d filhos e vai "
                + "receber R$ %.2f de bolsa", (filhos0a3 + filhos4a16 + filhos17a18),
                (filhos0a3 * 25.12) + (filhos4a16 * 15.88) + (filhos17a18 * 12.44)));
    }
}
