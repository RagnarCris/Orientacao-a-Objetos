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
public class Animal {
    protected int idade;
    protected String raca, nome;
    
    public Animal()
    {
    }
    public Animal(String nome, String raca, int idade)
    {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void comer()
    {
        System.out.println("Comendo");
    }
    public void dormir()
    {
        System.out.println("Dormindo");
    }
    public void emitirSom()
    {
        System.out.println("Emitindo som");
    }
}
