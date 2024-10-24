/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_8;

import java.util.Scanner;

/**
 *
 * @author c.nunes
 */
public class Exercicio_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] codigos = {101, 202, 303, 404, 505}; 
        
        System.out.println("Digite o código do produto que deseja buscar: ");
        int codigoBuscado = sc.nextInt();
        
        if (buscaCodigo(codigos, codigoBuscado)) {
            System.out.println("Produto encontrado!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }
    
    public static boolean buscaCodigo(int[] vetor, int codigo) {
        for (int codigoAtual : vetor) {
            if (codigoAtual == codigo) {
                return true;
            }
        }
        return false;
    }
}
