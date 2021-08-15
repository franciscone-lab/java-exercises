package br.com.bandtec.projeto1.nivelamento;

public class Interpolacao {

    public static void main(String[] args) {
        String nome = "Matheus";
        Integer idade = 19;
        Double altura = 1.85;
        Boolean aluno = true;

        /*
         * Interpolação de texto Java:
         * 
         * String.format(texto, variáveis)
         *
         */
        // Ternário
//        String alunoLabel = aluno ? "Sim" : "Não";
//        if (aluno) {
//            alunoLabel = "Sim";
//        } else {
//            alunoLabel = "Não";
//        }
        System.out.println(String.format("Nome: %s Idade: %d Altura: %.2f Aluno:"
                + " %s", nome, idade, altura, (aluno ? "Sim" : "Não")));
    }
}
