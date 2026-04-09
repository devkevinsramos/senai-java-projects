import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Questao {
    private JPanel Main;
    private JPanel Topo;
    private JPanel Centro;
    private JCheckBox alt1;
    private JCheckBox alt2;
    private JCheckBox alt3;
    private JCheckBox alt4;
    private JCheckBox alt5;
    private JLabel questao;
    private JButton botaoResposta;
    private JPanel Botton;

    public static void main(String[] args) {
        Questao q = new Questao();
        JFrame frame = new JFrame("Questão");
        frame.setContentPane(q.Main);
        frame.setSize(410, 305);
        frame.setVisible(true);
        q.botaoResposta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame newWin = new JFrame("Resposta");
                newWin.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                newWin.setSize(200, 150);
                if (q.alt1.isSelected() &&
                        q.alt3.isSelected() &&
                        q.alt4.isSelected() &&
                        !q.alt2.isSelected() &&
                        !q.alt5.isSelected()) {
                    JLabel etiqueta = new JLabel("Resposta correta");
                    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                    newWin.getContentPane().add(etiqueta);
                } else {
                    JLabel etiqueta = new JLabel("Resposta incorreta");
                    etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                    newWin.getContentPane().add(etiqueta);
                }
                newWin.setVisible(true);
            }
        });
    }
}

