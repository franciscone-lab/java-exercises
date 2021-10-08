package br.com.bandtec.matheus.franciscone.c2;

public class FabricaDeSoftware {

    private String nome;
    private Integer quantidadeDePagamentos;
    private Integer quantidadeDeBonus;
    private Double totalPago;

    public FabricaDeSoftware(String nome) {
        this.nome = nome;
        this.quantidadeDePagamentos = 0;
        this.quantidadeDeBonus = 0;
        this.totalPago = 0.0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return String.format("%s\nPagamentos realizados: %d\nBônus pagos: %d\n"
                + "Total pago: R$%.2f",
                nome, quantidadeDePagamentos, quantidadeDeBonus, totalPago);
    }

    public void realizarPagamento(Desenvolvedor desenvolvedor, Double pagamentoDesenvolvedor) {
        if (desenvolvedor.getAtivo() == true) {
            desenvolvedor.setSalario(desenvolvedor.getSalario() + pagamentoDesenvolvedor);
            System.out.println(String.format("Realizando pagamento sem bônus:\nValor do pagamento: R$%.2f\nID: %d\nNome: %s\nCargo: %s\nAtivo: %s\n"
                    + "Valor a receber: %.2f", pagamentoDesenvolvedor, desenvolvedor.getId(), desenvolvedor.getNome(), desenvolvedor.getCargo(), desenvolvedor.getAtivo() ? "Sim" : "Não", desenvolvedor.getSalario()));
            this.quantidadeDePagamentos++;
            this.totalPago += desenvolvedor.getSalario();
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void realizarPagamento(Desenvolvedor desenvolvedor, Double pagamentoDesenvolvedor, Integer valorBonus) {
        if (desenvolvedor.getAtivo() == true) {
            Double bonusSalarial = (valorBonus * pagamentoDesenvolvedor) / 100;
            Double pagamentoComBonus = pagamentoDesenvolvedor + bonusSalarial;
            desenvolvedor.setSalario(desenvolvedor.getSalario() + pagamentoComBonus);
            System.out.println(String.format("Realizando pagamento com bônus:\nValor do pagamento: R$%.2f\nValor do bônus: %d%% -> R$%.2f\nID: %d\nNome: %s\nCargo: %s\nAtivo: %s\n"
                    + "Valor a receber: %.2f", pagamentoDesenvolvedor, valorBonus, bonusSalarial, desenvolvedor.getId(), desenvolvedor.getNome(), desenvolvedor.getCargo(), desenvolvedor.getAtivo() ? "Sim" : "Não", desenvolvedor.getSalario()));
            this.quantidadeDePagamentos++;
            this.quantidadeDeBonus++;
            this.totalPago += desenvolvedor.getSalario();
        } else {
            System.out.println("Operação inválida");
        }
    }

    public void desligarDesenvolvedor(Desenvolvedor desenvolvedor) {
        desenvolvedor.setAtivo(false);
        System.out.println(String.format("O desenvolvedor %s foi desligado",
                desenvolvedor.getNome()));
    }

}
