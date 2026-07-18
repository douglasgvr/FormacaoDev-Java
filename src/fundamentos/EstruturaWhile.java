package fundamentos;

import java.util.Scanner;

public class EstruturaWhile {
    public static void main(String[] args) {
        System.out.println("Estrutura de repetição While");

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número final: ");

        int limit = input.nextInt();
        int contador = 1;

        while (contador <= limit) {
            System.out.println("Contador = " + contador);
            contador++;
        }
    }
}
