/*
* Classe objeto com as propriedades comuns as contas.
*
*/

public class Conta {
    // Lista das variáveis (Atributos)
    int agencia;
    int numeroConta;
    private double saldo = 0 ; // O saldo não pode ser acessado diretamente!
    private int senha = 1234;

    // Construtor para agencia e conta
    Conta (int agencia, int numeroConta) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void depositar(double deposito, int senha){
        if (senha == 1234) {
            saldo = saldo + deposito;
        } else {
            System.out.println("Operação não realizada! Seha Incorreta.");
        }
    }
    public void sacar (double saque, int senha){
        if (senha == 1234 ) {
            saldo = saldo - saque;
        } else {
            System.out.println("Operação não realizada! Senha Incorreta.");
        }
    }
}
/*
    public void setSaldo (double deposito){

        saldo = saldo + deposito;

    }

    public double getSaldo(){
        return saldo;
    }
*/