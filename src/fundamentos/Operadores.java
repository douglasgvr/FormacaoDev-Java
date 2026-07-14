package fundamentos;

public class Operadores {
    public static void main(String[] args) {

        /*
        * Os operadores aritimetricos são usados para fazer calculos matematicos*/

        int a = 10;
        int b = 20;

        int soma = a + b;
        int subtracao = a - b;
        int divisao = b / a;
        int multiplicacao = a * b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);

        /*Operadores de Comparação
        * < menor / > maior / <= menor, ou igual / >= maior, ou igual / == igual a / != diferente / */


        int adulto = 18;
        int crianca = 17;

        boolean resultado = adulto > crianca;
        boolean resultado1 = adulto > crianca;
        boolean resultado2 = adulto <= crianca;

        boolean resultado3 = adulto >= crianca;
        boolean resultado4 = adulto == crianca;
        boolean resultado5 = adulto != crianca;

        System.out.println(resultado);
        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
        System.out.println(resultado4);
        System.out.println(resultado5);

    }
}
