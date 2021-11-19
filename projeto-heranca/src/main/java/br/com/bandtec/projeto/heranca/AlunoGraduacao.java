package br.com.bandtec.projeto.heranca;

public class AlunoGraduacao extends Aluno{
    
    private Double notaContinuada;
    private Double notaIntegrada;

    public AlunoGraduacao(Integer ra, String nome) {
        super(ra, nome);
        this.notaContinuada = 0.0;
        this.notaIntegrada = 0.0;
    }

    @Override
    public String toString() {
        
        return String.format("RA: %d \nNome: %s \nNota C: %.2f \nNota I: %.2f", 
                super.getRa(), super.nome, notaContinuada, notaIntegrada);
    }            
}
