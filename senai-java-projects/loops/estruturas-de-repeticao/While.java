/* 
Atividade com While: Verificação de Senha 
Autor: Kevin Silva 
Data: 02/02/2026 
*/

import java.util.Scanner;

public class AtividadeWhile {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String senhatrue = "Modesto123"; //Senha verdadeira
        String senha; //Senha digitada pelo usuário

        System.out.println("Bem vindo de volta!");
        System.out.print("Digite a senha: ");
        senha = teclado.nextLine();

        while (!senha.equals(senhatrue)) {
            System.out.println("Senha incorreta! Tente novamente.");
            System.out.print("Digite a senha: ");
            senha = teclado.nextLine();
        }

        System.out.println("Acesso liberado!");
    }
}