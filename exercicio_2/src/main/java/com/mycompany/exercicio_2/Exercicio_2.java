/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_2;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Exercicio_2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.print("Entre com um numero:");
        num = ler.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Esse numero e par");
        } else {
            System.out.println("Esse numero e impar");
        }
    }
}
