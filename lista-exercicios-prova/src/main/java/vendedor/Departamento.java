package vendedor;

import java.util.ArrayList;
import java.util.List;

public class Departamento {

    private List<VendedorComissao> listaVendedor;

    // IMPORTANTE
    public Departamento() {
        this.listaVendedor = new ArrayList<>();
    }

    public void adicionaVendedor(VendedorComissao v) {
        listaVendedor.add(v);
        System.out.println("Vendedor Adicionado com sucesso!");
    }

    public Double calcularTotalSalario() {
        Double salarioTotal = 0.0;

//        for (int i = 0; i < listaVendedor.size(); i++) {
//            VendedorComissao vendedor = listaVendedor.get(i);
//            salarioTotal += vendedor.calcularSalario();
//        }
        for (VendedorComissao vendedor : listaVendedor) {
            salarioTotal += vendedor.calcularSalario();
        }

        return salarioTotal;
    }

    public void exibeTodos() {
        for (int i = 0; i < listaVendedor.size(); i++) {
            System.out.println(listaVendedor.get(i));
        }
    }
}
