package aluno;

public class App {

    public static void main(String[] args) {
        Aluno matheus = new Aluno(2211047, "Matheus", 10.0, 5.0);

        System.out.println(String.format("O aluno %s tem média %.2f", matheus.getNome(),
                matheus.calculaMedia()));
        System.out.println(matheus);
        System.out.println("-".repeat(20));
        Aluno giovanna = new Aluno(2211024, "Giovanna", 10.0, 10.0);
        System.out.println(String.format("O aluno %s tem média %.2f", giovanna.getNome(),
                giovanna.calculaMedia()));
        System.out.println(giovanna);

        //--
        System.out.println("-".repeat(40));
        AlunoPos matheusPos = new AlunoPos(7.0, 2211047, "Matheus", 10.0, 5.5);

        System.out.println(String.format("O aluno de pós graduação %s tem média %.2f", matheusPos.getNome(),
                matheusPos.calculaMedia()));
        System.out.println(matheusPos);

        //--
        System.out.println("-".repeat(40));
        Faculdade bandtec = new Faculdade("Faculdade", 10);
        
        bandtec.matricularAluno(matheus);
        bandtec.matricularAluno(giovanna);
        bandtec.matricularAluno(matheusPos);
        bandtec.exibirAlunosMatriculados();
        
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("\n");
        bandtec.exibirAlunoPos();
//        System.out.println(bandtec);
    }
}
