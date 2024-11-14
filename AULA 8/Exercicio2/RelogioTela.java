package Exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RelogioTela extends JFrame {
    private Relogio relogio;
    private JLabel mostradorLabel;

    public RelogioTela() {
        // Instancia o relógio usando as classes fornecidas
        relogio = new Relogio();

        // Configura a janela
        setTitle("Relógio");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Cria o JLabel para exibir o mostrador
        mostradorLabel = new JLabel(relogio.mostra());
        mostradorLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        add(mostradorLabel);

        // Botão TicTac
        JButton ticTacButton = new JButton("TicTac");
        ticTacButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relogio.ticTac();
                atualizaMostrador();
            }
        });
        add(ticTacButton);

        // Botão Hora
        JButton horaButton = new JButton("Hora");
        horaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novaHora = JOptionPane.showInputDialog("Defina a Hora (0-23):");
                try {
                    int hora = Integer.parseInt(novaHora);
                    if (hora >= 0 && hora <= 23) {
                        relogio.hora = new Mostrador(24); // Reseta o mostrador de horas
                        for (int i = 0; i < hora; i++) {
                            relogio.hora.incrementa(); // Incrementa até a hora desejada
                        }
                        atualizaMostrador();
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido! Insira um número entre 0 e 23.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                }
            }
        });
        add(horaButton);

        // Botão Minuto
        JButton minutoButton = new JButton("Minuto");
        minutoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String novoMinuto = JOptionPane.showInputDialog("Defina o Minuto (0-59):");
                try {
                    int minuto = Integer.parseInt(novoMinuto);
                    if (minuto >= 0 && minuto <= 59) {
                        relogio.minuto = new Mostrador(60); // Reseta o mostrador de minutos
                        for (int i = 0; i < minuto; i++) {
                            relogio.minuto.incrementa(); // Incrementa até o minuto desejado
                        }
                        atualizaMostrador();
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido! Insira um número entre 0 e 59.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
                }
            }
        });
        add(minutoButton);
    }

    // Método para atualizar o JLabel com o horário atual
    private void atualizaMostrador() {
        mostradorLabel.setText(relogio.mostra());
    }

    public static void main(String[] args) {
        // Cria e exibe a tela do relógio
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelogioTela().setVisible(true);
            }
        });
    }
}
