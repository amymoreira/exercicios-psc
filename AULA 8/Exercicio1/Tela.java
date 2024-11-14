/*Crie uma tela com um campo texto com a etiqueta Texto, um botão Mostrar, um
botão Limpar e um botão Sair. O botão Mostrar, ao ser clicado, mostra o conteúdo
do campo Texto em um JOptionPane. O botão Limpar limpa o campo Texto e o botão
Sair sai do programa.*/

package Exercicio1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener 
{
    private JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public Tela() 
    {
        super("Exercício 1");

        //Configurando o campo de texto e o painel de entrada
        JLabel lblTexto = new JLabel("Texto:");
        txtTexto = new JTextField(20);

        JPanel painelEntrada = new JPanel(new FlowLayout());
        painelEntrada.add(lblTexto);
        painelEntrada.add(txtTexto);

        //Configurando os botões e o painel de botões
        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        JPanel painelBotoes = new JPanel(new FlowLayout());
        painelBotoes.add(btnMostrar);
        painelBotoes.add(btnLimpar);
        painelBotoes.add(btnSair);

        //Adicionando os painéis ao container principal
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(painelEntrada, BorderLayout.CENTER);
        container.add(painelBotoes, BorderLayout.SOUTH);

        //Configurando os listeners para os botões
        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        //Configurações da janela
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btnMostrar) 
        {
            String texto = txtTexto.getText();
            JOptionPane.showMessageDialog(this, texto, "Texto Inserido", JOptionPane.INFORMATION_MESSAGE);
        } 
        
        else if (e.getSource() == btnLimpar) 
        {
            txtTexto.setText("");
        } 
        
        else if (e.getSource() == btnSair) 
        {
            System.exit(0);
        }
    }

    //Método principal para iniciar o programa
    public static void main(String[] args) 
    {
        new Tela();  // Cria e exibe a tela
    }
}
