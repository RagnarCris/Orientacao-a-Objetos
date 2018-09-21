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
public class Bulbasaur extends Pokemon{
    
    public Bulbasaur()
    {
        
    }
    @Override
    public void atacar()
    {
        System.out.println("Bulbasaur usou o Raio Solar!");
    }
    public void evoluir()
    {
        System.out.println("Bulbasaur evoluiu para Ivysaur!");
    }
}
