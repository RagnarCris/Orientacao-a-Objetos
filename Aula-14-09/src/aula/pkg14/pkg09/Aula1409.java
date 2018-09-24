/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg14.pkg09;
import java.util.*;
/**
 *
 * @author Cristiano
 */
public class Aula1409 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Animal> animais = new ArrayList();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Tiranossauro());
        for(int i = 0; i < animais.size(); i++)
        {
            animais.get(i).emitirSom();
        }
        
    }
    
}
