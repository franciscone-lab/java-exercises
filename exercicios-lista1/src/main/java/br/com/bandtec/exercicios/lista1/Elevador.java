package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class Elevador {

    public static void main(String[] args) {
        Scanner leitorElevador = new Scanner(System.in);
        
        System.out.println("Limite de peso do elevador: ");
        Double limitePeso = leitorElevador.nextDouble();
        
        System.out.println("Limite de pessoas em um elevador: ");
        Integer limitePessoas = leitorElevador.nextInt();
        
        System.out.println("Peso da 1ª pessoa: ");
        Double pessoa1 = leitorElevador.nextDouble();
        
        System.out.println("Peso da 2ª pessoa: ");
        Double pessoa2 = leitorElevador.nextDouble();
        
        System.out.println("Peso da 3ª pessoa: ");
        Double pessoa3 = leitorElevador.nextDouble();        
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no "
                + "qual cabem %d pessoas.\n"
                + "O peso total no elevador é de %.2f, sendo que ele suporta %.2f.",
                limitePessoas, (pessoa1 + pessoa2 + pessoa3), limitePeso));
    }
}
