/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_9 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String nome;
        int qtd_itens;
        
        System.out.print("Insira seu nome:");
        nome = ler.nextLine();
        
        System.out.print("Quantos itens deseja pedir:");
        qtd_itens = ler.nextInt();
        
        ler.nextLine();
        
        String[] produtos = new String[qtd_itens];
        int[] qtdByProduto = new int[qtd_itens];
        float[] priceOfProdut = new float[qtd_itens];
        float[] total = new float[qtd_itens];
        
        
        for (int i = 0; i < qtd_itens;++i) {
            System.out.print("Insira o nome do "+(i+1)+" produto:");
            produtos[i] = ler.nextLine();
            
            System.out.print("Insira a quantidade de "+produtos[i]+" que o senhor deseja:");
            qtdByProduto[i] = ler.nextInt();
           
            ler.nextLine();
            
            priceOfProdut[i] = (24.9f*(i+1));
        }
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\produtos.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        for (int i = 0; i < qtd_itens; i++) {
            total[i] = priceOfProdut[i] * qtdByProduto[i];
            
            String mensagem =  "Nome do produto:"+produtos[i]+"\nQuantidade do produto:"+qtdByProduto[i]+"\nTotal do Produto:"+total[i];
            
            JOptionPane.showMessageDialog(null, mensagem);
            gravar.printf("Nome do produto:"+produtos[i]+"\nQuantidade do produto:"+qtdByProduto[i]+"\nTotal do Produto:"+total[i]);
        }
        arquivo.close();
        gravar.close();
    }
}
