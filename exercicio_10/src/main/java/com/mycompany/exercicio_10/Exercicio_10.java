/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10;

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
public class Exercicio_10 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int qtdParticipantes;
        String generoAtual, mensagem = "";
        int contador = 0;
        
        System.out.print("Quantos participantes vao participar da pesquisa:");
        qtdParticipantes = ler.nextInt();
        
        String[] genero = new String[qtdParticipantes];
        ler.nextLine();
        
        for (int i = 0; i < qtdParticipantes; i++) {
            System.out.print("Qual genero favorito do participante "+(i+1)+" (escreva em letra minuscula e sem acentos):");
            genero[i] = ler.nextLine();
        }
        
        Set<String> generosContabilizados = new HashSet<>();
        
        for (int i = 0; i < qtdParticipantes; i++) {
            generoAtual = genero[i];
            if (!generosContabilizados.contains(generoAtual)) {
                contador = 0;
                
                for (int j = 0; j < qtdParticipantes; j++) {
                    if (generoAtual.equals(genero[j])) {
                        contador++;
                    }
                }
                mensagem = mensagem + "Existe "+contador+" participantes que gostam do gênero "+generoAtual+"\n";
                generosContabilizados.add(generoAtual); 
            }
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\genero_filme.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
