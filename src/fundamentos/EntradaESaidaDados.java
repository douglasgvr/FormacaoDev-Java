package fundamentos;

import java.util.Scanner;

public class EntradaESaidaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Seu nome é " + nome + " E a sua idade é " + idade);
    }
}
