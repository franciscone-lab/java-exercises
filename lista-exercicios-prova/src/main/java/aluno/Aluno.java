package aluno;

public class Aluno {
    protected Integer ra;
    protected String nome;
    protected Double notaContinuada;
    protected Double notaSemestral;

    public Aluno(Integer ra, String texto, Double notaContinuada, Double notaSemestral) {
        this.ra = ra;
        this.nome = texto;
        this.notaContinuada = notaContinuada;
        this.notaSemestral = notaSemestral;
    }

    public Integer getRa() {
        return ra;
    }

    public void setRa(Integer ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String texto) {
        this.nome = texto;
    }

    public Double getNotaContinuada() {
        return notaContinuada;
    }

    public void setNotaContinuada(Double notaContinuada) {
        this.notaContinuada = notaContinuada;
    }

    public Double getNotaSemestral() {
        return notaSemestral;
    }

    public void setNotaSemestral(Double notaSemestral) {
        this.notaSemestral = notaSemestral;
    }
    
    public Double calculaMedia(){
        return (notaContinuada * 0.4) +  (notaSemestral * 0.6);
    }

    @Override
    public String toString() {
        return "Aluno{" + "ra=" + ra + ", nome=" + nome + ", notaContinuada=" + notaContinuada + ", notaSemestral=" + notaSemestral + '}';
    }
    
}



