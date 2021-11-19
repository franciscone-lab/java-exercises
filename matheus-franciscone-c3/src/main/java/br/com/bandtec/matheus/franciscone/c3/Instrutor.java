package br.com.bandtec.matheus.franciscone.c3;

public class Instrutor {

    protected String nome;
    protected Integer qtdHora;
    protected Double valorHora;

    public Instrutor(String nome, Integer qtdHora, Double valorHora) {
        this.nome = nome;
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    public Double calcularSalario() {
        return (this.qtdHora * this.valorHora) * 4.5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHora() {
        return qtdHora;
    }

    public void setQtdHora(Integer qtdHora) {
        this.qtdHora = qtdHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return String.format("Nome Instrutor: %s\nQtd. Horas Trabalhadas: %d\n"
                + "Valor hora: %.2f\nSalário Instrutor: %.2f",
                this.nome, this.qtdHora, this.valorHora, this.calcularSalario());
    }

}
