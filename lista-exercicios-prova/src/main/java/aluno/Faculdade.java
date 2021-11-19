package aluno;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    protected String nome;
    protected Integer vagas;
    protected List<Aluno> listaAlunos;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.listaAlunos = new ArrayList<>();
    }

    public void matricularAluno(Aluno a) {
        if (listaAlunos.size() < vagas) {
            listaAlunos.add(a);
            System.out.println("ALUNO ADD COM SUCESSO");
            vagas--;
        } else {
            System.out.println("VAGAS INSUFICIENTES!");
        }
    }

    public void exibirAlunosMatriculados() {
        if (listaAlunos.isEmpty()) {
            System.out.println(String.format("A faculdade %s não possui alunos cadastrados.", nome));
        } else {
            for (Aluno alunos : listaAlunos) {
                System.out.println(alunos);
            }
        }
    }

    public void exibirAlunoPos() {
        if (listaAlunos.isEmpty()) {
            System.out.println("A faculdade não possui alunos cadastrados");
        } else {
            for (Aluno alunos : listaAlunos) {
                if (alunos instanceof AlunoPos) {
                    System.out.println(alunos);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Faculdade{" + "nome=" + nome + ", vagas=" + vagas + ", listaAlunos=" + listaAlunos + '}';
    }

}
