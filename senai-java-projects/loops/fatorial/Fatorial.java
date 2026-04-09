import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número:");
        long num = teclado.nextInt();
        long fatorial = 1;
        for (long i = num; i>=1; i--){
            fatorial = fatorial * i;
        }
        System.out.println("A fatorial de " + num + " é " + fatorial);
    }
}
