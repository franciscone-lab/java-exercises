package professor;

import java.util.ArrayList;
import java.util.List;

public class Faculdade {

    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public Faculdade(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public void contratarProfessor(Professor p) {
        if (professores.size() > this.vagas) {
            System.out.println("Vagas insuficientes...");
        } else {
            professores.add(p);
        }
    }

    public void exibirProfessor() {
        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado...");
        } else {
            for (Professor professor : professores) {
                System.out.println(professor);
            }
        }
    }

    public void exibirCoordenadores() {

        if (professores.isEmpty()) {
            System.out.println("Nenhum professor cadastrado...");
        } else {
            for (Professor professor : professores) {
                if (professor instanceof Coordenador) {
                    System.out.println(professor);
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Faculdade\n- Nome: %s\n- Vagas: %d"
                + "\n- Professores: %s", this.nome, this.vagas, this.professores);
    }
}
