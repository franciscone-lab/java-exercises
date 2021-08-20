package br.com.bandtec.projeto2.nivelamento;

public class Numericos {

    public static void main(String[] args) {
        Double numero = 3.4;

        System.out.println("Número: " + numero);
        System.out.println(String.format("String format: %.2f", numero));
        System.out.println("Para cima: " + Math.ceil(numero));
        System.out.println("Para baixo: " + Math.floor(numero));

        // > 5 : para baixo, =< 5 : para cima. 
        System.out.println("Round: " + Math.round(numero));

        System.out.println("Inteirão: " + Integer.MAX_VALUE);
        System.out.println("Inteirinho: " + Integer.MIN_VALUE);

        System.out.println("Longão: " + Long.MAX_VALUE);
        System.out.println("Longuinho: " + Long.MIN_VALUE);

        System.out.println("Doublezão: " + Double.MAX_VALUE);
        System.out.println("Doublezinho: " + Double.MIN_VALUE);
    }
}
