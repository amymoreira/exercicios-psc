import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

class Consulta {
    private String paciente;
    private String cpf;
    private String tipoConsulta;
    private String data;

    public Consulta(String paciente, String cpf, String tipoConsulta, String data) {
        this.paciente = paciente;
        this.cpf = cpf;
        this.tipoConsulta = tipoConsulta;
        this.data = data;
    }

    public String getPaciente() {
        return paciente;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public String getData() {
        return data;
    }
}

class OdontologiaApp {
    private final String DB_URL = "jdbc:mysql://localhost:3306/projetoa3";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "anima123"; // Altere conforme necessário
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String ERROBD = "Erro na conexão com o Banco de Dados: ";
    private JFrame frame;{

    try {
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        System.out.println("Conexão estabelecida!");
        // ... demais operações com o banco de dados
    } catch (SQLException e) {
        System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public OdontologiaApp() {
        frame = new JFrame("Sistema de Consultas Odontológicas");
        frame.setSize(1200, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(34, 239, 206));

        int buttonWidth = 400;
        int buttonHeight = 50;
        int centerX = (frame.getWidth() - buttonWidth) / 2;
        int startY = (frame.getHeight() - (4 * buttonHeight + 30)) / 2;

        JButton btnRegistrar = createButton("Registrar Consulta", centerX, startY, buttonWidth, buttonHeight);
        JButton btnConsultar = createButton("Consultar Consulta", centerX, startY + 60, buttonWidth, buttonHeight);
        JButton btnListar = createButton("Listar Consultas", centerX, startY + 120, buttonWidth, buttonHeight);
        JButton btnSair = createButton("Sair", centerX, startY + 180, buttonWidth, buttonHeight);

        btnRegistrar.addActionListener(e -> abrirTelaRegistrar());
        btnConsultar.addActionListener(e -> abrirTelaConsultar());
        btnListar.addActionListener(e -> abrirTelaListar());
        btnSair.addActionListener(e -> System.exit(0));

        frame.add(btnRegistrar);
        frame.add(btnConsultar);
        frame.add(btnListar);
        frame.add(btnSair);

        frame.setVisible(true);
    }

    private JButton createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        return button;
    }

    private void abrirTelaRegistrar() {
        JFrame registrarFrame = new JFrame("Registrar Consulta");
        registrarFrame.setSize(600, 400);
        registrarFrame.setLayout(null);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(20, 20, 100, 30);
        JTextField txtPaciente = new JTextField();
        txtPaciente.setBounds(120, 20, 400, 30);

        JLabel lblCpf = new JLabel("CPF:");
        lblCpf.setBounds(20, 70, 100, 30);
        JTextField txtCpf = new JTextField();
        txtCpf.setBounds(120, 70, 400, 30);

        JLabel lblTipoConsulta = new JLabel("Tipo:");
        lblTipoConsulta.setBounds(20, 120, 100, 30);
        JComboBox<String> cbTipoConsulta = new JComboBox<>(new String[]{"Exame", "Manutenção"});
        cbTipoConsulta.setBounds(120, 120, 400, 30);

        JLabel lblData = new JLabel("Data:");
        lblData.setBounds(20, 170, 100, 30);
        JTextField txtData = new JTextField();
        txtData.setBounds(120, 170, 400, 30);

        JLabel lblMensagem = new JLabel("");
        lblMensagem.setBounds(120, 230, 400, 30);
        lblMensagem.setForeground(Color.RED);

        JButton btnSalvar = createButton("Salvar", 250, 280, 100, 30);
        btnSalvar.addActionListener(e -> {
            String paciente = txtPaciente.getText();
            String cpf = txtCpf.getText();
            String tipo = (String) cbTipoConsulta.getSelectedItem();
            String data = txtData.getText();

            if (paciente.isEmpty() || cpf.isEmpty() || data.isEmpty()) {
                lblMensagem.setText("Preencha todos os campos!");
                return;
            }

            if (!isCpfValido(cpf)) {
                lblMensagem.setText("CPF inválido!");
                return;
            }

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String sql = "INSERT INTO registrar_consulta (paciente, cpf, tipo, data) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, paciente);
                stmt.setString(2, cpf);
                stmt.setString(3, tipo);
                stmt.setString(4, data);

                stmt.executeUpdate();
                lblMensagem.setForeground(new Color(0, 128, 0));
                lblMensagem.setText("Consulta registrada com sucesso!");
                txtPaciente.setText("");
                txtCpf.setText("");
                txtData.setText("");
            } catch (SQLException ex) {
                lblMensagem.setText("Erro ao salvar no banco de dados!");
                ex.printStackTrace();
            }
        });

        registrarFrame.add(lblPaciente);
        registrarFrame.add(txtPaciente);
        registrarFrame.add(lblCpf);
        registrarFrame.add(txtCpf);
        registrarFrame.add(lblTipoConsulta);
        registrarFrame.add(cbTipoConsulta);
        registrarFrame.add(lblData);
        registrarFrame.add(txtData);
        registrarFrame.add(btnSalvar);
        registrarFrame.add(lblMensagem);

        registrarFrame.setVisible(true);
    }

