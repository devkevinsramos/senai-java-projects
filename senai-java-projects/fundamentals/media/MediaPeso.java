public class MediaPeso {
    public static void main(String[] args) {

            double nota1 = 10, nota2 = 5.5, nota3 = 3, nota4 = 5; // váriavel das notas
            double media = (nota1 + (nota2 * 2 + nota3 * 3 + nota4 * 4)) / 10; // váriavel da media
        System.out.println("Sua média é: " + media);
                if (media >= 5){
                    System.out.println("Aluno aprovado!");
                }else {
                    System.out.println("Aluno reprovado!");}
    }
}
