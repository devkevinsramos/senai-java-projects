import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Conversor {
    private JPanel base;
    private JPanel topo;
    private JPanel entradas;
    private JPanel informacao;
    private JLabel titulo;
    private JTextField inputs;
    private JComboBox comboBox1;
    private JButton botao;
    private JTextField output;
    private JLabel polegadas;
    private JLabel metrico;

    public Conversor() {
        // O código do construtor é gerado automticamente na janela do form, clicando no objeto (botao)
        // -> generate -> Create Listiner -> Action Listiner
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Este código dentro do void actionPerforomed é o trabalhi do DS
                // Cria um array com os multiplicadores para converter pol - > metrica
                double [] multiplicador = {0.0254, 0.254, 2.54, 25.4};
                // Metodo para captruar a indice do comboBox
                int indice = comboBox1.getSelectedIndex();
                // Ler o texto digitado pelo usuário e converter num double
                // Para fazer a conversão usamos o metodo Double.parseDouble (texto a ser convertido)
                // O texto digitado é obtido ccm nomeField.getText()
                double numeroDigitado = Double.parseDouble(inputs.getText());
                // Cálculo da conversão
                double resultado = numeroDigitado * multiplicador[indice];
                // Exibir o resultado no campo output, mas no formato de texto
                // Para transformar um numero de qualquer tipo em texto, inserimos "" + numero
                // Com isso o numero fara uma concatenação com o texto.
                output.setText("" + resultado);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoEntrada = comboBox1.getSelectedItem().toString();
                metrico.setText(textoEntrada);

            }
        });
    } // Fim do construtor Conversor

    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor");
        frame.setContentPane(new Conversor().base);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
