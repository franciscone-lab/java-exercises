package br.com.bandtec.matheus.franciscone.c3;

public class App {

    public static void main(String[] args) {

        Instrutor miguel = new Instrutor("Miguel", 5, 25.0);
        Instrutor marcos = new Instrutor("Marcos", 8, 30.0);

        Personal italo = new Personal(2, 100.0, "Italo", 5, 25.0);
        Personal diego = new Personal(3, 150.0, "Diego", 4, 30.0);

        Academia marrafit = new Academia("Marra Fit", 3);

        marrafit.exibirInstrutores();
        marrafit.contratarInstrutor(marcos);
        marrafit.contratarInstrutor(miguel);
        marrafit.contratarInstrutor(italo);
        marrafit.contratarInstrutor(diego);
        System.out.println("-".repeat(30));
        System.out.println("INSTRUTORES");
        System.out.println("-".repeat(30));
        marrafit.exibirInstrutores();
        System.out.println("-".repeat(30));
        System.out.println("PERSONAIS");
        System.out.println("-".repeat(30));
        marrafit.exibePersonalTrainers();
        marrafit.exibeFolhaDePagamento();
        System.out.println("-".repeat(30));
        System.out.println("BUSCA INSTRUTORES");
        System.out.println("-".repeat(30));
        
        if (marrafit.buscarInstrutor("Miguel") == null) {
            System.out.println("Instrutor não encontrado!");
        } else {
            System.out.println(miguel);
        }
        System.out.println("\n");
        if (marrafit.buscarInstrutor("Matheus") == null) {
            System.out.println("Não encontrado!");
        }
        System.out.println("-".repeat(30));
        System.out.println("ACADEMIA");
        System.out.println("-".repeat(30));
        System.out.println(marrafit);

    }
}
