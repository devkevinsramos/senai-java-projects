/*
Detector de maior e menor idade
Autor: Kevin Silva
Data: 03/02/2026
*/

public class Idade {
    public static void main(String[] args) {

        //Variáveis
        int [] idade = {0xf,0x14,0xe,0x23,0x2d,0x48,0x27,0x15,0x16,0x44,0x2f,0xd,0x36,0x1c,0x34,0x10,0x40,0x1f};
        int maior = idade[0];
        int menor = idade[0];

        //Detector de Idades
        for (int i = 1; i < idade.length ; i++){

            System.out.println("Idade: " + idade[i]); //Imprime todas as idades

            if (idade[i]> maior){ //Identifica a maior com comparação entre todas as idades
                maior = idade[i];
            }

            if (idade[i]< menor){ //Identifica a menor com comparação entre todas as idades
                menor = idade[i];
            }
        }
        System.out.println("Maior Idade: " + maior); //Imprime a maior idade
        System.out.println("Menor Idade: " + menor); //Imprime a menor idade
    }
}
