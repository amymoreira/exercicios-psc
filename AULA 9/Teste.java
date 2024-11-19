import java.util.ArrayList;
import javax.swing.JOptionPane;

/*Você vai gerenciar um depósito e resolveu criar um sistema para isso. Para isso
criou uma classe chamada Caixa, com os atributos corredor (String), posicao(int),
peso(double) e dono(String), que armazena o nome do dono da caixa. Respeitou o
encapsulamento e criou os métodos de acesso e os modificadores.*/

class Caixa 
{
    private String corredor;
    private int posicao;
    private double peso;
    private String dono;

    public Caixa(String corredor, int posicao, double peso, String dono) 
    {
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
        this.dono = dono;
    }

    public String getCorredor() 
    { 
      return corredor; 
    }
    
    public int getPosicao() 
    {
      return posicao; 
    }
    
    public double getPeso() 
    { 
      return peso; 
    }
   
    public String getDono() 
    { 
      return dono; 
    }

    public void setLocalizacao(String corredor, int posicao) 
    {
        this.corredor = corredor;
        this.posicao = posicao;
    }
}

/*Depois criou a classe Deposito, que contém um ArrayList de caixas. Fez um
método para adicionar caixas e um para remover (pelo dono). Fez um método que
encontra uma caixa pelo dono, retornando sua posição no arraylist (ou -1 se não
achar). E um método para mudar o corredor e a posição de uma caixa, que encontra
a caixa pelo dono e altera seu atributos. Ele fez também um método que retorna um
vetor com a(s) caixa(s) que pesam mais do que um valor passado por parâmetro.*/

class Deposito 
{
    private ArrayList<Caixa> caixas = new ArrayList<>();

    public void adicionarCaixa(Caixa caixa) 
    { 
      caixas.add(caixa); 
    }
    
    public boolean removerCaixa(String dono) 
    {
        return caixas.removeIf(caixa -> caixa.getDono().equalsIgnoreCase(dono));
    }

    public Caixa encontrarCaixa(String dono) 
    {
        return caixas.stream().filter(caixa -> caixa.getDono().equalsIgnoreCase(dono)).findFirst().orElse(null);
    }

    public boolean alterarLocalizacao(String dono, String corredor, int posicao) 
    {
        Caixa caixa = encontrarCaixa(dono);
        if (caixa != null) 
        {
            caixa.setLocalizacao(corredor, posicao);
            return true;
        }
        return false;
    }

    public ArrayList<Caixa> caixasMaisPesadasQue(double peso) 
    {
        ArrayList<Caixa> caixasPesadas = new ArrayList<>();
        for (Caixa caixa : caixas) 
        {
            if (caixa.getPeso() > peso) caixasPesadas.add(caixa);
        }
        return caixasPesadas;
    }
}

/*Para testar seu sistema fez uma classe Teste com o método main que, usando o
JOptionPane, possui um loop com as opções 1. adiciona caixa, 2. remove caixa, 3.
procura caixa, 4. muda caixa, 5. lista mais pesadas que 10.0 e 6. sair.*/

public class Teste 
{
    public static void main(String[] args) 
    {
        Deposito deposito = new Deposito();
        String menu = "1. Adicionar caixa\n2. Remover caixa\n3. Procurar caixa\n4. Alterar caixa\n5. Listar caixas com peso > 10.0\n6. Sair";

        while (true) 
        {
            String opcao = JOptionPane.showInputDialog(menu);
            if (opcao == null || opcao.equals("6")) break;

            String dono, corredor; int posicao; double peso;
            switch (opcao) 
            {
                case "1":
                    corredor = JOptionPane.showInputDialog("Corredor:");
                    posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição:"));
                    peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:"));
                    dono = JOptionPane.showInputDialog("Dono:");
                    deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
                    JOptionPane.showMessageDialog(null, "Caixa adicionada!");
                    break;

                case "2":
                    dono = JOptionPane.showInputDialog("Dono da caixa a remover:");
                    JOptionPane.showMessageDialog(null, deposito.removerCaixa(dono) ? "Caixa removida!" : "Caixa não encontrada.");
                    break;

                case "3":
                    dono = JOptionPane.showInputDialog("Dono da caixa a procurar:");
                    Caixa caixa = deposito.encontrarCaixa(dono);
                    JOptionPane.showMessageDialog(null, caixa != null ? "Caixa encontrada: " + caixa.getCorredor() + " - " + caixa.getPosicao() : "Caixa não encontrada.");
                    break;

                case "4":
                    dono = JOptionPane.showInputDialog("Dono da caixa a alterar:");
                    corredor = JOptionPane.showInputDialog("Novo corredor:");
                    posicao = Integer.parseInt(JOptionPane.showInputDialog("Nova posição:"));
                    JOptionPane.showMessageDialog(null, deposito.alterarLocalizacao(dono, corredor, posicao) ? "Localização alterada!" : "Caixa não encontrada.");
                    break;

                case "5":
                    StringBuilder sb = new StringBuilder("Caixas com peso > 10.0:\n");
                    for (Caixa c : deposito.caixasMaisPesadasQue(10.0)) 
                    {
                        sb.append("Dono: ").append(c.getDono()).append(", Peso: ").append(c.getPeso()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
