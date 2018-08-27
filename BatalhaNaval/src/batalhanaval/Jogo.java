/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhanaval;

/**
 *
 * @author Cristiano
 */
public class Jogo {
    protected Jogador jogador1;
    protected Jogador jogador2;
    protected int tamanho = 20, cont1 = 0, cont2 = 0;
//    protected boolean[] tabuleiro = new boolean[tamanho];
    public Jogo(Jogador player1, Jogador player2)
    {
        /*Scanner s = new Scanner(System.in);
        System.out.println("Digite o tamanho do rio: ");
        tamanho = s.nextInt();*/
        jogador1 = player1;
        jogador2 = player2;
    }
    
//    protected void criaTabuleiro()
//    {
//        Random generator = new Random();
//        int rand;
//        rand = generator.nextInt(17);
//        for(int i = 0; i<tamanho; i++)
//        {
//            tabuleiro[i] = false;
//        }
//        tabuleiro[rand] = true;
//        tabuleiro[rand+1] = true;
//        tabuleiro[rand+2] = true;
//    }
    
//    protected  boolean verificaPalpite1()
//    {
//        return jogador1.verificaPalpite();
//    }
//    protected  boolean verificaPalpite2()
//    {
//        return jogador2.verificaPalpite();
//    }
//    
    protected void battleShip()
    {
//        criaTabuleiro();
        while(jogador1.getNumPalpite()!=0 && jogador2.getNumPalpite()!=0 && cont1 !=3 && cont2 != 3)
        {
            System.out.println("Vez de " + jogador1.nome + ":");
            jogador1.setPalpite();
            if(jogador2.verificaPalpite(jogador1.palpite) == false)
            {
                System.out.println("Errou!");
                jogador1.numPalpite--;
                if(jogador1.getNumPalpite() == 0)
                {
                    jogador2.msgWin();
                    return;
                }
            }
            else
            {
                System.out.println("Acertou!");
                cont1++;
                if(cont1 == 3)
                {
                    jogador1.msgWin();
                    return;
                }
            }
            
            System.out.println("Vez de " + jogador2.nome + ":");
            jogador2.setPalpite();
            if(jogador1.verificaPalpite(jogador2.palpite) == false)
            {
                System.out.println("Errou!");
                jogador2.numPalpite--;
                if(jogador2.getNumPalpite() == 0)
                {
                    jogador1.msgWin();
                }
            }
            else
            {
                System.out.println("Acertou!");
                cont2++;
                if(cont2 == 3)
                {
                    jogador2.msgWin();
                }
            }
        }
    }
}
