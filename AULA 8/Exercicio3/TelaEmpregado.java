package Exercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TelaEmpregado extends JFrame {
    private ArrayList<Empregado> empregados; // Lista para armazenar empregados
    private JTextArea displayArea; // Área de exibição para mostrar informações dos empregados

    public TelaEmpregado() {
        empregados = new ArrayList<>();

        // Configura a janela
        setTitle("Cadastro de Empregados");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Área de exibição para listar empregados
        displayArea = new JTextArea(15, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // Botão para adicionar Mensalista
        JButton btnAddMensalista = new JButton("Adicionar Mensalista");
        btnAddMensalista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Nome do Mensalista:");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Mensalista:"));
                Mensalista mensalista = new Mensalista(nome, salario);
                empregados.add(mensalista);
                atualizarDisplay();
            }
        });
        add(btnAddMensalista);

        // Botão para adicionar Comissionado
        JButton btnAddComissionado = new JButton("Adicionar Comissionado");
        btnAddComissionado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Nome do Comissionado:");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário base do Comissionado:"));
                double comissao = Double.parseDouble(JOptionPane.showInputDialog("Comissão do Comissionado:"));
                Comissionado comissionado = new Comissionado(nome, salario, comissao);
                empregados.add(comissionado);
                atualizarDisplay();
            }
        });
        add(btnAddComissionado);

        // Botão para adicionar Horista
        JButton btnAddHorista = new JButton("Adicionar Horista");
        btnAddHorista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Nome do Horista:");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Horista:"));
                Horista horista = new Horista(nome, salario);
                empregados.add(horista);
                atualizarDisplay();
            }
        });
        add(btnAddHorista);

        // Botão para adicionar Tarefeiro
        JButton btnAddTarefeiro = new JButton("Adicionar Tarefeiro");
        btnAddTarefeiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = JOptionPane.showInputDialog("Nome do Tarefeiro:");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário do Tarefeiro:"));
                Tarefeiro tarefeiro = new Tarefeiro(nome, salario);
                empregados.add(tarefeiro);
                atualizarDisplay();
            }
        });
        add(btnAddTarefeiro);
    }

    // Atualiza a área de exibição com as informações dos empregados
    private void atualizarDisplay() {
        displayArea.setText("");
        for (Empregado emp : empregados) {
            displayArea.append("Nome: " + emp.getNome() + ", Salário: " + emp.salario() + "\n");
        }
    }

    public static void main(String[] args) {
        // Cria e exibe a tela
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaEmpregado().setVisible(true);
            }
        });
    }
}
