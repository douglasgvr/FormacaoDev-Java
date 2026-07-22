package fundamentos;

import java.util.Scanner;

/*Enums
 * abreviação para Enumeração no java
 * um enum é um tipo especial no java usado para representar um grupo fixo de constantes.
 * Em outras palavras é uma lista fechada de operações que não mudam durante a execução do programa*/

enum DiadaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
}

public class EnumCase {
    public static void main(String[] args) {
        System.out.print("Enum e Switch Case");

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um dia da semana: ");
        String dia = input.nextLine();

        DiadaSemana diaDaSemana = DiadaSemana.valueOf(dia.toUpperCase());

//        if (diaDaSemana == DiadaSemana.SEGUNDA) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if (diaDaSemana == DiadaSemana.TERCA) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if(diaDaSemana == DiadaSemana.QUARTA) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if(diaDaSemana == DiadaSemana.QUINTA) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if(diaDaSemana == DiadaSemana.SEXTA) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if(diaDaSemana == DiadaSemana.SABADO) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else if(diaDaSemana == DiadaSemana.DOMINGO) {
//            System.out.println("Executando a tarefa da: " + dia);
//        }else {
//            System.out.println("Dia invalido");
//        }

        // Usando o Switch case, uma forma mais moderna para esse tipo de estrutura condicional.

        switch (diaDaSemana) {
            case SEGUNDA:
                System.out.print("Executando a tarefa de SEGUNDA-FEIRA");
                break;
            case TERCA:
                System.out.print("Executando a tarefa de TERCA-FEIRA");
                break;
            case QUARTA:
                System.out.print("Executando a tarefa de QUARTA-FEIRA");
                break;
            case QUINTA:
                System.out.print("Executando a tarefa de QUINTA-FEIRA");
                break;
            case SEXTA:
                System.out.print("Executando a tarefa de SEXTA-FEIRA");
                break;
            case SABADO:
                System.out.print("Executando a tarefa de SÁBADO");
                break;
            case DOMINGO:
                System.out.print("Executando a tarefa de DOMINGO");
                break;
            default:
                System.out.println("Dia inválido");
        }

        input.close();
    }
}
