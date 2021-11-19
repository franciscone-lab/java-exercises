package consultoria;

public class Desenvolvedor {

    protected String nome;
    protected Integer qtdHorasTrabalhadas;
    protected Double valorHoraTrabalhada;

    public Desenvolvedor(String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        this.nome = nome;
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public Double getSalario() {
        return this.valorHoraTrabalhada * this.qtdHorasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHorasTrabalhadas() {
        return qtdHorasTrabalhadas;
    }

    public void setQtdHorasTrabalhadas(Integer qtdHorasTrabalhadas) {
        this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
    }

    public Double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(Double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s\nQtd. Horas Trabalhadas: %d\nValor Hora Trabalhada: %.2f\nSALÁRIO: %.2f", this.nome, this.qtdHorasTrabalhadas, this.valorHoraTrabalhada, this.getSalario());
    }
}
