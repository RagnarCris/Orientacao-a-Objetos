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
    private static int quantidade=0;
    
    public Cachorro(String nome, String cor, int idade)
    {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
        quantidade++;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public static int quantCachorrosComprados()
    {
        return quantidade;
    }
    
}
