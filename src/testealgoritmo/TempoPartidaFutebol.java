package testealgoritmo;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TempoPartidaFutebol {

    public void Solucao() {
        //Uma partida de futebol iniciou na hora A e terminou na hora B. 
        //Faça um algoritmo que calcule o tempo que durou a partida.

        Scanner sc = new Scanner(System.in);

        System.out.println("Que hora começou ? hh:mm");
        String h = sc.nextLine();
        LocalTime inicio = LocalTime.parse(h);

        System.out.println("Que hora acabou a partida ? hh:mm");
        String m = sc.nextLine();
        LocalTime fim = LocalTime.parse(m);

        int diffMinutes = (int) ChronoUnit.MINUTES.between(inicio, fim);
        int horas = diffMinutes / 60;
        int minutos = diffMinutes % 60;
        System.out.printf("A diferença entre %s e %s é de %d horas e %d minutos\n",
                inicio.toString(), fim.toString(), horas, minutos);

    }
}
