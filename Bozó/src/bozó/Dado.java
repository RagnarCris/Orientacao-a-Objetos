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
public class Dado {
    protected int face, numFaces;
    
    public Dado(int n)
    {
        numFaces = n;
    }
    
    public void rolar()
    {
        Random generator = new Random();
        face = generator.nextInt(6)+1;
    }

    public int getFace() {
        return face;
    }

    public int getNumFaces() {
        return numFaces;
    }
    
    
    
}
