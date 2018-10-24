/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaex13;

import java.io.*;
import java.util.*;

/**
 *
 * @author crist
 */
public class Pais {

    ArrayList<String> fronteiras = new ArrayList();
    String nome, capital;
    int area;

    public Pais(String nome, String capital, int area) {
        this.nome = nome;
        this.capital = capital;
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public boolean equals(Pais outro) {
        return nome.equals(outro.nome) && capital.equals(outro.capital);
    }

    public void defineFronteira() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos paises fazem fronteira: ");
        int i = 0, tam = s.nextInt();
        String entrada;
        while (i < tam) {
            System.out.println("Digite um pais que faça fronteira: ");
            entrada = s.nextLine();
            if (entrada.equals(nome)) {
                System.out.println("Pais fronteira digitado eh o proprio pais, tente novamente:");
                i--;
            } else {
                fronteiras.add(entrada);
            }
            i++;
        }

    }

    public List retornaFronteiras() {
        return fronteiras;
    }

    public List fronteirasEmComum(Pais outro) {
        Iterator iterator = fronteiras.iterator();
        ArrayList<String> emComum = new ArrayList();
        //for(int i = 0; i < fronteiras.size() ; i++) 
//        String aux;
//        while (iterator.hasNext()) {
//            aux = (String) iterator.next();
//            if (outro.fronteiras.contains(aux)) {
//                emComum.add(aux);
//            }
//
//        }

        for (String front : fronteiras) {
            if (outro.fronteiras.contains(front)) {
                emComum.add(front);
            }
        }

        return emComum;
    }
}
