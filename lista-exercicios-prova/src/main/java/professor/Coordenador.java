package professor;

public class Coordenador extends Professor {

    private Integer qtdHorasCoord;
    private Double valorHoraCoord;
    private String curso;

    public Coordenador(Integer qtdHorasCoord, Double valorHoraCoord, String curso, Integer codigo, String nome, Integer qtdHoras, Double valorHora) {
        super(codigo, nome, qtdHoras, valorHora);
        this.qtdHorasCoord = qtdHorasCoord;
        this.valorHoraCoord = valorHoraCoord;
        this.curso = curso;
    }

    public Integer getQtdHorasCoord() {
        return qtdHorasCoord;
    }

    public void setQtdHorasCoord(Integer qtdHorasCoord) {
        this.qtdHorasCoord = qtdHorasCoord;
    }

    public Double getValorHoraCoord() {
        return valorHoraCoord;
    }

    public void setValorHoraCoord(Double valorHoraCoord) {
        this.valorHoraCoord = valorHoraCoord;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Double calcularSalarioCoordenador() {
        return ((this.qtdHorasCoord * this.valorHoraCoord) * 4.5);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() + calcularSalarioCoordenador();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCoordenador: \n- Qtd. Horas: "
                + "%d\n- Valor Hora: %.2f\n- Curso: %s\nSALÁRIO COORDENADOR: %.2f\nSALÁRIO FINAL: %.2f",
                this.qtdHorasCoord, this.valorHoraCoord, this.curso, this.calcularSalarioCoordenador(), this.calcularSalario());
    }

}
