/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozó;

/**
 *
 * @author Cristiano
 */
public class Placar {
    
    private int maior;
    private int []pontuacao = new int[10];
    
    public Placar()
    {
        for(int i = 0; i < 10; i++)
        {
            pontuacao[i] = 0;
        }
    }
    
    void setPontuacao(int i, int valor)
    {
        pontuacao[i] = valor;
    }
    
    void exibePosicao()
    {
        maior = pontuacao[0];
        for(int i = 1; i < 10; i++)
        {
            if(pontuacao[i] > maior)
                maior = pontuacao[i];     
        }
        System.out.println("Pontuacao: " + maior);
    }
    int retornaPosicao()
    {
        maior = pontuacao[0];
        for(int i = 1; i < 10; i++)
        {
            if(pontuacao[i] > maior)
                maior = pontuacao[i];
            
        }
        return maior;
    }
    
}
