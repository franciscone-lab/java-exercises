package br.com.bandtec.projeto.heranca;

public class App {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(1, "Matheus Cunha");
        AlunoGraduacao matheus = new AlunoGraduacao(2, "Matheus Franciscone");
        
        System.out.println(aluno);
        System.out.println("-------");
        System.out.println(matheus);
    }
}
