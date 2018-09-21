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
public class Pikachu extends Pokemon{
    
    public Pikachu()
    {
        
    }
    @Override
    public void atacar()
    {
        System.out.println("Pikachu usou o Choque do trovao!");
    }
    public void evoluir()
    {
        System.out.println("Pikachu evoluiu para Raichu");
    }
}
