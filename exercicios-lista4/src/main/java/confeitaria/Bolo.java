package confeitaria;

public class Bolo {

    String sabor;
    Double valor;
    Integer quantidadeVendida;

    void comprarBolo(Integer qtd) {
        if (quantidadeVendida + qtd > 100) {
            System.out.println("Seu pedido ultrapassou nosso limite diário "
                    + "para esse bolo.\n");
        } else {
            System.out.println("Quantidade vendida com sucesso!");
            quantidadeVendida += qtd;
        }
    }

    void exibirRelatorio() {
        System.out.println(String.format("O bolo sabor %s, foi comprado %d vezes "
                + "hoje, totalizando R$ %.2f\n", sabor, quantidadeVendida, valor * quantidadeVendida));
    }
}
