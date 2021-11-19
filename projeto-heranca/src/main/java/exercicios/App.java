package exercicios;

public class App {

    public static void main(String[] args) {
        ImovelNovo casa = new ImovelNovo(500.00, "Haddock Lobo");
        ImovelUsado ape = new ImovelUsado(500.00, "Av. Paulista");

        System.out.println(casa.getPrecoVenda());
        System.out.println("--");
        System.out.println(ape.getPrecoVenda());
    }
}
