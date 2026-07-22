package fundamentos;

public class VariaveisEConstantes {
    public static void main(String[] args) {
        /*Variaveis e Constante servem para armazenar dados no sistema como:
         * o nome de uma pessoa, sua idade, seu sexo*/

        /*1. declarando uma variavel*/
        int idade;

        /*2. inicializar a variavel*/
        idade = 38;

        /*Declarando e inicializando tudo em uma linha*/
        String nome = "Douglas Coelho";

        /*Aqui temos uma constante (final), ela nao pode ser mudada*/
        final String cpf = "000.000.00-01";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}
