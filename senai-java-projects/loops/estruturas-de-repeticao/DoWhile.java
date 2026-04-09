/* 
Atividade com While: Verificação de Senha 
Autor: Kevin Silva 
Data: 02/02/2026 
*/

import java.util.Scanner;
import java.util.Random; //Biblioteca para gerar o número aleatório

public class AtividadeDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); //Gera o número aleatório

        int numeroSecreto = random.nextInt(10) + 1; //Gera o número aleatório de 0 a 9  e soma mais 1
        int chute;

        System.out.println("Descubra o número secreto.");

        do {
            System.out.print("Digite um número entre 1 e 10: ");
            chute = scanner.nextInt();

            if (chute < 1 || chute > 10) {
                System.out.println("De 1 a 10 Cabeça oca!");
            }
            else if (chute < numeroSecreto) {
                System.out.println("Muito baixo! Tente novamente.");
            }
            else if (chute > numeroSecreto) {
                System.out.println("Muito alto! Tente novamente.");
            }

        } while (chute != numeroSecreto);

        System.out.println("Parabéns, você acertou!");
        scanner.close();
    }
}