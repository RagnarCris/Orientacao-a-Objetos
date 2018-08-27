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
public class BatalhaNaval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jogador p1 = new Jogador(3);
        Jogador p2 = new Jogador(3);
        Jogo game = new Jogo(p1, p2);
        game.battleShip();
    }
    
}
