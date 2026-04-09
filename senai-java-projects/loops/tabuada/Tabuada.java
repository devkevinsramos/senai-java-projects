/*
Tabuada
Autor: Kevin Silva
Data: 02/02/26
*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número para realizar a tabuada:");
        int numero = teclado.nextInt();

        for (int i = 1 ; i < 11 ; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
