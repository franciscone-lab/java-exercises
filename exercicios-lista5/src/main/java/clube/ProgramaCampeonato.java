package clube;

public class ProgramaCampeonato {

    public static void main(String[] args) {
        Clube palmeiras = new Clube("Palmeiras");
        Clube corinthians = new Clube("Corinthians");

        System.out.println("Começa a temporada!\n");

        palmeiras.registrarVitoria();
        corinthians.registrarEmpate();
        System.out.println("\n");
        System.out.println(String.format("%s pontos: %d", palmeiras.getNomeTime(), palmeiras.getPontos()));
        System.out.println(String.format("%s pontos: %d", corinthians.getNomeTime(), corinthians.getPontos()));
        System.out.println("\n");

        System.out.println("-".repeat(30));
        palmeiras.registrarVitoria();
        corinthians.registrarDerrota();
        System.out.println("\n");
        System.out.println(String.format("%s pontos: %d", palmeiras.getNomeTime(), palmeiras.getPontos()));
        System.out.println(String.format("%s pontos: %d", corinthians.getNomeTime(), corinthians.getPontos()));
        System.out.println("\n");

        System.out.println("-".repeat(30));
        palmeiras.registrarVitoria();
        corinthians.registrarEmpate();
        System.out.println("\n");
        System.out.println(String.format("%s pontos: %d", palmeiras.getNomeTime(), palmeiras.getPontos()));
        System.out.println(String.format("%s pontos: %d", corinthians.getNomeTime(), corinthians.getPontos()));
        System.out.println("\n");

        System.out.println("-".repeat(30));
        System.out.println("Final de temporada:\n");
        System.out.println(palmeiras);
        System.out.println("\n");
        System.out.println(corinthians);

    }
}
