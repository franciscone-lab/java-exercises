package aluno;

public class AlunoPos extends Aluno{
    protected Double notaMonografia;

    public AlunoPos(Double notaMonografia, Integer ra, String texto, Double notaContinuada, Double notaSemestral) {
        super(ra, texto, notaContinuada, notaSemestral);
        this.notaMonografia = notaMonografia;
    }

    public Double getNotaMonografia() {
        return notaMonografia;
    }

    public void setNotaMonografia(Double notaMonografia) {
        this.notaMonografia = notaMonografia;
    }
    
    @Override
    public Double calculaMedia(){
        return (super.notaContinuada + super.notaSemestral + notaMonografia) / 3;
    }

    @Override
    public String toString() {
        return super.toString() + "\n--\nAlunoPos{" + "notaMonografia=" + notaMonografia + '}';
    }
    
    
}
