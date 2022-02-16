package br.com.testealgoritmo;

import java.util.Scanner;

public class ImprimirMatriz {

    public void Solucao() {
        // Faça um algoritmo que receba uma matriz[i,z] como parâmetro e imprima todos os 
        // valores dessa matriz.

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.println("Quantidade de colunas: ");
        int coluna = sc.nextInt();

        int matriz[][];
        matriz = new int[linha][coluna];
        
        for(int li = 0;li < matriz.length;li++){
            for(int co = 0;co<matriz[0].length;co++){
                System.out.print(matriz[li][co]+ " ");
            }
                System.out.println("");
        }
    }
}
