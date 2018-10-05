/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_excecao;

/**
 *
 * @author Cristiano
 */
public class Calculadora {
    public static float divisao(int a, int b)
    {
        float x = 0;
        try{
            x=a/b;
        } catch(ArithmeticException e){
            System.out.println("Erro! " + e.getMessage());
        }
        return x;
    }
    public static void vetor(int valor){
        int []vet = new int[3];
        try{
            for(int i=0; i<=3; i++)
            {
                vet[i]+=i+1;
            }
            for(int i=0; i<vet.length; i++)
            {
                int x = vet[i]/valor;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro! Passou do limite!");
        }
    }
}
