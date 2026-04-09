public class Cadastro {
    private String nome;
    private String RG;
    private int idade;

    public String getNome() {
        return nome;
    } //Metodo getter responsável por retornar o valor do atributo "nome"

    // Metodo setter responsável por alterar o valor do atributo "nome"
    public void setNome(String nome) {
        this.nome = nome;
    }
    // "this.nome" refere-se ao atributo da classe
    // "nome" é o parâmetro recebido no metodo

    public String getRG() {
        return RG;
    }// Metodo getter responsável por retornar o valor do atributo "RG"

    // Metodo setter responsável por alterar o valor do atributo "RG"
    public void setRG(String RG) {
        this.RG = RG;
    }

    public int getIdade() {
        return idade;
    } // Metodo getter responsável por retornar o valor do atributo "idade"

    // Metodo setter responsável por alterar o valor do atributo "idade"
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
