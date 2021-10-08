package br.com.bandtec.matheus.franciscone.c2;

public class App {

    public static void main(String[] args) {
        Desenvolvedor devMatheus = new Desenvolvedor(1, "Matheus", "Estagiário");
        Desenvolvedor devDiego = new Desenvolvedor(2, "Diego", "Dev Senior");
        FabricaDeSoftware digitalSolutions = new FabricaDeSoftware("Consultoria Digital Solutions");

        System.out.println(devMatheus);
        System.out.println("\n");
        System.out.println(devDiego);
        System.out.println("\n");
        digitalSolutions.realizarPagamento(devMatheus, 1000.0);
        System.out.println("\n");
        digitalSolutions.realizarPagamento(devDiego, 5000.0, 25);
        System.out.println("\n");
        digitalSolutions.desligarDesenvolvedor(devMatheus);
        System.out.println("\n");
        digitalSolutions.realizarPagamento(devMatheus, 1000.0);
        System.out.println("\n");
        System.out.println(devMatheus);
        System.out.println("\n");
        System.out.println(devDiego);
        System.out.println("\n");
        System.out.println(digitalSolutions);
    }

}
