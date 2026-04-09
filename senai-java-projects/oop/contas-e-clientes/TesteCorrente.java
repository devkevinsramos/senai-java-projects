public class TesteCorrente {
    public static void main(String[] args) {
        Corrente contaCorrente = new Corrente(1234,20000);
        contaCorrente.depositar(2000,1234);
        contaCorrente.sacar(300,1234);
        System.out.println("Saldo Corrente: " + contaCorrente.getSaldo());
    }
}
