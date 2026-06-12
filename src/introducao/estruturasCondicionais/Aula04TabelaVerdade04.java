package introducao.estruturasCondicionais;

public class Aula04TabelaVerdade04 {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("        TABELA VERDADE EM JAVA       ");
        System.out.println("=====================================\n");

        // 1. Operador E Lógico (&&)
        // O resultado só é verdadeiro se AMBAS as condições forem verdadeiras.
        System.out.println("--- 1. Operador E Lógico (&&) ---");
        System.out.println("Verdadeiro && Verdadeiro = " + (true && true));
        System.out.println("Verdadeiro && Falso      = " + (true && false));
        System.out.println("Falso      && Verdadeiro = " + (false && true));
        System.out.println("Falso      && Falso      = " + (false && false));
        System.out.println();

        // 2. Operador OU Lógico (||)
        // O resultado é verdadeiro se PELO MENOS UMA das condições for verdadeira.
        System.out.println("--- 2. Operador OU Lógico (||) ---");
        System.out.println("Verdadeiro || Verdadeiro = " + (true || true));
        System.out.println("Verdadeiro || Falso      = " + (true || false));
        System.out.println("Falso      || Verdadeiro = " + (false || true));
        System.out.println("Falso      || Falso      = " + (false || false));
        System.out.println();

        // 3. Operador OU Exclusivo (^)
        // O resultado é verdadeiro APENAS se as condições forem DIFERENTES uma da outra.
        System.out.println("--- 3. Operador OU Exclusivo (^) ---");
        System.out.println("Verdadeiro ^ Verdadeiro = " + (true ^ true));
        System.out.println("Verdadeiro ^ Falso      = " + (true ^ false));
        System.out.println("Falso      ^ Verdadeiro = " + (false ^ true));
        System.out.println("Falso      ^ Falso      = " + (false ^ false));
        System.out.println();


        // ==========================================
        // EXEMPLO PRÁTICO COM ESTRUTURA DE CONTROLE
        // ==========================================
        System.out.println("--- Exemplo Prático com IF ---");

        boolean condicao1 = true;  // Verdadeiro
        boolean condicao2 = false; // Falso

        // Testando o && (E)
        if (condicao1 && condicao2) {
            System.out.println("Condição &&: Isso NÃO vai imprimir, porque V e F resulta em Falso no &&.");
        } else {
            System.out.println("Condição &&: Caiu no ELSE, pois 'true && false' é igual a false.");
        }

        // Testando o || (OU)
        if (condicao1 || condicao2) {
            System.out.println("Condição ||: Isso VAI imprimir, porque V e F resulta em Verdadeiro no ||.");
        }

    }
}
