package br.com.bandtec.projeto1.nivelamento;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        /*
         * ==
         * !=
         * <
         * >
         * >=
         * <=
         * &&
         * pipe pipe
         */
        Integer dia = 1;
//        
//        if (dia == 1) {
//            System.out.println("Domingo");
//        } else if ( dia == 2) {
//            System.out.println("Segunda-feira");
//        } else if (dia == 3) {
//            System.out.println("Terça-feira");
//        } else if (dia == 4) {
//            System.out.println("Quarta-feira");
//        } else if (dia == 5) {
//            System.out.println("Quinta-feira");
//        } else if (dia == 6) {
//            System.out.println("Sexta-feira");
//        } else if (dia == 7) {
//            System.out.println("Sábado");
//        } else {
//            System.out.println("Dia inválido!");
//        }

        // Uma das maneiras de comparar
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inexistente");
                break;
        }

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a faculdade:");
        String nomeFaculdade = leitor.nextLine();

        // Para comparar valor em String tem que ser ".equals(args)"
        // == em string compara local de armazenamento, não valor da variável.
        if (nomeFaculdade.equalsIgnoreCase("BandTec")) {
            System.out.println("Melhor faculdade!");
        } else {
            System.out.println("Deu ruim...");
        }
    }
}
