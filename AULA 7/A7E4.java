/*Exercício 4: No material da “Aula 07 – Relacionamento entre Classes”, no tópico “Alta
Coesão”, nas páginas 23 e 24, implemente a classe para testes das classes listadas
nessas páginas.*/

import javax.swing.JOptionPane;
class Pessoa
{
   private String nome;
   private int idade;
   private String endereco;
   private String telefone;
   
   //Construtor
   public Pessoa(String nome, int idade, String endereco, String telefone)
   {
      this.nome = nome;
      this.idade = idade;
      this.endereco = endereco;
      this.telefone = telefone;
   }
   
   //Métodos getters
   public String getNome()
   {
      return nome;
   }
   
   public int getIdade()
   {
      return idade;
   }
   
   public String getEndereco()
   {
      return endereco;
   }
   
   public String getTelefone()
   {
      return telefone;
   }
   
   //Métodos setters
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   
   public void setIdade(int idade)
   {
      this.idade = idade;
   }
   
   public void setEndereco(String endereco)
   {
      this.endereco = endereco;
   }
   
   public void setTelefone(String telefone)
   {
      this.telefone = telefone;
   }
   
   //Outros métodos relacionados apenas a operações com Pessoa
   public boolean isMaiorDeIdade()
   {
      return idade >= 18;
   }
   
   public boolean temTelefone()
   {
      return telefone != null && !telefone.isEmpty();
   }
}

public class A7E4
{
   public static void main(String[] args) 
   {
      String nome = JOptionPane.showInputDialog("Seu nome:");
      int idade = Integer.parseInt(JOptionPane.showInputDialog("Sua idade"));
      String endereco = JOptionPane.showInputDialog("Seu endereço:");
      String telefone = JOptionPane.showInputDialog("Seu telefone:");
      
      Pessoa pessoa = new Pessoa(nome, idade, endereco, telefone);
   
      JOptionPane.showMessageDialog(null, "Seus dados:\n Nome: "
      + nome + "\nIdade: " + idade + "\nEndereço: " + endereco + "\nTelefone: " + telefone);
   }
}