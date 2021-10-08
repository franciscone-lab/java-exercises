package br.com.bandtec.matheus.franciscone.c2;

public class Desenvolvedor {

    private Integer id;
    private String nome;
    private String cargo;
    private Boolean ativo;
    private Double salario;

    public Desenvolvedor(Integer id, String nome, String cargo) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.ativo = true;
        this.salario = 0.0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\nNome: %s\nCargo: %s\nAtivo: %s\n"
                + "Valor a receber: %.2f",
                id, nome, cargo, ativo ? "Sim" : "Não", salario);
    }

}
