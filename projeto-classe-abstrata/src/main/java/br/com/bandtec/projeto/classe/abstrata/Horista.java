package br.com.bandtec.projeto.classe.abstrata;

public class Horista extends Funcionario {

    private Integer qtdHora;
    private Double valorHora;

    public Horista(String cpf, String nome, Integer qtdHora, Double valorHora) {
        super(cpf, nome);
        this.qtdHora = qtdHora;
        this.valorHora = valorHora;
    }

    @Override
    public Double calcSalario() {
        return qtdHora * valorHora;
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
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("Horista: \n");
        sb.append("\nNome: ").append(this.getNome());
        sb.append("\nCPF: ").append(this.getCpf());
        sb.append("\nQtd. Hora: ").append(qtdHora);
        sb.append("\nValor Hora: R$ ").append(valorHora);
        sb.append("\nSalário: R$ ").append(this.calcSalario());
        sb.append('\n');
        return sb.toString();
    }

}
