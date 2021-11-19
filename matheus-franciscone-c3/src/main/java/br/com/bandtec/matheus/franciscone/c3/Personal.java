package br.com.bandtec.matheus.franciscone.c3;

public class Personal extends Instrutor {

    private Integer qtdHoraPersonal;
    private Double valorHoraPersonal;

    public Personal(Integer qtdHoraPersonal, Double valorHoraPersonal, String nome, Integer qtdHora, Double valorHora) {
        super(nome, qtdHora, valorHora);
        this.qtdHoraPersonal = qtdHoraPersonal;
        this.valorHoraPersonal = valorHoraPersonal;
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + ((this.qtdHoraPersonal * valorHoraPersonal) * 4.5);
    }

    public Integer getQtdHoraPersonal() {
        return qtdHoraPersonal;
    }

    public void setQtdHoraPersonal(Integer qtdHoraPersonal) {
        this.qtdHoraPersonal = qtdHoraPersonal;
    }

    public Double getValorHoraPersonal() {
        return valorHoraPersonal;
    }

    public void setValorHoraPersonal(Double valorHoraPersonal) {
        this.valorHoraPersonal = valorHoraPersonal;
    }

    @Override
    public String toString() {
        return String.format("Nome Instrutor: %s\n"
                + "Qtd. Horas Trabalhadas: %d\n"
                +"Valor hora: %.2f\n"
                + "Salário Instrutor: %.2f\n"
                + "Personal:\n"
                + "Qtd. Horas trabalhadas: %d\n"
                + "Valor hora: %.2f\n"
                + "Total Salário: %.2f",
                this.nome, this.qtdHora, this.valorHora,super.calcularSalario(),
                this.qtdHoraPersonal,this.valorHoraPersonal, this.calcularSalario());
    }

}
