package br.edu.univas;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menorNumeroDivisivel = 0;
        for(int i = 0; i < 3; i++){
            System.out.print("Por favor digite um número: ");
            int number = scanner.nextInt();
            if(i == 0 && number % 11 == 0 && number % 13 == 0 & number % 17 == 0) {
                menorNumeroDivisivel = number;
            } else if(number % 11 == 0 && number % 13 == 0 & number % 17 == 0) {
                menorNumeroDivisivel = number;
            }
            if(number < menorNumeroDivisivel) {
                menorNumeroDivisivel = number;
            }
        }
        System.out.println("O menor número divisível por 11, 13 e 17 é: " + menorNumeroDivisivel);
    }
}
