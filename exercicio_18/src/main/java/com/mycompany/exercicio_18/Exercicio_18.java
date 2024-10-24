/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_18 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int qtdfuncionarios;
        String mensagem;
        
        System.out.print("Quantos funcionarios para o calculo::");
        qtdfuncionarios = ler.nextInt();
        
        String[] nome = new String[qtdfuncionarios];
        float[] salario = new float[qtdfuncionarios];
        float[] calculo = new float[qtdfuncionarios];
        
        ler.nextLine();
        
        mensagem = "         Valor das Férias";
        for (int i = 0; i < qtdfuncionarios; i++) {
            System.out.print("Qual nome do "+(i+1)+" funcionario:");
            nome[i] = ler.nextLine();
            
            System.out.print("Qual salario do "+nome[i]+":");
            salario[i] = ler.nextFloat();
            
            ler.nextLine();
            
            calculo[i] = salario[i] + (salario[i]/3);
            
            mensagem += "\nID - "+(i+1)+"\nNome:"+nome[i]+"\nSalario:"+salario[i]+"\nValor das Férias:"+String.format("%.2f",calculo[i])+"\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\salario.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
