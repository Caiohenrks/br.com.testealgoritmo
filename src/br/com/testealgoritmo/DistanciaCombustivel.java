
package br.com.testealgoritmo;

import java.util.Scanner;

public class DistanciaCombustivel {
    public void Solucao() {
        // Dada a distância A e o combustível gasto B, faça um algoritmo 
        // para calcular o consumo médio.
        float a,b,media;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual a distancia percorrida em KM? ");
        a = sc.nextFloat();
        System.out.println("Qual o combustivel gasto em L?");
        b = sc.nextFloat();
        
        media = a / b;
        System.out.printf("A média de combustivel gasto é: %.2f KM/L \n", media);
       
    }
}
