import java.util.Scanner;

public class Calendario {
    public static void main(String[] args) {
        System.out.println("Digite o número do mês:");
        Scanner teclado = new Scanner(System.in);
        int mes = teclado.nextInt();
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Mês " + mes +" tem 31 dias.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Mês " + mes +" tem 30 dias.");
                break;
            case 2:
                System.out.println("Mês " + mes +" tem 28 0u 29 dias.\nDe qual ano?");
                int ano = teclado.nextInt();
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
                    System.out.println("O mês 2 de " + ano + " tem 29 dias.");
                else {
                    System.out.println("O mês 2 de " + ano + " tem 28 dias.");
                }
                break;

            default:
                System.out.println("Numero de mês inválido.");
        } // Fim switch case
        System.out.println("Fim do programa.");

    } // Fim void main

} // Fim da classe