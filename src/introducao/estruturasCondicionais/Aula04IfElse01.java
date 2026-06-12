package introducao.estruturasCondicionais;

public class Aula04IfElse01 {
    public static void main(String[] args) {

        /*
        * O conceito é simples: "Se isto for verdade,
        * faz isto; senão, faz aquilo".
        * No Java, usamos principalmente três estruturas:
        * 1. if/ else
        * 2. else if
        * 3. switch: ideal para quando tens uma única variavel e queres testar vários
        * valores exatos (como dias da semana)*/

        // If/Else -- Se! SE você tem dinheiro você compra, SE não, não compra.
        int idade = 20;
        boolean isAutorizado = idade >= 18;
        if (isAutorizado) {
            System.out.println("Ele é maior de Idade, Autorizado!");
        } else {
            System.out.println("Ele é menor de idade, não está Autorizado");
        }


        if (isAutorizado == false) {
            System.out.println("Não está autorizado a comprar bebidas!");
        } else {
            System.out.println("Não é Autorizado!");
        }
    }
}
