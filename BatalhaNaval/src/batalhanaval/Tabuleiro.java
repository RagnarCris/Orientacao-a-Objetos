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
public class Tabuleiro {
    
    protected boolean[] tabuleiro;
    protected int lugar;
    public Tabuleiro(int tam)
    {
        tabuleiro = new boolean[tam];
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o lugar que seu barco ficara: ");
        lugar = s.nextInt();
//        Random generator = new Random();
//        int rand;
//        rand = generator.nextInt(17);
        for(int i = 0; i<tam; i++)
        {
            tabuleiro[i] = false;
        }
        tabuleiro[lugar] = true;
        tabuleiro[lugar+1] = true;
        tabuleiro[lugar+2] = true;
    }
    protected  boolean verificaPalpite(int palpite)
    {
        return tabuleiro[palpite];
    }
    
    
}