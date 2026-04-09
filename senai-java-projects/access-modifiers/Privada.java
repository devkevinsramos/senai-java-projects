/*
* Modificar private:
* Aplicado para atributos, construtores e metodos
* Este atributo permite acesso somente dentro da classe que declarou
*/

// Declarar classe padrão Privada
class Privada {
    // Declarar atributos privados. Só podem ser acessados por um
    // metodo dentro desta classe. (get e set)
    private String modelo;
    private String fabricante;
    private int potencia;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    // Criar metodo privado
    private void mudaModelo () {
        modelo = modelo + " saiu de linha.";
    }

    // Metodo publico para acessar metodo privado;
    public void descontinuado() {
        mudaModelo();
    }
}
