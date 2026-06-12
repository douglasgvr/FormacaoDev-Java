package introducao.estruturasCondicionais;

public class Aula04OperadorTernario03 {
    public static void main(String[] args) {
        // Doar se Salário for maior que 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500,00";
        String mensagemNaoDoar = "Ainda não tenho 500,00 para doar.";

        // Operador ternario
        // (condição) ? verdadeiro : falso;

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

    }
}
