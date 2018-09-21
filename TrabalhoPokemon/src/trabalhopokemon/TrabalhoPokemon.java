/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopokemon;

/**
 *
 * @author Cristiano
 */
public class TrabalhoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pokemon pokemon = new Pokemon("Raichu", "Raio");
        Pikachu pikachu = new Pikachu();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();
        pikachu.evoluir();
        pokemon.atacar();
        bulbasaur.atacar();
        charmeleon.atacar();
        charmeleon.evoluir();
        charizard.atacar();
        
        
    }
    
}
