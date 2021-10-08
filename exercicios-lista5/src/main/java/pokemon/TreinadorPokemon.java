package pokemon;

public class TreinadorPokemon {

    private String nomeTreinador;
    private Integer nivelTreinador;

    public TreinadorPokemon(String nomeTreinador, Integer nivelTreinador) {
        this.nomeTreinador = nomeTreinador;
        this.nivelTreinador = nivelTreinador;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public void setNomeTreinador(String nomeTreinador) {
        this.nomeTreinador = nomeTreinador;
    }

    public Integer getNivelTreinador() {
        return nivelTreinador;
    }

    public void setNivelTreinador(Integer nivelTreinador) {
        this.nivelTreinador = nivelTreinador;
    }

    @Override
    public String toString() {
        return "TreinadorPokemon{" + "nomeTreinador=" + nomeTreinador + ", nivelTreinador=" + nivelTreinador + '}';
    }

    public void treinarPokemon(Pokemon nome) {
        nome.setForcaPokemon(nome.getForcaPokemon() + (10 * 10 / 100));
        nome.setDocesPokemon(nome.getDocesPokemon() + 10);
        this.nivelTreinador += 2;
    }

    public void treinarPokemon(Pokemon nome, Integer a) {
        nome.setForcaPokemon(nome.getForcaPokemon() + (10 * 10 / 100));
        nome.setDocesPokemon(nome.getDocesPokemon() + 10);
        this.nivelTreinador += 2;
    }

    public void evoluirPokemon(Pokemon nome, String nomeEvolucao) {
        if (nome.getDocesPokemon() >= 50) {
            String nomeAntigo = nome.getNomePokemon();
            nome.setNomePokemon(nomeEvolucao);
            String nomeNovo = nome.getNomePokemon();
            nome.setDocesPokemon(nome.getDocesPokemon() - 50);
            this.nivelTreinador += 10;
            System.out.println(String.format("Pokémon %s evoluiu para -> %s", nomeAntigo, nomeNovo));
        } else {
            System.out.println("Não foi possível realizar operação");
        }
    }
}
