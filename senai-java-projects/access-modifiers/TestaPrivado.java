public class TestaPrivado {
    public static void main(String[] args) {
        Privada carro = new Privada();
        // O acesso direto provoa erro, pois os atributos estão como private
        // carro.modelo = "Ka";

        // Para atribuir valores, usamos os metodos publicos set:
        carro.setModelo("Ka");
        carro.setFabricante("Ford");
        carro.setPotencia(85);

        // String modelo = carro.modelo;
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Fabricante: " + carro.getFabricante());
        System.out.println("Potencia: " + carro.getPotencia());

        // carro.mudaModelo();

        carro.descontinuado();
        System.out.println("\nModelo: " + carro.getModelo());

    }
}
