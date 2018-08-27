/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27.pkg08;

/**
 *
 * @author Cristiano
 */
public class PetShop {
    
    public PetShop()
    {
        
    }
    
    public Cachorro compra(String nome, String cor, int idade)
    {
        Cachorro dog = new Cachorro(nome, cor, idade);
        System.out.println(dog.nome + " comprado(a)");
        return dog;
    }
    
    public void venda(Cachorro dog)
    {
        System.out.println(dog.nome + " vendido(a)");
        dog = null;
    }    
}
