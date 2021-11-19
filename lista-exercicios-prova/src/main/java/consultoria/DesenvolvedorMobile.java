package consultoria;

public class DesenvolvedorMobile extends Desenvolvedor{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHorasTrabalhadasMobile;

    public DesenvolvedorMobile(Integer qtdHorasTrabalhadasMobile, Double valorHorasTrabalhasMobile, String nome, Integer qtdHorasTrabalhadas, Double valorHoraTrabalhada) {
        super(nome, qtdHorasTrabalhadas, valorHoraTrabalhada);
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhasMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHorasTrabalhasMobile() {
        return valorHorasTrabalhadasMobile;
    }

    public void setValorHorasTrabalhasMobile(Double valorHorasTrabalhasMobile) {
        this.valorHorasTrabalhadasMobile = valorHorasTrabalhasMobile;
    }
    
    public Double getSalarioMobile(){
        return this.valorHorasTrabalhadasMobile * this.qtdHorasTrabalhadasMobile;
    }
    
    @Override
    public Double getSalario(){
        return super.getSalario() + this.getSalarioMobile();
    }

    @Override
    public String toString() {
        return String.format("%s\nQtd. Trabalhadas Mobile: %d\nHoras Trabalhadas"
                + " Mobile: %.2f\nSalário Mobile: %.2fSALÁRIO TOTAL: %.2f", 
                super.toString(), this.qtdHorasTrabalhadasMobile, 
                this.valorHorasTrabalhadasMobile, this.getSalarioMobile(), 
                this.getSalario());
    }
}
