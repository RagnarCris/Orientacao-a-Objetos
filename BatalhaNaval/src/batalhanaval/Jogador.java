/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;
import java.util.*;

/**
 *
 * @author Cristiano
 */
public class Jogador {
    protected String nome;
    protected int palpite;
    protected int barco;
    protected int numPalpite;
    protected Tabuleiro tabuleiro;
    
    public Jogador(int numPalpite)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = s.nextLine();
        this.numPalpite = numPalpite;
        tabuleiro = new Tabuleiro(20);
    }
    
    protected void setPalpite()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu palpite: ");
        palpite = s.nextInt();
    }

    public int getPalpite() {
        return palpite;
    }

    public int getNumPalpite() {
        return numPalpite;
    }
    protected  boolean verificaPalpite(int enemyPalpite)
    {
        return tabuleiro.verificaPalpite(enemyPalpite);
    }
    
    protected void msgWin()
    {
        System.out.println("Parabens " + nome + ", voce ganhou mlk!");
    }
    
    
}
