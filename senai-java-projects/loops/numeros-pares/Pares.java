
public class Pares {
    public static void main(String[] args) {
        double resto;
        for (int i = 1; i <= 100; i++){
            resto = i % 2;
            if (resto != 0) continue;

            System.out.println(i + " ");
        }
    }
}
