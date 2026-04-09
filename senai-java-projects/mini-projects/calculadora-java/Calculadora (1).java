import java.util.Scanner;

public class CalculadoraChat {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        // Loop principal para garantir que o usuário escolha uma opção válida
        do {
            System.out.println("Escolha a forma a qual devemos calcular a área:");
            System.out.print("1 - Quadrado, 2 - Triângulo , 3 - Círculo\n");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                calcularAreaQuadrado(teclado);  // Método para calcular a área do quadrado
            } else if (opcao == 2) {
                calcularAreaTriangulo(teclado); // Método para calcular a área do triângulo
            } else if (opcao == 3) {
                calcularAreaCirculo(teclado);   // Método para calcular a área do círculo
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao < 1 || opcao > 3); // O loop continuará até que o usuário insira uma opção válida

        teclado.close(); // Fecha o scanner
    }

    // Método para calcular a área do quadrado
    public static void calcularAreaQuadrado(Scanner teclado) {
        int ladoq;
        do {
            System.out.println("Você escolheu o Quadrado.\nDigite o valor do lado:");
            ladoq = teclado.nextInt();
            if (ladoq <= 0) {
                System.out.println("Valor inválido! O lado do quadrado deve ser positivo.");
            }
        } while (ladoq <= 0);  // Loop até o valor do lado ser válido

        int resultado = ladoq * ladoq;
        System.out.println("Resultado = " + resultado);
    }

    // Método para calcular a área do triângulo
    public static void calcularAreaTriangulo(Scanner teclado) {
        int base, altura;

        // Validação da base
        do {
            System.out.println("Você escolheu o Triângulo.\nDigite o valor da base:");
            base = teclado.nextInt();
            if (base <= 0) {
                System.out.println("Valor inválido! A base do triângulo deve ser positiva.");
            }
        } while (base <= 0);

        // Validação da altura
        do {
            System.out.println("Digite o valor da altura:");
            altura = teclado.nextInt();
            if (altura <= 0) {
                System.out.println("Valor inválido! A altura do triângulo deve ser positiva.");
            }
        } while (altura <= 0);

        int resultado = base * altura / 2;
        System.out.println("Resultado = " + resultado);
    }

    // Método para calcular a área do círculo
    public static void calcularAreaCirculo(Scanner teclado) {
        int raio;

        // Validação do raio
        do {
            System.out.println("Você escolheu Círculo\nDigite o valor do raio:");
            raio = teclado.nextInt();
            if (raio <= 0) {
                System.out.println("Valor inválido! O raio do círculo deve ser positivo.");
            }
        } while (raio <= 0);

        double resultado = Math.PI * (raio * raio);  // Usando Math.PI para maior precisão
        System.out.printf("Resultado = %.2f", resultado);  // Exibe o resultado com duas casas decimais
    }
}
