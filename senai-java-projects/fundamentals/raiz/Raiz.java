/*
Programa para cálculo de raiz exata
Autor: Modesto Magraner
Versão 1.0.0
27/01/2026
 */
// Carrega as bibliotecas para leitura do teclado
import java.util.Scanner;
public class Raiz {


    public static void main(String[] args) {
        // Cria uma instância do scanner pra ler o teclado
        Scanner teclado = new Scanner(System.in);


        // Mensagem para o usuário digitar um número
        System.out.print("Digite um número para calcular a raiz: ");

        // Define as variaveis usadas no programa
        // Cria variavel para o calculo da raiz, lendo o valor digitado pelo usuario
        int x = teclado.nextInt();

        int contador = 0; // Variavel contador iniciando em 1

        int quadrado = 0; // Variável para receber o quadrado do contador

        int raiz = -1; // Variavel da resposta da raiz

        // Verifica se x é positivo
        if (x < 0) {
            System.out.println("Não existe raiz negativa, cabeção!!");
        }
        else {

            // Loopin do contador iniciando em 1
            while (raiz == -1) { // Repete enquanto não for encontrada a raiz

                quadrado = contador * contador;  // Cálcula o quadrado do contador

                // Verifica se o quadrado calculado é igula a raiz
                if (quadrado == x) {

                    // Se for igual atribui à variável rais
                    raiz = contador;

                }
                // Se for diferente, incrementa o contador e retorna para o laço
                contador = contador + 1;


            } // Fim do laço While

            // Quando raiz for diferente de 0, escreve o valor da raiz
            System.out.println("A raiz de " + x + " é: " + raiz);
        } // fim do else

    } // Fim do main

} // Fim da classe Raiz