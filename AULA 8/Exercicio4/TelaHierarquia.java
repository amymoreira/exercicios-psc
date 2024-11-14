package Exercicio4;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TelaHierarquia extends JFrame {
    private JComboBox<String> tipoPessoaCombo;
    private JTextField nomeField;
    private JTextField sobrenomeField;
    private JTextField cpfField;
    private JTextField salarioField;
    private JTextField comissaoField;
    private JTextField seguroDesempregoField;
    private JTextArea resultadoArea;
    private ArrayList<PessoaFisica> listaPessoas;

    public TelaHierarquia() {
        setTitle("Cadastro de Pessoas");
        setSize(400, 500); // Aumentando a altura da janela para comportar a lista de exibição maior
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(11, 2));

        // Inicialização dos componentes
        listaPessoas = new ArrayList<>();
        tipoPessoaCombo = new JComboBox<>(new String[]{"Desempregado", "Empregado", "Mensalista", "Comissionado", "Horista", "Tarefeiro"});
        nomeField = new JTextField();
        sobrenomeField = new JTextField();
        cpfField = new JTextField();
        salarioField = new JTextField();
        comissaoField = new JTextField();
        seguroDesempregoField = new JTextField();

        // Configuração da área de resultado com barra de rolagem
        resultadoArea = new JTextArea(10, 30);
        resultadoArea.setEditable(false);
        resultadoArea.setLineWrap(true);
        resultadoArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(resultadoArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton cadastrarButton = new JButton("Cadastrar");
        JButton listarButton = new JButton("Listar Cadastrados");

        // Adicionando componentes à tela
        add(new JLabel("Tipo de Pessoa:"));
        add(tipoPessoaCombo);
        add(new JLabel("Nome:"));
        add(nomeField);
        add(new JLabel("Sobrenome:"));
        add(sobrenomeField);
        add(new JLabel("CPF:"));
        add(cpfField);
        add(new JLabel("Salário:"));
        add(salarioField);
        add(new JLabel("Comissão:"));
        add(comissaoField);
        add(new JLabel("Seguro Desemprego:"));
        add(seguroDesempregoField);
        add(cadastrarButton);
        add(listarButton);
        add(scrollPane);  // Adicionando o JScrollPane, que contém a JTextArea

        tipoPessoaCombo.addActionListener(e -> atualizarVisibilidadeCampos());
        cadastrarButton.addActionListener(e -> cadastrarPessoa());
        listarButton.addActionListener(e -> listarPessoas());

        atualizarVisibilidadeCampos();
    }

    private void atualizarVisibilidadeCampos() {
        String tipo = (String) tipoPessoaCombo.getSelectedItem();
        boolean isEmpregado = !tipo.equals("Desempregado");
        salarioField.setEnabled(isEmpregado);
        comissaoField.setEnabled(tipo.equals("Comissionado"));
        seguroDesempregoField.setEnabled(tipo.equals("Desempregado"));
    }

    private void cadastrarPessoa() {
        String tipo = (String) tipoPessoaCombo.getSelectedItem();
        String nome = nomeField.getText();
        String sobrenome = sobrenomeField.getText();
        String cpf = cpfField.getText();

        // Tratamento de exceções ao converter para double
        double salario = 0.0, comissao = 0.0, seguroDesemprego = 0.0;

        try {
            if (!salarioField.getText().isEmpty()) {
                salario = Double.parseDouble(salarioField.getText());
            }
            if (!comissaoField.getText().isEmpty()) {
                comissao = Double.parseDouble(comissaoField.getText());
            }
            if (!seguroDesempregoField.getText().isEmpty()) {
                seguroDesemprego = Double.parseDouble(seguroDesempregoField.getText());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira valores numéricos válidos para salário, comissão ou seguro desemprego.");
            return;
        }

        PessoaFisica pessoa;

        switch (tipo) {
            case "Desempregado":
                pessoa = new Desempregado(nome, sobrenome, cpf, seguroDesemprego);
                break;
            case "Mensalista":
                pessoa = new Mensalista(nome, salario);
                break;
            case "Comissionado":
                pessoa = new Comissionado(nome, salario, comissao);
                break;
            case "Horista":
                pessoa = new Horista(nome, salario);
                break;
            case "Tarefeiro":
                pessoa = new Tarefeiro(nome, salario);
                break;
            case "Empregado":
                pessoa = new Empregado(nome);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Tipo de pessoa inválido.");
                return;
        }

        listaPessoas.add(pessoa);
        resultadoArea.setText("Pessoa cadastrada:\n" + pessoa.getNome());
    }

    private void listarPessoas() {
        StringBuilder resultado = new StringBuilder("Lista de Pessoas Cadastradas:\n\n");

        for (PessoaFisica pessoa : listaPessoas) {
            resultado.append(pessoa.dados()).append("\n"); // Usa dados() para exibir os dados reais
        }

        resultadoArea.setText(resultado.toString());
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TelaHierarquia tela = new TelaHierarquia();
            tela.setVisible(true);
        });
    }
}
