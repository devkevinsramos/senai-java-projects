import java.util.Scanner;
import java.util.Map;

public class  Funcionalidades {
    static Scanner sc = new Scanner(System.in);
    static private int index = 0;


    //metodo de cadastro do nome
      public static String cadNome() {
      System.out.print("Digite o nome: ");
      String nome = sc.nextLine();
      return nome;

    } // Fim cadNome

    //Metodo cadastro idade
    public static int cadIdade() {
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        return idade;
    }// Fim cadIdade

    //Metodo cadastro RG
    public static String cadRG() {
        System.out.print("Digite o RG: ");
        String rg = sc.nextLine();
        return rg;

    } // Fim cadRg


    //Metodo de geração de index sequencial
    public static int nextIndex() {

          int novoIndex = index;
          index = index + 1;
          return novoIndex;
    }

    //metodo para printar todos os dados cadastrados
    public static void printar(Cadastro cadastro) {
        String nomeCad = cadastro.getNome();
        String rg = cadastro.getRG();
        int idade = cadastro.getIdade();
        System.out.println("Nome: " + nomeCad + "\nRG: " +rg + "\nidade: " + idade );
    }

    // funcao de editar o RG de um Cadastro armazenado no Map, utilizando o índice como chave
    public static void editarRG(Map<Integer, Cadastro> banco, int indice) {
        String novoRG = Funcionalidades.cadRG();  // Solicita o novo RG
        Cadastro editarRG = banco.get(indice);   //obtem o cadastro existente no indice
        editarRG.setRG(novoRG);                  // Atualiza o RG
    }

    // funcao de editar a idade de um Cadastro armazenado no Map, utilizando o índice como chave
    public static void editarIdade(Map<Integer, Cadastro> banco, int indice) {
        int novaIdade = Funcionalidades.cadIdade(); // solicita nova idade
        Cadastro editarIdade = banco.get(indice); //obtem o cadastro existente no indice
        editarIdade.setIdade(novaIdade); // atualiza para nova idade
        //banco.put(indice, editarIdade); // só em caso de conferência

    }

    // funcao de editar a idade de um Cadastro armazenado no Map, utilizando o índice como chave
    public static void editarNome(Map<Integer, Cadastro> banco, int indice) {
        String novoNome = Funcionalidades.cadNome(); //solicita um novo nome ao usuário
        Cadastro editarNome = banco.get(indice); //obtem o cadastro existente no indice
        editarNome.setNome(novoNome); //atuliza para o novo nome

    }

}
