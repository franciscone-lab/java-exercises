package dadinhos;

import java.util.concurrent.ThreadLocalRandom;

public class Dadinho {
    private Integer valorDadinho;

    public Dadinho() {
        this.valorDadinho = 0;
    }

    public Integer getValorDadinho() {
        return valorDadinho;
    }

    public void setValorDadinho(Integer valorDadinho) {
        this.valorDadinho = valorDadinho;
    }
    
    public void sortearValorDadinho(){
        this.valorDadinho = ThreadLocalRandom.current().nextInt(1,6);
    }

    @Override
    public String toString() {
        return String.format("%d", this.valorDadinho);
    }
    
}