    private void abrirTelaConsultar() {
        JFrame consultarFrame = new JFrame("Consultar Consulta");
        consultarFrame.setSize(600, 400);
        consultarFrame.setLayout(null);

        JLabel lblPaciente = new JLabel("Paciente:");
        lblPaciente.setBounds(20, 20, 100, 30);
        JTextField txtPaciente = new JTextField();
        txtPaciente.setBounds(120, 20, 400, 30);

        JLabel lblResultado = new JLabel("");
        lblResultado.setBounds(20, 120, 500, 100);
        lblResultado.setVerticalAlignment(SwingConstants.TOP);

        JButton btnBuscar = createButton("Buscar", 250, 80, 100, 30);
        btnBuscar.addActionListener(e -> {
            String paciente = txtPaciente.getText();

            if (paciente.isEmpty()) {
                lblResultado.setText("Preencha o nome do paciente!");
                return;
            }

            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
                String sql = "SELECT * FROM registrar_consulta WHERE paciente = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, paciente);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()) {
                    lblResultado.setText("<html>Paciente: " + rs.getString("paciente") +
                            "<br>CPF: " + rs.getString("cpf") +
                            "<br>Tipo: " + rs.getString("tipo") +
                            "<br>Data: " + rs.getDate("data") + "</html>");
                } else {
                    lblResultado.setText("Consulta não encontrada.");
                }
            } catch (SQLException ex) {
                lblResultado.setText("Erro ao buscar no banco de dados.");
                ex.printStackTrace();
            }
        });

        consultarFrame.add(lblPaciente);
        consultarFrame.add(txtPaciente);
        consultarFrame.add(btnBuscar);
        consultarFrame.add(lblResultado);

        consultarFrame.setVisible(true);
    }

    private void abrirTelaListar() {
        JFrame listarFrame = new JFrame("Listar Consultas");
        listarFrame.setSize(600, 600);
        listarFrame.setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM registrar_consulta";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                textArea.append("Paciente: " + rs.getString("paciente") +
                        " - CPF: " + rs.getString("cpf") +
                        " - Tipo: " + rs.getString("tipo") +
                        " - Data: " + rs.getDate("data") + "\n");
            }
        } catch (SQLException ex) {
            textArea.setText("Erro ao buscar no banco de dados.");
            ex.printStackTrace();
        }

        listarFrame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        listarFrame.setVisible(true);
    }

    private boolean isCpfValido(String cpf) {
        // Verifica se é composto por exatamente 11 dígitos numéricos
        return Pattern.matches("\\d{11}", cpf);
    }
}

public class ConsultaOdonto {
    public static void main(String[] args) {
        new OdontologiaApp();
    }
}
