package br.com.bandtec.matheus.franciscone.c3;

import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nome;
    private Integer vagas;
    private List<Instrutor> instrutores;

    public Academia(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.instrutores = new ArrayList<>();
    }

    public void contratarInstrutor(Instrutor instrutor) {
        if (instrutores.size() < vagas) {
            instrutores.add(instrutor);
        } else {
            System.out.println(String.format("A academia %s não possuí vagas disponíveis", this.nome));
        }
    }

    public void exibirInstrutores() {
        if (instrutores.isEmpty()) {
            System.out.println(String.format("A academia %s não possuí instrutores", this.nome));
        } else {
            for (Instrutor listaInstrutores : instrutores) {
                System.out.println(listaInstrutores);
            }
        }
    }

    public void exibePersonalTrainers() {
        if (instrutores.isEmpty()) {
            System.out.println(String.format("A academia %s não possuí instrutores", this.nome));
        } else {
            for (Instrutor listaInstrutores : instrutores) {
                if (listaInstrutores instanceof Personal) {
                    System.out.println(listaInstrutores);
                }
            }
        }
    }

    public void exibeFolhaDePagamento() {
        Double salarioTotal = 0.0;
        System.out.println("-".repeat(30));
        System.out.println("FOLHA SALARIAL");
        System.out.println("-".repeat(30));
        for (Instrutor listaInstrutores : instrutores) {
            System.out.println(String.format("Nome: %s\nSalário: %.2f",
                    listaInstrutores.getNome(), listaInstrutores.calcularSalario()));
            salarioTotal += listaInstrutores.calcularSalario();
        }
        System.out.println(String.format("\nTotal Funcionários: %d, Total a ser pago: %.2f",
                this.instrutores.size(), salarioTotal));
    }

    public Instrutor buscarInstrutor(String nome) {
        
        for (Instrutor listaInstrutores : instrutores) {
            if (nome.equals(listaInstrutores.getNome())) {
                return listaInstrutores;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Academia: %s\nVagas: %d\nVagas Restantes: %d",
                this.nome, this.vagas, vagas - this.instrutores.size());
    }

}
