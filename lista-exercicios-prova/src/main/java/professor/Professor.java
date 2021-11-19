package professor;

public class Professor {
    protected Integer codigo;
    protected String nome;
    protected Integer qtdHoras;
    protected Double valorHora;

    public Professor(Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        this.codigo = codigo;
        this.nome = nome;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Integer qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
    
    public Double calcularSalario() {
        return (this.qtdHoras * this.valorHora) * 4.5;
    }

    @Override
    public String toString() {
        return String.format("\nProfessor:\n- Código: %d\n- Nome: %s\n- Qtd. Horas: "
                + "%d\n- Valor Hora: %.2f\nSALÁRIO PROFESSOR: %.2f", 
                this.codigo, this.nome, this.qtdHoras, this.valorHora, this.calcularSalario());
    }
  
}
