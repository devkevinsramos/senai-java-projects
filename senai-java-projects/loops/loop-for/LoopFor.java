/*
 * Looping usado para contagem. É um looping que usamos quando sabemos o número de
 * repetições que devem ser executadas.
 *
 * Sintaxe:  for ( variável da contagem com valor inicial ; condição ; regra de contagem) {
 *
 *                  rotina a ser repetida
 *  }
 *
 *  Exemplo: for ( int i = 0 ; i < 10 ; i++ ) {
 *      system.out.println (i);
 *  }
 *
 *  Esta rotina imprime na tela os números de 0 a 9, pulando linhas
 */


public class LoopFor {
    public static void main(String[] args) {

        for (int i = 0 ; i < 10 ; i++){
            System.out.println(i);
        } // Fim do for

        // A linha abaixo gera erro pois a variável i não existe for
        // do escopo (bloco de programa) do for
        // System.out.println(i);

        // Rotina para receber um valor externo ao laço for

        int contador = 10; // Atrubui um valor a uma variável

        for (int j = contador; j >= 0 ; j --){
            System.out.print(j + " ");

        }
        System.out.println("Fim do programa");

    } // Fim do main

} // Fim da classe LoopFor
