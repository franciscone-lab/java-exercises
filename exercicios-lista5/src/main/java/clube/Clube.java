package clube;

public class Clube {

    private String nomeTime;
    private Integer vitoria;
    private Integer derrota;
    private Integer empate;
    private Integer pontos;

    // Construtor
    public Clube(String nomeTime) {
        this.nomeTime = nomeTime;
        this.vitoria = 0;
        this.derrota = 0;
        this.empate = 0;
        this.pontos = 0;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }

    public Integer getVitoria() {
        return vitoria;
    }

    public void setVitoria(Integer vitoria) {
        this.vitoria = vitoria;
    }

    public Integer getDerrota() {
        return derrota;
    }

    public void setDerrota(Integer derrota) {
        this.derrota = derrota;
    }

    public Integer getEmpate() {
        return empate;
    }

    public void setEmpate(Integer empate) {
        this.empate = empate;
    }

    // Métodos
    public void registrarVitoria() {
        this.vitoria++;
        this.pontos += 3;

        System.out.println(String.format("%s ganhou nessa rodada", this.nomeTime));
    }

    public void registrarEmpate() {
        this.empate++;
        this.pontos++;

        System.out.println(String.format("%s empatou nessa rodada", this.nomeTime));

    }

    public void registrarDerrota() {
        this.derrota++;

        System.out.println(String.format("%s perdeu nessa rodada", this.nomeTime));

    }

    // toString
    @Override
    public String toString() {
        return String.format("%s: %d vitórias, %d empates, %d derrotas\nTotal de pontos: %d", 
                this.nomeTime, this.vitoria, this.empate, this.derrota, this.pontos);
    }

}
