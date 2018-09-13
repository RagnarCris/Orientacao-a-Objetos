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
    private int pontuacao;
    protected String nome;
    protected Placar placar;

    public Jogador() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = s.nextLine();
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
        lancaDado();
        System.out.println("As faces do seus dados sao respectivamente: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i + "º: " + dados.get(i).getFace());
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
        System.out.println("Deseja jogar novamente? (S para sim e N para nao)");
        escolha = s.nextLine();
        if(escolha == "S")
        {
            System.out.println("Escolha quais dados pretende lancar na proxima rodada: (separados por virgula)");
            String dado = s.nextLine();
            String []str1 = new String[5];
            str1 = dado.split(",");
            lancaDado(str1);
        }
    }
    
    public void escolhePontuacao()
    {
        int cont = 0, contS = 0, valor = 0, contFu2 = 0, contFu3 = 0;
        int []contFu = new int[6];
        for(int k = 0; k < 6; k++)
            contFu[k] = 0;
        
        for(int i = 0; i < 6; i++)
        {
            if(i < 5)
            {
                if(dados.get(i+1).face == dados.get(i).face)
                    cont++;
                if(dados.get(i+1).face == dados.get(i).face+1)
                    contS++;
                if(cont == 4)
                    placar.setPontuacao(0, 50);
                if(contS == 4)
                    placar.setPontuacao(8, 30);
                if(cont == 3)
                    placar.setPontuacao(9, 40);
                for(int j = 0; j < 5; j++)
                {
                    if(dados.get(i).face == dados.get(j).face)
                    {
                        contFu[i+1]++; 
                    }
                }
            }
            for(int j = 0; j < 5; j++)
            {
                if(dados.get(j).face == i+1)
                {
                    valor++;
                    if((i+1) == 2)
                        placar.setPontuacao(i+1, 2*valor);
                    if((i+1) == 3)
                        placar.setPontuacao(i+1, 3*valor);
                    if((i+1) == 4)
                        placar.setPontuacao(i+1, 4*valor);
                    if((i+1) == 5)
                        placar.setPontuacao(i+1, 5*valor);
                    if((i+1) == 6)
                        placar.setPontuacao(i+1, 6*valor);
                    else
                        placar.setPontuacao(i+1, 6*valor);
                    
                }
            }
            
            valor = 0;
            
        }
        for(int k = 0; k<6; k++)
        {
            if(contFu[k+1] == 2)
                contFu2++;
            else if(contFu[k+1] == 3)
                contFu3++;
        }
        if(contFu2 == 1 && contFu3 == 1)
            placar.setPontuacao(7, 20);
        
        pontuacao = placar.retornaPosicao();
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

    
}
