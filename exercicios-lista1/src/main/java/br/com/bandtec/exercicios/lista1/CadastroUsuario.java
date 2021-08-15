package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class CadastroUsuario {

    public static void main(String[] args) {
        Scanner leitorUsuario = new Scanner(System.in);

        System.out.println("Login:");
        String login = leitorUsuario.nextLine();

        System.out.println("Senha: ");
        String senha = leitorUsuario.nextLine();

        System.out.println("Quantidade de vezes que seja aceitável o erro: ");
        Integer erro = leitorUsuario.nextInt();

        System.out.println(String.format("Seu login é %s e sua senha é %s. "
                + "Você tem %d tentativas antes de ser bloqueado", login, senha,
                erro));
    }
}
