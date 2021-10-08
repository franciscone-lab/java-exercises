package recursosHumanos;

public class RecursosHumanos {

    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public RecursosHumanos() {
        this.totalPromovidos = 0;
        this.totalSalariosReajustados = 0;
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

    public void reajustarSalario(Colaborador colaborador, Double salarioReajusteColaborador) {
        colaborador.setSalario(colaborador.getSalario() + salarioReajusteColaborador);
        this.totalSalariosReajustados++;
    }

    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (colaborador.getSalario() < novoSalario) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
            this.totalSalariosReajustados++;
            this.totalPromovidos++;
        } else {
            System.out.println("Operação Inválida");
        }
    }
}
