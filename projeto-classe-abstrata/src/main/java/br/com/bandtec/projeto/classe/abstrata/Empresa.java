package br.com.bandtec.projeto.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }
    
    public void adicionaFunc(Funcionario f){
        funcionarios.add(f);
    }
    
    public void exibeTodos(){
        System.out.println(funcionarios);
    }
    
    public void exibeTotalSalario(){
        Double totalSalario = 0.0;
        for (Funcionario funcionario : funcionarios) {
            totalSalario += funcionario.calcSalario();
        }
        System.out.println(String.format("Salário Total: R$%.2f", totalSalario));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Empresa:\n");
        sb.append("Funcionarios:\n").append(funcionarios);
        return sb.toString();
    }    
}
