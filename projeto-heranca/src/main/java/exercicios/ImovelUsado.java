package exercicios;

public class ImovelUsado extends Imovel{

    public ImovelUsado(Double preco, String endereco) {
        super(preco, endereco);
    }
    
    @Override
    public Double getPrecoVenda() {
        Double precoDesconto = super.getPrecoVenda() - (super.preco * 10 / 100);
        return precoDesconto;
    }
}
