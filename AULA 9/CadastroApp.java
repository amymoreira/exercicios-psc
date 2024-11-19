import java.util.ArrayList;
import javax.swing.JOptionPane;

class Cliente 
{
    private int id;
    private String nome;
    private String fone;

    public Cliente(int id, String nome, String fone) 
    {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
    }

    public int getId() 
    { 
      return id; 
    }
    
    public String getNome() 
    { 
      return nome;
    }
    
    public String getFone() 
    { 
      return fone;
    }

    public void setNome(String nome) 
    { 
      this.nome = nome;
    }
    
    public void setFone(String fone) 
    { 
      this.fone = fone;
    }

    public String toString() 
    {
        return "ID: " + id + ", Nome: " + nome + ", Fone: " + fone;
    }
}

class BancoDeClientes 
{
    private ArrayList<Cliente> clientes = new ArrayList<>();

    public void inserirCliente(Cliente cliente) 
    {
        clientes.add(cliente);
    }

    public boolean removerCliente(int id) 
    {
        return clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public boolean alterarCliente(int id, String novoNome, String novoFone) 
    {
        for (Cliente cliente : clientes) 
        {
            if (cliente.getId() == id) 
            {
                cliente.setNome(novoNome);
                cliente.setFone(novoFone);
                return true;
            }
        }
        return false;
    }

    public Cliente listarCliente(int id) 
    {
        for (Cliente cliente : clientes) 
        {
            if (cliente.getId() == id) 
            {
                return cliente;
            }
        }
        return null;
    }

    public ArrayList<Cliente> listarTodosClientes() 
    {
        return clientes;
    }
}

public class CadastroApp 
{
    public static void main(String[] args) 
    {
        BancoDeClientes banco = new BancoDeClientes();
        String menu = "1. Inserir cliente\n2. Remover cliente\n3. Alterar cliente\n4. Listar dados de um cliente\n5. Listar todos os clientes\n6. Sair";

        while (true) 
        {
            String opcao = JOptionPane.showInputDialog(menu);
            if (opcao == null || opcao.equals("6")) break;

            int id; String nome, fone;
            switch (opcao) 
            {
                case "1":
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente:"));
                    nome = JOptionPane.showInputDialog("Nome do cliente:");
                    fone = JOptionPane.showInputDialog("Telefone do cliente:");
                    banco.inserirCliente(new Cliente(id, nome, fone));
                    JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");
                    break;

                case "2":
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente a remover:"));
                    JOptionPane.showMessageDialog(null, banco.removerCliente(id) ? "Cliente removido!" : "Cliente não encontrado.");
                    break;

                case "3":
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente a alterar:"));
                    nome = JOptionPane.showInputDialog("Novo nome do cliente:");
                    fone = JOptionPane.showInputDialog("Novo telefone do cliente:");
                    JOptionPane.showMessageDialog(null, banco.alterarCliente(id, nome, fone) ? "Cliente alterado!" : "Cliente não encontrado.");
                    break;

                case "4":
                    id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente a listar:"));
                    Cliente cliente = banco.listarCliente(id);
                    JOptionPane.showMessageDialog(null, cliente != null ? cliente.toString() : "Cliente não encontrado.");
                    break;

                case "5":
                    StringBuilder sb = new StringBuilder("Todos os clientes:\n");
                    for (Cliente c : banco.listarTodosClientes()) 
                    {
                        sb.append(c.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
