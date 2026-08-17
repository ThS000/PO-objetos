package SEMESTRE1.SEMESTRE1_SEMANA1.EX1;

import java.util.Scanner;

public class Main {
    static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        //Maior número

        System.out.println("Digite o primeiro número");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();

        if (num1 == num2){
            System.out.println("Números iguais");
            return;
        } else if (num1 > num2) {
            System.out.println("Número: " + num1 + " é o maior número." );
        } else if (num2 > num1) {
            System.out.println("Número: " + num2 + " é o maior número.");
        }
    }
}
