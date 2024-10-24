/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_13 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int qtdProdutos;
        String mensagem = "";
        
        System.out.print("Quantos produtos voce deseja cadastrar::");
        qtdProdutos = ler.nextInt();
        
        String[] nomeProduto = new String[qtdProdutos];
        float[] priceProduto = new float[qtdProdutos];
        
        ler.nextLine();
        
        for (int i = 0; i < qtdProdutos; i++) {
            System.out.print("Digite o nome do "+(i+1)+" produto:");
            nomeProduto[i] = ler.nextLine();
            
            System.out.print("Digite o valor do "+(i+1)+" produto:");
            priceProduto[i] = ler.nextInt();
            
            mensagem = mensagem + "Nome produto:"+nomeProduto[i]+"\nPreço do Produto:R$"+priceProduto[i]+"\n\n";
            
            ler.nextLine();
        }

        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\lista_produtos.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
