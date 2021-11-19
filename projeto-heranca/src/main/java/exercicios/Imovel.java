package exercicios;

public class Imovel {
    protected Double preco;
    protected String endereco;

    public Imovel(Double preco, String endereco) {
        this.preco = preco;
        this.endereco = endereco;
    }
        
    public Double getPrecoVenda(){
        return preco;
    }
    
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Imovel{" + "preco=" + preco + ", endereco=" + endereco + '}';
    }
}
