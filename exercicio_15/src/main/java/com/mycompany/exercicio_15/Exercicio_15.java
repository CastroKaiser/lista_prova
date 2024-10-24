/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_15;

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
public class Exercicio_15 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int qtdParticipantes;
        String mensagem = "";
        int escolha;
        
        System.out.print("Quantos participantes vao participar da pesquisa:");
        qtdParticipantes = ler.nextInt();
        
        int[] genero = new int[6];
        ler.nextLine();
        
        System.out.println("0 - Pop\n1 - Rock\n2 - Rap\n3 - Classicas\n4 - MPB\n5 - Gospel");
        
        for (int i = 0; i < qtdParticipantes; i++) {
            System.out.print("Qual genero escolhido do participante "+(i+1)+":");
            escolha = ler.nextInt();
            
            if (escolha >= 0 && escolha <= 5) {
                genero[escolha]++; 
            } else {
                System.out.println("Escolha inválida! Tente novamente.");
                i--; 
            }
        }
        
        mensagem = mensagem + "Resultados da Pesquisa\nPop:"+genero[0]+"\nRock:"+genero[1]+"\nRap:"+genero[2]+"\nClassicas:"+genero[3]+"\nMPB:"+genero[4]+"\nGospel:"+genero[5];
        
        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\genero_musical.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
