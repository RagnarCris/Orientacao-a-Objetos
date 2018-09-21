/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg14.pkg09;

/**
 *
 * @author Cristiano
 */
public class Tiranossauro extends Animal{
    
    public Tiranossauro()
    {
        
    }
    public Tiranossauro(String nome, String raca, int idade) {
        super(nome, raca, idade);
    }
    @Override
    public void emitirSom()
    {
        System.out.println("UHRRAAAAHGGGGG");
    }
}
