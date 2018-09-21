/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhopokemon;
import java.util.*;
/**
 *
 * @author Cristiano
 */
public class Pokemon {
    private String tipo, nome;
    
    public Pokemon()
    {
    }
    public Pokemon(String nome, String tipo)
    {
        this.nome = nome;
        this.tipo = tipo;
    }
    
    public void atacar()
    {
        System.out.println(nome + " atacou!");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
