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
public class Cachorro {
    
    protected String nome, cor;
    protected int idade;
    
    public Cachorro(String nome, String cor, int idade)
    {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
