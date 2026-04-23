package introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        /*
        * Os tipos primitivos são:
        * int, double, float, char, byte short, long, boolean
        * vamos dividir eles em 4 categorias:
        * Obs: Lembra-te: Números Long precisam de um L e Números Float de um F ao final do valor da variável para que
        * o compilador não bug*/

        // Números inteiros: para contagens e números sem casa decimais
        int idade = 10;
        byte idadeByte = 10;
        short idadeShort = 10;
        long numeroGrande = 10000;

        // Números Decimais: Para valores com vírgula, como preços ou medidas
        double salarioDouble = 2000.0;
        float precoLeite = 2500.0f;

        // Caracteres: Para letras ou símbolos únicos
        // tipo de sexo, por exemplo: masculino ou feminino.
        char inicialDoNome = 'D';

        // Lógica: Para valores de verdadeiro ou falso
        boolean estaChovendo = true;
        boolean estaChovendoHoje = false;

        System.out.println("Idade: " + idade);
        System.out.println("Preço: " + precoLeite);
        System.out.println("Iniciais: " + inicialDoNome);
        System.out.println("Está chovendo? " + estaChovendo);
    }
}
