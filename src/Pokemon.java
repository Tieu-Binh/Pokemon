public class Pokemon {

   protected String nomPokemon;
   protected int hp;
   protected int atk;
/*
constructeur pokemon
 */
    public Pokemon(String nomPokemon, int hp, int atk) {
        this.nomPokemon = nomPokemon;
        this.hp = hp;
        this.atk = atk;
    }

    public String getNomPokemon() {
        return nomPokemon;
    }

    public void setNomPokemon(String nomPokemon) {
        this.nomPokemon = nomPokemon;
    }

    public int gethp() {
        return hp;
    }

    public void sethp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public boolean isDead () {
        if (hp <= 0) {
            return true;
        }

        return false;
    }

    public void attaquer (Pokemon p){
        p.sethp(p.gethp()  - this.getAtk());
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nomPokemon='" + nomPokemon + '\'' +
                ", HP=" + hp +
                ", atk=" + atk +
                '}';
    }
}
