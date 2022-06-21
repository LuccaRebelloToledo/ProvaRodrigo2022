package br.edu.univas;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor digite um número: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = 0, thirdNumber = 0;

        if(firstNumber % 5 != 0) {
            secondNumber += firstNumber + 1;
            if (secondNumber % 5 != 0) {
                thirdNumber += secondNumber + 1;
                if (thirdNumber % 5 != 0) {
                    System.out.println(firstNumber + " - " + firstNumber + " (não arredonda)");
                } else {
                    System.out.println(firstNumber + " - " + thirdNumber + " (arredonda)");
                }
            } else {
                System.out.println(firstNumber + " - " + secondNumber + " (arredonda)");
            }
        } else {
                System.out.println(firstNumber + " - " + firstNumber + " (não arredonda)");
        }
    }
}
