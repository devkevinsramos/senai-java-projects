/*
Programa para calcular o desconto
do IRRF de funcionários contratados pelo regime da CLT.
Autor: Kevin Silva Ramos
Data: 09/02/2026
*/
import java.util.Scanner; //Importa a biblioteca para o uso do teclado

public class Avaliacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu salário Bruto: ");
        //Pede o salário bruto para o usuário

        double salario = teclado.nextDouble();
        System.out.println("Salário bruto: " + salario);

        double descINSS = descontoINSS(salario);
        System.out.println("Valor INSS: " + descINSS);
        //Chama o metodo "descontoINSS" e imprime

        double baseIR = salario - descINSS;
        System.out.println("Base Ir: " + baseIR);
        //Calcula a base IR e imprime


        double calcIRF = calculoIRF(salario, descINSS);
        System.out.println("Valor IRF: " + calcIRF);
        //Chama o metodo "calculoIRF" e imprime

        double salarioliq = salario - descINSS - calcIRF;
        System.out.println("Salário liquído final: " + salarioliq);
        //Calcula o salário liquído e imprime

    }

    /* METODO DESCONTOINSS */
    public static double descontoINSS (double salario){
        double inss;
        if (salario<=2000){
            inss = salario * 0.075;
        }
        else if (salario<=4000){
            inss = salario * 0.1;
        }
        else if (salario<=6000){
            inss = salario * 0.12;
        }
        else {
            inss = salario * 0.14;
        }
        return inss;
    }

    /* METODO CALCULOIRF */
    public static double calculoIRF (double salario, double inss){
        double irf;
        double ir = salario - inss;
        if (ir <= 5000){
            irf = 0;
        }
        else if (ir <= 7500){
            irf = ir * 0.15 - 347;
        }
        else if (ir <= 10000){
            irf = ir * 0.19 - 598;
        }
        else {
            irf = ir * 0.22 - 875;
        }
        return irf;
    }
}
