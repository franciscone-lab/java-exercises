package br.com.bandtec.projeto1.nivelamento;

public class Tipos {

    // Torna a classe executável
    // Indicação do ponto de entrada/partida da nossa aplicação
    public static void main(String[] args) {

        /*
         * Tipos primitivos:
         * int
         * double
         * boolean
         * NÃO ACEITAM "null"
         * 
         * Classes Wrapper:
         * Integer
         * Double
         * Boolean
         * ACEITAM "null"
         */
        // String: tipo para texto (alfanuméricos)
        String nome = "Matheus";
        String faculdade = "BandTec";
        String professor = "Diego";

        // Integer: utilizaremos para númericos inteiros
        Integer idade = 19;
        Integer idadeDiego = 28;
        Integer numeroDaSorte = 42;

        // Double: tipo para números com casas decimais
        Double valor = 10.50;
        Double altura = 1.85;

        // Boolean: para representar verdadeiro ou falso
        Boolean ligado = true;
        Boolean temMundial = false;
        Boolean eMaior = idadeDiego > 30;
        // System.out.println(eMaior);

    }
}
