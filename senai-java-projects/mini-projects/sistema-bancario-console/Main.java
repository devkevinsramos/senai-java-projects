//Fabiola Girotti
//Gabriella Carvalho
//Kevin Silva Ramos

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map <Integer, Cadastro> banco = new HashMap<>();
        int opcao = 0;

        while (opcao != 9) {

            System.out.println("Cadastro Nome - Idade");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Printar Cadastro");
            System.out.println("3 - Editar Cadastro");
            System.out.println("9 - Sair");
            System.out.print("Digite sua opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    // Chama os metodos que cadastram um novo usuario
                    String nome = Funcionalidades.cadNome();
                    String rg = Funcionalidades.cadRG();
                    int idade = Funcionalidades.cadIdade();
                    int index = Funcionalidades.nextIndex();
                    Cadastro cadastro = new Cadastro();
                    cadastro.setNome(nome);
                    cadastro.setRG(rg);
                    cadastro.setIdade(idade);
                    banco.put(index, cadastro);
                    System.out.println(banco);
                    break;

                case 2:
                    //Consultar usuario através do indice e printar na tela
                    System.out.print("Digite o indice para consultar ");
                    int indice = sc.nextInt();
                    System.out.println("Indice: " + indice);
                    sc.nextLine();

                    Cadastro cadLido = banco.get(indice);
                    Funcionalidades.printar(cadLido);
                    break;

                case 3:
                    //consulta o indice e printa na tela
                    System.out.print("Digite o indice para consultar ");
                    indice = sc.nextInt();
                    System.out.println("Indice: " + indice);
                    sc.nextLine();// limpa o buffer
                    cadLido = banco.get(indice);
                    Funcionalidades.printar(cadLido);

                    //opções para alteração de cadastro
                    System.out.println("O que você deseja alterar?");
                    System.out.println("1 - Nome");
                    System.out.println("2 - Idade");
                    System.out.println("3 - RG");
                    System.out.println("9 - Sair");
                    int opcao2 = sc.nextInt();
                    sc.nextLine();

                    //switch para escolher qual atributo será editado
                    switch (opcao2) {

                        case 1:
                            // Chama o metodo que edita o nome no Map usando o índice e exibe o cadastro atualizado
                            Funcionalidades.editarNome(banco, indice);
                            cadLido = banco.get(indice);
                            Funcionalidades.printar(cadLido);
                            break;

                        case 2:
                            // Chama o metodo que edita a idade no Map usando o índice e exibe o cadastro atualizado
                            Funcionalidades.editarIdade(banco, indice);
                            cadLido = banco.get(indice);
                            Funcionalidades.printar(cadLido);
                            break;

                        case 3:
                            // Chama o metodo que edita o RG no Map usando o índice e exibe o cadastro atualizado
                            Funcionalidades.editarRG(banco, indice);
                            cadLido = banco.get(indice);
                            Funcionalidades.printar(cadLido);
                            break;
                        case 9:
                            break;

                        default:
                            System.out.println("Opção " + opcao + " invalida!");
                    }
                    break;
                case 9:
                    break;

                default:
                    System.out.println("Opção " + opcao + " invalida!");

            }// Fim switch

        } // Fim while

    } // Fim main

} // Fim classe Main
