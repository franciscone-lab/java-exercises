package br.com.bandtec.projeto.classe.abstrata;

public class Vendedor extends Funcionario{
    private Double vendas;
    private Double taxa;

    public Vendedor(String cpf, String nome, Double vendas, Double taxa) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxa = taxa;
    }

    @Override
    public Double calcSalario() {
        return this.vendas * (this.taxa/100);
    } 

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Vendedor:\n");
        sb.append("\nNome: ").append(this.getNome());
        sb.append("\nCPF: ").append(this.getCpf());
        sb.append("\nTaxa: ").append(taxa);
        sb.append(" %");
        sb.append("\nVendas: R$ ").append(vendas);
        sb.append("\nSalário: R$ ").append(this.calcSalario());
        sb.append('\n');
        return sb.toString();
    }
    
    
}