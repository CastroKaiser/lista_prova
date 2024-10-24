/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numOne;
        int numTwo;
        
        System.out.print("Digite o primeiro numero:");
        numOne = ler.nextInt();
        
        System.out.print("Digite o segundo numero:");
        numTwo = ler.nextInt();
        
        System.out.println("Soma:"+(numOne+numTwo));
        
    }
}
