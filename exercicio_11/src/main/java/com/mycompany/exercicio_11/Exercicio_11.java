/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_11;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_11 {

    public static void main(String[] args) {
        Random sorteia = new Random();
        int[] dados = new int[50];
        int numMaior = 0;
        int numMenor = 0;
        
        for (int i = 0; i < dados.length; i++) {
            dados[i] = sorteia.nextInt(1,1000);
        }
        
        for (int i = 0; i < dados.length; i++) {
            numMaior = dados[i];
            for (int j = 0; j < dados.length; j++) {
                if (numMaior < dados[j]) {
                    numMaior = dados[j];
                }
            }
        }
        
        for (int i = 0; i < dados.length; i++) {
            numMenor = dados[i];
            for (int j = 0; j < dados.length; j++) {
                if (numMenor > dados[j]) {
                    numMenor = dados[j];
                }
            }
        }
        for (int i = 0; i < dados.length; i++) {
            System.out.print(dados[i]+", ");
        }
        
        JOptionPane.showMessageDialog(null,"O maior número:"+numMaior+"\nO menor número:"+numMenor);
    }
}
