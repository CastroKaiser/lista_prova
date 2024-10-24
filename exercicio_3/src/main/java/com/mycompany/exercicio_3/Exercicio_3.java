/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_3;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numOne;
        int numTwo;
        
        System.out.print("Entre com a pontuacao do primeiro jogador:");
        numOne = ler.nextInt();
        
        System.out.print("Entre com a pontuacao do segundo jogador:");
        numTwo = ler.nextInt();
        
        if (numOne == numTwo) {
            System.out.println("As pontuacoes sao iguais");
        } else if (numOne > numTwo) {
            System.out.println("O primeiro jogador ganhou!");
        } else if (numTwo > numOne) {
            System.out.println("O segundo jogador ganhou!");
        }
    }
}
