import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha a forma a qual devemos calcular a área:");
        System.out.print("1 - Quadrado, 2 - Triângulo , 3 - Círculo\n");

        int opcao = teclado.nextInt();
        if (opcao == 1) {
            System.out.println("Você escolheu o Quadrado.\nDigite o valor do lado:" );
            int ladoq = teclado.nextInt();
            int resultado = ladoq * ladoq;
            System.out.println("Resultado = " + resultado);
        }
        else if (opcao == 2)  {
            System.out.println("Você escolheu o Triângulo.\nDigite o valor da base:" );
            int base = teclado.nextInt();
            System.out.println("Digite o valor da altura: ");
            int altura = teclado.nextInt();
            int resultado = base * altura /2;
            System.out.println("Resultado = " + resultado);
        }
        else if (opcao == 3) {
            System.out.println("Você escolheu Círulo\nDigite o valor do raio: ");
            int raio = teclado.nextInt();
            double resultado = 3.1416 * (raio * raio);
            System.out.printf("Resultado = %.2f", resultado);
        }
        else {
            System.out.println("Opção inválida.");
        }
    }
}
