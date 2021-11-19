package vendedor;

public class App {

    public static void main(String[] args) {
        VendedorComissao matheus = new VendedorComissao(1, "Matheus", 1000.0, 10.0);
        VendedorComissaoMaisFixo fixo = new VendedorComissaoMaisFixo(1000.0, 2, "Matheus", 1000.0, 10.0);
        Departamento rh = new Departamento();
        
        System.out.println(matheus.calcularSalario());
        System.out.println(fixo.calcularSalario());
        rh.adicionaVendedor(matheus);
        rh.exibeTodos();
        System.out.println(rh.calcularTotalSalario());
    }
}
