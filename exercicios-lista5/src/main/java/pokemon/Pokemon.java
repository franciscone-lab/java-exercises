package pokemon;

public class Pokemon {

    private String nomePokemon;
    private String tipoPokemon;
    private Integer forcaPokemon;
    private Integer docesPokemon;

    public Pokemon(String nomePokemon, String tipoPokemon, Integer forcaPokemon) {
        this.nomePokemon = nomePokemon;
        this.tipoPokemon = tipoPokemon;
        this.forcaPokemon = forcaPokemon;
        this.docesPokemon = 0;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    public String getTipoPokemon() {
        return tipoPokemon;
    }

    public void setTipoPokemon(String tipoPokemon) {
        this.tipoPokemon = tipoPokemon;
    }

    public Integer getForcaPokemon() {
        return forcaPokemon;
    }

    public void setForcaPokemon(Integer forcaPokemon) {
        this.forcaPokemon = forcaPokemon;
    }

    public Integer getDocesPokemon() {
        return docesPokemon;
    }

    public void setDocesPokemon(Integer docesPokemon) {
        this.docesPokemon = docesPokemon;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "nomePokemon=" + nomePokemon + ", tipoPokemon=" + tipoPokemon + ", forcaPokemon=" + forcaPokemon + ", docesPokemon=" + docesPokemon + '}';
    }
}
