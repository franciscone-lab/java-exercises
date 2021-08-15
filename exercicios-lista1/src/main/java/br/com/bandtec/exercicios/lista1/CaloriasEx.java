package br.com.bandtec.exercicios.lista1;

import java.util.Scanner;

public class CaloriasEx {

    public static void main(String[] args) {
        Scanner leitorCalorias = new Scanner(System.in);

        System.out.println("Minutos se aquecendo:");
        Integer aquecimento = leitorCalorias.nextInt();

        System.out.println("Minutos fazendo exercícios aeróbicos:");
        Integer aerobico = leitorCalorias.nextInt();

        System.out.println("Minutos fazendo musculação:");
        Integer musculacao = leitorCalorias.nextInt();

        System.out.println(String.format("Olá, Jorge. Você fez um total de %d "
                + "minutos de exercícios e perdeu cerca de %d calorias",
                (aquecimento + aerobico + musculacao), (aquecimento * 12)
                + (aerobico * 20) + (musculacao * 25)));
    }
}
