package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;

public class Autenticacao {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu usuário: ");
        String usuario = leitor.nextLine();
        
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        
        do {
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Usuário: ");
            usuario = leitor.nextLine();
            System.out.println("Senha:");
            senha = leitor.nextLine();
            
        } while (!senha.equals("#Bandtec") || !"admin".equals(usuario));
        
        System.out.println("Login realizado com sucesso");
    }
}
