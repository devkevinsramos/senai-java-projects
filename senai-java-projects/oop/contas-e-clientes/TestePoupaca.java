public class TestePoupaca {
    public static void main(String[] args) {
        Poupanca contaPoupanca = new Poupanca(23,30000);
        contaPoupanca.depositar(3000,1234);
        contaPoupanca.sacar(200,1234);
        System.out.println("Saldo Poupança: " + contaPoupanca.getSaldo());
    }
}
