package fundamentos;

import java.util.Scanner;

public class EstruturaLoopFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int limit = input.nextInt();

        for (int i = 1; i <= limit; i++){
            System.out.println("Número = " + i);
            if (i == 5) {
                break; // interrompe o lopping
                // continue -> verifica se o valor é verdadeiro e continua o looping
            }
        }
    }
}
