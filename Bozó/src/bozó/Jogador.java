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
public class Jogador {
    protected List <Dado> dados = new ArrayList();
    protected int pontuacao;
    protected String nome;
    protected Placar placar;

    public Jogador() {
        for(int i = 0; i < 5; i++)
        {
            dados.add(i, new Dado(6));
        }
    }
    
    public Jogador(String nome) {
        this.nome = nome;
        for(int i = 0; i < 5; i++)
        {
            dados.add(i, new Dado(6));
        }
    }
    
    public void lancaDado()
    {
        for(int i = 0; i < 5; i++)
        {
            dados.get(i).rolar();
        }
    }
    
    public void lancaDado(String []str)
    {
        int j;
        for(int i = 0; i < str.length; i++)
        {
            j = Integer.parseInt(str[i]);
            dados.get(j-1).rolar();
        }
    }
    
    public void escolheDado()
    {
        Scanner s = new Scanner(System.in);
        String escolha;
        System.out.println("As faces do seus dados sao respectivamente: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i + "º: " + dados.get(i));
        }
        System.out.println("Deseja jogar novamente? (S para sim e N para nao)");
        escolha = s.nextLine();
        if(escolha == "S")
        {
            System.out.println("Escolha quais dados pretende lancar na proxima rodada: (separados por virgula)");
            String dado = s.nextLine();
            String []str = new String[5];
            str = dado.split(",");
            lancaDado(str);
        }
        
    }
    
    public void escolhePosicao()
    {
        
    }

    public List<Dado> getDados() {
        return dados;
    }

    public void setDados(List<Dado> dados) {
        this.dados = dados;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
}
