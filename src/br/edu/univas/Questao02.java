package br.edu.univas;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] resultado = new int[20];
        int contadorDerrota = 0, contadorEmpate = 0, contadorVitoria = 0;

        for(int i = 0; i < resultado.length; i++){
            System.out.println("-1 se for derrota.");
            System.out.println("0 se for empate");
            System.out.println("1 se for vitória");
            System.out.print("Por favor digite o resultado: ");
            resultado[i] = scanner.nextInt();

            if(resultado[i] == -1){
                contadorDerrota++;
            } else if(resultado[i] == 0){
                contadorEmpate++;
            } else if(resultado[i] == 1){
                contadorVitoria++;
            }
        }
        System.out.println("Quantidade de partidas perdidas: " + contadorDerrota);
        System.out.println("Quantidade de partidas empatadas: " + contadorEmpate);
        System.out.println("Quantidade de partidas vitoriosas: " + contadorVitoria);
    }
}
