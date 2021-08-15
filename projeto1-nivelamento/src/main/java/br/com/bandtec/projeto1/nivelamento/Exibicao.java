package br.com.bandtec.projeto1.nivelamento;

public class Exibicao {

    public static void main(String[] args) {
        /*
         * Para a exibição do console, utilizaremos:
         * System.out.println();
         */

        System.out.println("Matheus");
        System.out.println(19);
        System.out.println(19 + 42);
        System.out.println(true);

        Integer numero = 20;

        System.out.println(numero);

        /*
         * Operadores aritméticos básicoas:
         * + -> adição
         * - -> subtração
         * * -> multiplicação
         * / -> divisão
         *
         * Incremento ou decremento:
         * ++
         * --
         * +=1
         * -=1
         * *=
         * /=
         */
        String nome = "Matheus";
        Integer idade = 19;
        Double credito = 200.0;
        Double passagens = credito / 4.40;

        /*
         * \n -> possibilita quebra de linha na exibição
         * \t -> possibilita tabulação de linha na eibição
         */
        System.out.println("Nome: " + nome + "\n"
                + "Idade: " + idade + "\n"
                + "Saldo: " + credito);
        System.out.println("Passagens disponíveis: " + passagens.intValue());

    }
}
