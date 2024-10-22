import javax.swing.JOptionPane;
/*3- Crie a classe Produto com seu construtor, métodos de acesso e modificadores e os
atributos privados nome, do tipo String, preço, do tipo double, quantidade, do tipo
int. Crie uma classe TesteProduto com um método main, onde você vai ler valores de
um produto, instanciar um produto e exibir o produto criado.*/

class Produto 
{
   // atributos
   private String nome;
   private double preco;
   private int quantidade;
   
   // método construtor
   public Produto(String n, double p, int q) 
   {
      nome = n;
      preco = p;
      quantidade = q;
   }
   
   // métodos de acesso
   public String getNome() 
   {
      return nome;
   }

   public double getPreco() 
   {
      return preco;
   }

   public int getQuantidade() 
   {
      return quantidade;
   }
      
   // métodos modificadores
   public void setNome(String n) 
   {
      nome = n;
   }

   public void setPreco(double p) 
   {
      preco = p;
   }

   public void setQuantidade(int q) 
   {
      quantidade = q;
   }
}

public class TesteProduto
{
   public static void main(String[] args) 
      {
      // coletando os dados do produto
      String nome = JOptionPane.showInputDialog("Nome do produto");
      double preco = Double.parseDouble(JOptionPane.showInputDialog("Insire o preco"));
      int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade"));

      // cria o objeto
      Produto produto = new Produto(nome, preco, quantidade);

      // monta a String de mensagem
      String msg = "Dados do produto\nNome: " + produto.getNome() + "\nPreço: "
      + produto.getPreco() + "\nQuantidade: " + produto.getQuantidade();
      
      // mostra a mensagem
      JOptionPane.showMessageDialog(null, msg);
   }
}