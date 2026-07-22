package fundamentos;

public class ListaComArray {
    public static void main(String[] args) {
        System.out.println("Lista de Array");
        /*Banco de dados de Nomes de um grupo de pessoas*/

        /*Criando o Array e percorrendo ele com o loop for*/
        String[] nomes = {"Sabrina", "Douglas", "Stella", "Daiane", "Matheus"};
        for( int i = 0; i < nomes.length; i++ ) {
            System.out.println( nomes[i] );
        }


        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println( numeros[i] );
        }
    }
}
