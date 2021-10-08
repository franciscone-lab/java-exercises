package recursosHumanos;

public class RecursosHumanos {
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;

    public RecursosHumanos(Integer totalPromovidos, Integer totalSalariosReajustados) {
        this.totalPromovidos = totalPromovidos;
        this.totalSalariosReajustados = totalSalariosReajustados;
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
    }
    
    public void promoverColaborador(Colaborador colaborador, String novoCargo, Double novoSalario) {
        if (colaborador.getSalario() < novoSalario) {
            colaborador.setCargo(novoCargo);
            colaborador.setSalario(novoSalario);
        } else {
            System.out.println("Operação Inválida");
        }
    }
}
