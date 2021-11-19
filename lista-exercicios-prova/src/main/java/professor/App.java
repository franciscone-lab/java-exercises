 package professor;

public class App {

    public static void main(String[] args) {
        Professor diego = new Professor(1, "Diego Brito", 2, 500.0);
        Professor brandao = new Professor(2, "Fernando Brandão", 5, 500.0);

        Coordenador marise = new Coordenador(2, 500.0, "Ciência da Computação", 3, "Marise Miranda", 5, 500.0);

        System.out.println(diego);
        System.out.println("-".repeat(30));
        System.out.println(brandao);
        System.out.println("-".repeat(30));
        System.out.println(marise);
        
//        -------------------
        System.out.println("\n");
        System.out.println("FACULDADE BANDTEC");
        System.out.println("\n");
        Faculdade bandtec = new Faculdade("BandTec", 60);
        bandtec.contratarProfessor(diego);
        bandtec.contratarProfessor(brandao);
        bandtec.contratarProfessor(marise);
     
        bandtec.exibirProfessor();
        System.out.println("-".repeat(30));        
        bandtec.exibirCoordenadores();
        System.out.println("-".repeat(30));
        System.out.println(bandtec);
    }
}
