public class TestaPublico {
    public static void main(String[] args) {
        // Criar instancia da classe Publico
        // Com o construtor publico com dois atributos
        Publico publico = new Publico("Fulano",32);

        // Abaixo acessamos as atributos diretamente com a notação de ponto
        System.out.println("Nome: " + publico.nome);
        System.out.println("Idade: " + publico.idade);

        // Podemos modificar os valores diretamente
        publico.nome = "Beltrano";
        publico.idade = 35;

        // Chamado o metodo anoNascimento
        int anoNasc = publico.anoNascimento();
        System.out.println("Nome: " + publico.nome);
        System.out.println("Idade: " + publico.idade);
        System.out.println("Nasceu em: " + anoNasc);

    }
}
