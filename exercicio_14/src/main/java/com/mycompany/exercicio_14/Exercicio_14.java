/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio_14;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author c.nunes
 */
public class Exercicio_14 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int qtdFuncionario, id, saida;
        String mensagem = "";
        
        System.out.print("Quantos funcionarios vao ser cadastrados:");
        qtdFuncionario = ler.nextInt();
        
        String[] nomeFuncionario = new String[qtdFuncionario];
        float[] salario = new float[qtdFuncionario];
        
        ler.nextLine();
        
        for (int i = 0; i < qtdFuncionario; i++) {
            System.out.print("Qual nome do "+(i+1)+" funcionario (escreva em letra minuscula e sem acentos):");
            nomeFuncionario[i] = ler.nextLine();
            
            System.out.print("Digite o salario do funcionario "+nomeFuncionario[i]+":");
            salario[i] = ler.nextFloat();
            
            ler.nextLine();
            
            mensagem = mensagem + ("ID "+i+" - Nome do funcionario:"+nomeFuncionario[i]+"\nSalario:R$"+salario[i]+"\n");
        }
        System.out.println("Deseja atualizar as informacoes de algum funcionario (1 - Sim ou 0 - Nao):");
        saida = ler.nextInt();

        if (saida == 1) {
            System.out.println(mensagem);
            System.out.print("Informe o ID do funcionario que deseja alterar:");
            id = ler.nextInt();

            ler.nextLine();

            System.out.println("Insira o nome do funcionario:");
            nomeFuncionario[id] = ler.nextLine();

            System.out.println("Insira o novo salario:");
            salario[id] = ler.nextFloat();

            ler.nextLine();

            JOptionPane.showMessageDialog(null, "Informações atualizadas com sucesso!\n(Novo)Nome do funcionario:"+nomeFuncionario[id]+"\n(Novo)Salario:R$"+salario[id]);

            mensagem = " ";

            for (int j = 0; j < qtdFuncionario; j++) {
                mensagem = mensagem + ("ID "+j+" - Nome do funcionario:"+nomeFuncionario[j]+"\nSalario:R$"+salario[j]+"\n\n");
            }
        } else {
            System.out.println("Nao vamos atualizar nada hoje.");
        }
        JOptionPane.showMessageDialog(null, mensagem);
        
        FileWriter arquivo = new FileWriter("C:\\Users\\edmun\\OneDrive\\Área de Trabalho\\lista_revisão\\funcionarios.txt");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf(mensagem);
        
        arquivo.close();
        gravar.close();
    }
}
