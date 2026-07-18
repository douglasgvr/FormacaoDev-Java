package fundamentos;

public class TiposVariaves {
    public static void main(String[] args) {

        System.out.println("Hello World");

        /*
        * O Java usa variáveis para guardar informações. Cada variável possui um tipo específico.*/

        // Estrutura de uma variável: tipo da variável + nome de atribuição = valor da variavel.
        String meuNome = "Douglas Coelho";
        String mensagem = "Meu nome é: ";
        //Concatenação -> juntar as duas variaveis;

        System.out.println(mensagem + meuNome);

        //Tipos Numéricos
        int idade = 38; // tipo numero inteiro.
        double valor = 100.50; // tipo numero decimais
        long numeroDoCpf = 123456789L; // numero longo "Extenso"
        System.out.println("A idade do " + meuNome + " é " + idade + " anos");

        //Tipo boolean
        boolean isAtivo = false;

        // char serve para uma unica letra, como v ou f, tipo de sexo f ou m,
        // serve também para capturar as letras digitadas no teclado
        // exemplo ao digitar o + no teclado ele pode ajudar a saber que é pra somar em um algoritmo
        char sexo = 'M';

    }
}
