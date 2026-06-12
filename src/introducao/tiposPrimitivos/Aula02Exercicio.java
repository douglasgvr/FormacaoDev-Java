package introducao.tiposPrimitivos;
/*
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi
 * o salário de <salário>, na data <data> */

public class Aula02Exercicio {

    public static void main(String[] args) {
        String nome = "Douglas Coelho";
        String endereco = "Rua dos bobos";
        int numeroDaCasa = 69;
        double salario = 3000.00;
        String dataDoRecebimento = "23/11/1988";

        System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + " na data de " + dataDoRecebimento);
    }
}
