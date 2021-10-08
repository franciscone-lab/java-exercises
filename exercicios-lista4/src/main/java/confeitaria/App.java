package confeitaria;

public class App {

    public static void main(String[] args) {
        Bolo boloMorango = new Bolo();
        boloMorango.sabor = "Morango";
        boloMorango.valor = 30.00;
        boloMorango.quantidadeVendida = 0;
        boloMorango.comprarBolo(10);
        boloMorango.comprarBolo(10);
        boloMorango.comprarBolo(10);
        boloMorango.comprarBolo(120);
        boloMorango.exibirRelatorio();

        Bolo boloChocolate = new Bolo();
        boloChocolate.sabor = "Chocolate";
        boloChocolate.valor = 45.00;
        boloChocolate.comprarBolo(30);
        boloChocolate.exibirRelatorio();

        Bolo boloAbacaxi = new Bolo();
        boloAbacaxi.sabor = "Abacaxi";
        boloAbacaxi.valor = 50.00;
        boloAbacaxi.comprarBolo(20);
        boloChocolate.exibirRelatorio();
    }
}
