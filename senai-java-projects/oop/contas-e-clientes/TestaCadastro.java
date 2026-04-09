public class TestaCadastro {
    public static void main(String[] args) {
        // Instanciar um cadastro
        // Sintaxe
        // NomeClasse nomeInstancia = newconstrutor (parametros);
        CadastroCliente cadastroTeste = new CadastroCliente();
        // Para popular as variáveis, usamos o comando:
        // nomeInstância.nomeVariável = valor a ser atribuído
        cadastroTeste.nome = "Fulano de Tal";
        cadastroTeste.cpf = "123456789-00";
        cadastroTeste.idade = 30;
        cadastroTeste.telefone = "11 94002-8922";

        System.out.println("Nome: " + cadastroTeste.nome);
        System.out.println("Cpf: " + cadastroTeste.cpf);
        System.out.println("Idade: " + cadastroTeste.idade);
        System.out.println("Telefone: " + cadastroTeste.telefone);
    }
}
