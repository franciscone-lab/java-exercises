package br.com.bandtec.matheus.franciscone.c1;

import java.util.Scanner;

public class VendaLivro {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Bem-vindo escritor! Realize o controle do lançamento de seu livro:");
        System.out.println("Quantidade de livros em estoque:");
        Integer qtdLivrosEstoque = leitor.nextInt();

        System.out.println("Meta de venda dos livros (%)");
        Integer metaVendas = leitor.nextInt();

        Integer qtdExemplaresMeta = (metaVendas * 100) / qtdLivrosEstoque;
        System.out.println(String.format("Para atingir a meta, você precisa vender %d livros!", qtdExemplaresMeta));

        System.out.println("Escolha os próximos passos\n1 - Vender Livros\n2 - Sair");
        Integer passoEscolhido = leitor.nextInt();

        while (passoEscolhido != 2) {
            switch (passoEscolhido) {
                case 1:
                    System.out.println("Digite a quantidade de livros escolhida:");
                    Integer qtdLivrosEscolhida = leitor.nextInt();
                    while (qtdLivrosEscolhida > qtdLivrosEstoque) {
                        System.out.println(String.format("Infelizmente você não possui exemplares suficientes para venda.\nQuantidade disponível: %d\nDigite uma quantidade válida:", qtdLivrosEstoque));
                        qtdLivrosEscolhida = leitor.nextInt();
                    }

                    for (int i = 1; i <= qtdLivrosEscolhida; i++) {
                        System.out.println(String.format("Vendendo %dº livro", i));
                        qtdLivrosEstoque--;
                    }

                    System.out.println(String.format("Você acabou de vender %d livros!\nQuantidade em estoque: %d\nMeta de vendas: %d", qtdLivrosEscolhida, qtdLivrosEstoque, metaVendas));

                    break;
                default:
                    System.out.println("Número Inválido");
                    passoEscolhido = leitor.nextInt();
                    break;
            }
        }
        System.out.println("Até logo!");

    }
}
