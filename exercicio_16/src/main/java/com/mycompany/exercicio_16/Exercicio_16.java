/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_16;

import java.util.Random;

/**
 *
 * @author c.nunes
 */
public class Exercicio_16 {

    public static void main(String[] args) {
        Random sorteia = new Random();
        int[] pontuacao = {1,4,8,5,2};
        
        //*for (int i = 0; i < pontuacao.length; i++) {
             // pontuacao[i] = sorteia.nextInt(1,50);
            //System.out.print(pontuacao[i]+", ");
        //}
        
        for (int i = 0; i < pontuacao.length - 1; i++) {
            for (int j = 0; j < pontuacao.length - 1 - i; j++) {
                if (pontuacao[j] > pontuacao[j + 1]) {
                    System.out.println(pontuacao[j]);
                    System.out.println(pontuacao[j+1]);
                    int temp = pontuacao[j];
                    pontuacao[j] = pontuacao[j + 1];
                    pontuacao[j + 1] = temp;
                }
            }
        }    
        System.out.println("\n");
        for (int i = 0; i < pontuacao.length; i++) {
            System.out.print(pontuacao[i]+", ");
        }
    }
}
