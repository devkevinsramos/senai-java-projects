/*
Detector de maior e menor idade
Autor: Kevin Silva
Data: 03/02/2026
*/

import java.util.Arrays; //Importação da biblioteca de arrays

public class Idade2 {
    public static void main(String[] args) {

        //Variáveis
        int [] idade = {0xf,0x14,0xe,0x23,0x2d,0x48,0x27,0x15,0x16,0x44,0x2f,0xd,0x36,0x1c,0x34,0x10,0x40,0x1f};
        Arrays.sort(idade); //Organiza automaticamente em ordem crescente

        System.out.println("Em ordem crescente: " );
            for (int i = 0; i < idade.length; i++) { //Imprime de forma organizada
            System.out.println(idade[i]);
            }

        System.out.println("Em ordem decrescente: " );
            for (int i = idade.length - 1; i >= 0; i--) { //Percorre do fim para o início
            System.out.println(idade[i]);
            }

    }
}
