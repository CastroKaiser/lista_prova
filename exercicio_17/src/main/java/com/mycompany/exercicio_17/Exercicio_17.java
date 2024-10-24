/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_17;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_17 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String mensagem;
        
        System.out.println("Quantos usuarios deseja cadastrar:");
        int qtdUsuarios = ler.nextInt();
        
        String[] email = new String[qtdUsuarios];
        String[] nome = new String[qtdUsuarios];
        int[] idade =new int[qtdUsuarios];
        
        ler.nextLine();
        
        mensagem = "Usúarios cadastrados";
        for (int i = 0; i < qtdUsuarios; i++) {
            System.out.print("Digite o nome do "+(i+1)+" usuario:");
            nome[i] = ler.nextLine();
            
            System.out.print("Digite a idade de "+nome[i]+":");
            idade[i] = ler.nextInt();            
            
            ler.nextLine();
            
            System.out.print("Digite o email de "+nome[i]+":");
            email[i] = ler.nextLine();
            
            mensagem += "\nID - "+(i+1)+"\nNome:"+nome[i]+"\nIdade:"+idade[i]+"\nEmail:"+email[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\usuarios.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
