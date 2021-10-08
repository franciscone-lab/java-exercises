package recursosHumanos;

public class TesteColaborador {

    public static void main(String[] args) {
        Colaborador carlos = new Colaborador("Carlos", "Estagiário", 900.0);
        Colaborador kazu = new Colaborador("Kazu", "Gerente", 4900.0);

        RecursosHumanos rhValeMobi = new RecursosHumanos(2, 1);

        System.out.println(carlos);
        System.out.println(kazu);

        rhValeMobi.promoverColaborador(kazu, "Diretor de T.I", 5600.0);
        rhValeMobi.promoverColaborador(carlos, "Desenvolvedor Jr.", 800.0);

        rhValeMobi.reajustarSalario(carlos, 200.0);

        System.out.println(carlos);
        System.out.println(kazu);
        
        System.out.println(String.format("Total de promoções: %d", rhValeMobi.getTotalPromovidos()));
        System.out.println(String.format("Total de reajustes de salário: %d", rhValeMobi.getTotalSalariosReajustados()));

    }
}
