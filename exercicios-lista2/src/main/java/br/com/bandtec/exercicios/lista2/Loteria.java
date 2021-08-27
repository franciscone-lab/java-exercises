package br.com.bandtec.exercicios.lista2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer qtdTentativas = 0;  
        
        System.out.println("Digite um número de 0 a 10: ");
        Integer tentativa  = leitor.nextInt();
        
        while (!tentativa.equals(numeroSorteado)) {            
            System.out.println("Digite novamente...");
            tentativa = leitor.nextInt();
            qtdTentativas++;
        }
        
        if (qtdTentativas < 3) {
            System.out.println("Você é MUITO sortudo");
        } else if (qtdTentativas >= 4 || qtdTentativas <= 10) {
            System.out.println("Você é Sortudo!");
        } else {
            System.out.println("É melhor você para de apostar e ir trabalhar");
        }
    }
}
