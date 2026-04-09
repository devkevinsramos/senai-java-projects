/* 
Atividade com For: Contador de Vogais 
Autor: Kevin Silva 
Data: 02/02/2026 
*/

import java.util.Scanner;

public class AtividadeFor {

    public static void main(String[] args) {
        Scanner tecaldo = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String palavra = tecaldo.nextLine();

        palavra = palavra.toLowerCase(); // Padroniza vogal maiúscula e minúscula

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) { // Retorna a quantidade de letras

            char letra = palavra.charAt(i); //Variável para contar as vogais
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contadorVogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + contadorVogais);
    }
}