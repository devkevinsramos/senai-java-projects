/*
* Modificador Publico
* Aplicado a classes: Permite por qualquer outra classe.
* Aplicado a metodos, atributos e construtores: O código é acessível
* por todas as classes.
*
*/

// A classe abaixo é acessível por qualqur classe
public class Publico {
    // Os atributos abaixo pedem ser acessados por qualquer classe
    public String nome;
    public int idade;

    // O construtor abaixo é acessado por qualquer classe
    public Publico (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    // O metodo abaixo é acessado por qualquer coisa
    public int anoNascimento() {
        int anoNasc = 2026 - idade;
        return anoNasc;
    }
}
