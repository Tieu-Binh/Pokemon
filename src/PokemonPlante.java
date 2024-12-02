public class PokemonPlante extends Pokemon {

    /**
     *
     * @param nomPokemon
     * @param hp
     * @param atk
     */
    public PokemonPlante(String nomPokemon, int hp, int atk) {
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
        return "PokemonPlante{" +
                "nomPokemon='" + nomPokemon + '\'' +
                ", hp=" + hp +
                ", atk=" + atk +
                '}';
    }
}
