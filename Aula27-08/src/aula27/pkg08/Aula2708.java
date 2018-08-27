/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula27.pkg08;

/**
 *
 * @author Cristiano
 */
public class Aula2708 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PetShop pet = new PetShop();
        int quantidade;
        Cachorro cao1, cao2, cao3, cao4;
        cao1 = pet.compra("Digdin", "preta", 5);
        cao2 = pet.compra("Little Juice", "marrom", 1);
        cao3 = pet.compra("Leslie", "preta", 12);
        cao4 = pet.compra("Barnie", "amarela", 3);
        
        pet.venda(cao4);
        pet.venda(cao2);
        
        quantidade = PetShop.quantCachorros();
        
        System.out.println("Quantidade de cachorros restantes: " + quantidade);
        
        
    }
    
}
