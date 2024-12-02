public class PokemonEau extends Pokemon{

    public PokemonEau(String nomPokemon, int hp, int atk) {
        super(nomPokemon, hp, atk);
    }

    @Override
    public void attaquer(Pokemon p) {
            if(p instanceof PokemonFeu){
        //todo

        }
            else if (p instanceof PokemonEau){
        //todo
        }
            else if (p instanceof PokemonPlante){
        //todo

        }
    }

    @Override
    public String toString() {
        return "PokemonEau{" +
                "nomPokemon='" + nomPokemon + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
