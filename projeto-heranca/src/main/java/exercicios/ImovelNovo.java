package exercicios;

public class ImovelNovo extends Imovel{
    
    public ImovelNovo(Double preco, String endereco) {
        super(preco, endereco);
    }
    
    @Override
    public Double getPrecoVenda(){
        Double precoAcrescimo = super.getPrecoVenda() + (super.preco * 10 / 100);
        return precoAcrescimo;
    }   
}
