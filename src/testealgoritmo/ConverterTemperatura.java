package testealgoritmo;

import java.util.Scanner;

public class ConverterTemperatura {
    public void Solucao() {
        //Faça um algoritmo que converta a temperatura de C para F.
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F;
        
        F = (C * 1.8) + 32;
        
        System.out.println("A temperatura " +C+"C é igual a "+F+"F");
         
         
    }
}
