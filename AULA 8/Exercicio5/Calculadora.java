package Exercicio5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame {
    private JTextField display; // Campo de exibição
    private int operando1 = 0; // Primeiro operando
    private int operando2 = 0; // Segundo operando
    private String operacao = ""; // Operação atual

    public Calculadora() {
        // Configura a janela
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Cria o campo de exibição
        display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.PLAIN, 24));
        add(display, BorderLayout.NORTH);

        // Cria o painel de botões
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Adiciona os botões de acordo com o layout da imagem
        panel.add(createButton("7"));
        panel.add(createButton("8"));
        panel.add(createButton("9"));
        panel.add(createButton("+"));
        panel.add(createButton("4"));
        panel.add(createButton("5"));
        panel.add(createButton("6"));
        panel.add(createButton("-"));
        panel.add(createButton("1"));
        panel.add(createButton("2"));
        panel.add(createButton("3"));
        panel.add(createButton("*"));
        panel.add(createButton("0"));
        panel.add(createButton("C"));
        panel.add(createButton("="));
        panel.add(createButton("/"));

        // Adiciona o painel de botões à janela
        add(panel, BorderLayout.CENTER);
    }

    // Cria um botão com a função associada
    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 24));
        button.addActionListener(new ButtonClickListener());
        return button;
    }

    // Listener para os botões
    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            if (comando.matches("\\d")) { // Se for um número
                if (display.getText().equals("0") || operacao.equals("=")) {
                    display.setText(comando);
                    if (operacao.equals("=")) operacao = "";
                } else {
                    display.setText(display.getText() + comando);
                }
            } else if (comando.equals("C")) { // Limpar
                display.setText("0");
                operando1 = 0;
                operando2 = 0;
                operacao = "";
            } else if (comando.equals("=")) { // Calcular resultado
                operando2 = Integer.parseInt(display.getText());
                int resultado = calcular();
                display.setText(String.valueOf(resultado));
                operacao = "=";
                operando1 = resultado; // Guarda o resultado para futuras operações
            } else { // Operação (+, -, *, /)
                operacao = comando;
                operando1 = Integer.parseInt(display.getText());
                display.setText("0");
            }
        }

        // Realiza o cálculo com base na operação selecionada
        private int calcular() {
            switch (operacao) {
                case "+": return operando1 + operando2;
                case "-": return operando1 - operando2;
                case "*": return operando1 * operando2;
                case "/":
                    if (operando2 != 0) return operando1 / operando2;
                    else {
                        JOptionPane.showMessageDialog(null, "Erro: Divisão por zero");
                        return 0;
                    }
                default: return 0;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculadora calc = new Calculadora();
            calc.setVisible(true);
        });
    }
}
