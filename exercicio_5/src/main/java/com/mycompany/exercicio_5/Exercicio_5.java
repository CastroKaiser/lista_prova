/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_5;
import java.util.Scanner;
/**
 *
 * @author c.nunes
 */
public class Exercicio_5 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o numero para a contagem regressiva: ");
        int contagem = ler.nextInt();
        
        for (int i = contagem; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Espera 1 segundo
            } catch (InterruptedException e) {
                System.out.println("ERR: o tempo de espera deu erro,"+e.getMessage());
            }
        }
    }
}
