/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bozó;
import java.util.*;
/**
 *
 * @author Cristiano
 */
public class Jogo {
    protected List <Jogador> jogadores = new ArrayList();
    
    public Jogo(int qtd)
    {
        if(qtd<=6 && qtd>0)
        {
            for(int i = 0; i < qtd; i++)
            {
                jogadores.add(i, new Jogador());
            }
        }
        else
        {
            System.out.println("Numero de jogadores insuficientes ou maior que o limite");
        }
    }
    
    public void rodaJogo()
    {
        int maior = 0;
        Jogador auxiliar;
        for(int i = 0; i < jogadores.size(); i++)
        {
            jogadores.get(i).escolheDado();
        }
        maior = jogadores.get(0).getPontuacao();
        auxiliar = jogadores.get(0);
        for(int i = 1; i < jogadores.size(); i++)
        {
            if(jogadores.get(i).getPontuacao() > maior)
            {
                maior = jogadores.get(i).getPontuacao();
                auxiliar = jogadores.get(i);
            }
        }
        System.out.println(" ");
        System.out.println("O ganhador foi " + auxiliar.nome + " com uma pontuacao de " + maior + " pontos");
    }
}
