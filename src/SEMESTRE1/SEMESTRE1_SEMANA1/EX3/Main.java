package SEMESTRE1.SEMESTRE1_SEMANA1.EX3;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        //Soma 1 até N

        System.out.println("Digite o valor N que representa o valor máximo");
        int valorN = scanner.nextInt();

        int somaValores = 0;

        for (int i = 1; i <= valorN; i++) {
            somaValores += i;
        }

        System.out.println("A soma dos valores é: " + somaValores);
    }
}
