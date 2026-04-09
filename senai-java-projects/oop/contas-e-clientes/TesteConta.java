public class TesteConta {
    public static void main(String[] args) {
        Conta contaTeste = new Conta(123,34567);
        //contaTeste.setSaldo(2000);
        contaTeste.depositar(1000, 1233);
        contaTeste.sacar(200, 1233);
        System.out.println("Agencia: " + contaTeste.agencia);
        System.out.println("Conta: " + contaTeste.numeroConta);
        System.out.println("Saldo: " + contaTeste.getSaldo());


    }
}
