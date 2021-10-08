package clube;

public class Clube {

    private String nomeTime;
    private Integer vitoria;
    private Integer derrota;
    private Integer empate;

    // Construtor
    public Clube(String nomeTime) {
        this.nomeTime = nomeTime;
        this.vitoria = 0;
        this.derrota = 0;
        this.empate = 0;
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

    // Método
    public void registrarVitoria(String nomeDoTime, Integer vitoriaDoTime) {
        nomeTime = nomeDoTime;
        vitoria = vitoriaDoTime;
    }

    // toString
    @Override
    public String toString() {
        return "Clube:" + "nomeTime=" + nomeTime + ", vitoria=" + vitoria + ", derrota=" + derrota + ", empate=" + empate + '}';
    }
}
