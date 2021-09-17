package br.com.bandtec.projeto.poo;

public class TesteAluno {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.ra = "02211047";
        aluno1.nome = "Matheus Cunha";
        aluno1.nota1 = 8.5;
        aluno1.nota2 = 7.2;
        aluno1.calcularMedia();
        
        String exibicao = "RA: %s\t Nome: %s\t Nota 1: %.1f\t Nota 2: %.1f\t Situação: %s";
        //Print endereço em memória
        //System.out.println(aluno1);

        Aluno aluno2 = new Aluno();

        aluno2.ra = "02211024";
        aluno2.nome = "Giovanna Butini";
        aluno2.nota1 = 9.0;
        aluno2.nota2 = 10.0;
        aluno2.calcularMedia();
        
        System.out.println(String.format(exibicao, aluno1.ra, aluno1.nome,
                aluno1.nota1, aluno1.nota2, aluno1.aprovado ? "APROVADO" : "REPROVADO"));

        System.out.println(String.format(exibicao, aluno2.ra, aluno2.nome,
                aluno2.nota1, aluno2.nota2, aluno2.aprovado ? "APROVADO" : "REPROVADO"));
    }
}
