package pokemon;

public class TestePokemon {

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Raio", 45);
        Pokemon charmander = new Pokemon("Charmander", "Fogo", 40);

        TreinadorPokemon matheus = new TreinadorPokemon("Matheus", 0);

        matheus.treinarPokemon(pikachu);
        matheus.treinarPokemon(pikachu);
        matheus.treinarPokemon(pikachu);
        matheus.treinarPokemon(pikachu);
        matheus.treinarPokemon(pikachu);
        System.out.println(pikachu);
        
        matheus.evoluirPokemon(pikachu, "Raichu");
        System.out.println(pikachu);
        
        matheus.treinarPokemon(charmander);
        matheus.treinarPokemon(charmander);
        System.out.println(charmander);
        
        matheus.evoluirPokemon(charmander, "Charmeleon");
        System.out.println(matheus);
    }
}
