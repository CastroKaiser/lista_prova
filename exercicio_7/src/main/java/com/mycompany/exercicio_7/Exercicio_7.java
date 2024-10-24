/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_7;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Exercicio_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;
        System.out.println("A média das três notas é: " + media);
    }
}
