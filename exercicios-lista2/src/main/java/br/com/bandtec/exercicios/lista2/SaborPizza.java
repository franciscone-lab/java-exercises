package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;

public class SaborPizza {

    public static void main(String[] args) {
        System.out.println("Foi feita uma pesquisa para saber qual o sabor de "
                + "pizza favorito entre os alunos da Faculdade. "
                + "Para votar no sabor mussarela, deve-se digitar o valor 5, "
                + "Para votar no sabor calabresa, deve-se digitar o valor 25, "
                + "Para votar no sabor quatro queijos, "
                + "deve-se digitar o valor 50.");

        Scanner leitor = new Scanner(System.in);
        Integer saborPizza = 0;
        Integer mussarela = 0;
        Integer calabresa = 0;
        Integer quatroQueijos = 0;

        do {
            System.out.println("Escolha um sabor de pizza: ");
            Integer saborEscolhido = leitor.nextInt();
            switch (saborEscolhido) {
                case 5:
                    mussarela++;
                    break;
                case 25:
                    calabresa++;
                    break;
                case 50:
                    quatroQueijos++;
                    break;
                default:
                    break;
            }
            saborPizza++;
        } while (saborPizza < 10);
        
        System.out.println("Votos:" + 
                "\nMussarela: " + mussarela +
                "\nCalabresa: " + calabresa +
                "\nQuatro queijos: " +quatroQueijos);
        if (mussarela > quatroQueijos && mussarela > calabresa) {
            System.out.println("\nSabor favorito: Mussarela");
        } else if (calabresa > quatroQueijos && calabresa > mussarela) {
            System.out.println("\nSabor favorito: Calabresa");
        } else {
            System.out.println("\nSabor favorito: Quatro queijos");
        }
    }
}
