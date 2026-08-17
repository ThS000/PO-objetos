package SEMESTRE1.SEMESTRE1_SEMANA1.EX2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Média aritmética

        System.out.println("Número 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Número 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Número 3: ");
        int num3 = scanner.nextInt();

        int media = (num1 + num2 + num3)/3;

        System.out.println("A média entre os três valores é de: " + media);
    }
}
