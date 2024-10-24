/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_10;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_10 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtdParticipantes;
        String generoAtual;
        int contador = 0;
        
        System.out.print("Quantos participantes vao participar da pesquisa:");
        qtdParticipantes = ler.nextInt();
        
        String[] genero = new String[qtdParticipantes];
        ler.nextLine();
        for (int i = 0; i < qtdParticipantes; i++) {
            System.out.print("Qual gênero favorito do participante "+(i+1)+":");
            genero[i] = ler.nextLine();
        }
        for (int i = 0; i < qtdParticipantes; i++) {
            generoAtual = genero[i];
            for (int j = 0; j < qtdParticipantes; j++) {
                if (generoAtual.equals(genero[i])) {
                    contador++;
                }
            }
            JOptionPane.showMessageDialog(null, "Existe "+contador+" participantes que gostam do genero "+generoAtual);
        }
    
    }
}
