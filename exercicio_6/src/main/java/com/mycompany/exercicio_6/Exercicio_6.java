/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_6;

/**
 *
 * @author c.nunes
 */
public class Exercicio_6 {

    public static void main(String[] args) {
        int tempo = 10; // Definir o tempo inicial da contagem regressiva
        for (int i = tempo; i >= 0; i--) {
            System.out.println("Tempo restante: " + i);
            try {
                Thread.sleep(1000); // Esperar 1 segundo
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("Processo finalizado!");
    }
}
