package br.com.bandtec.projeto.classe.abstrata;

public class App {

    public static void main(String[] args) {
        Horista matheus = new Horista("222.222.222-22", "Matheus Franciscone", 60, 50.0);
        System.out.println(matheus);
        System.out.println("-".repeat(30));
        Vendedor diego = new Vendedor("111.111.111-11", "Diego Brito", 5000.0, 50.0);
        System.out.println(diego);
        System.out.println("-".repeat(30));
        Empresa sptech = new Empresa();
        sptech.adicionaFunc(diego); 
        sptech.adicionaFunc(matheus);
        sptech.exibeTodos();
        System.out.println("-".repeat(30));
        sptech.exibeTotalSalario();
        System.out.println("-".repeat(30));
        System.out.println(sptech);
    }
}
