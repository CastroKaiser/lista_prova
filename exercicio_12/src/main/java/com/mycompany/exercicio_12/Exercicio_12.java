/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_12;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Exercicio_12 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        
        System.out.print("Insira um numero:");
        num = ler.nextInt();
        
        if (verificacaoPrimo(num)) {
            System.out.println(num+" e um numero primo");
        } else {
            System.out.println(num+" nao e um numero primo");
        }
    }
    public static boolean verificacaoPrimo (int n) {
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i * i <= n ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
