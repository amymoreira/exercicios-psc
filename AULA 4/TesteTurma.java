import javax.swing.JOptionPane;
/*1- Crie a classe Turma com seu construtor, métodos de acesso e modificadores e os
atributos privados nome, do tipo String, curso, do tipo String, quantidadeDeAlunos,
do tipo int, serie, do tipo int.*/

class Turma 
{
   // atributos
   private String nome;
   private String curso;
   private int quantidadeDeAlunos;
   private int serie;
   
   // método construtor
   public Turma(String n, String c, int q, int s) 
   {
      nome = n;
      curso = c;
      quantidadeDeAlunos = q;
      serie = s;
   }
   
   // métodos de acesso
   public String getNome() 
   {
      return nome;
   }

   public String getCurso() 
   {
      return curso;
   }

   public int getQuantidade() 
   {
      return quantidadeDeAlunos;
   }

   public int getSerie() 
   {
      return serie;
   }
      
   // métodos modificadores
   public void setNome(String n) 
   {
      nome = n;
   }

   public void setCurso(String c) 
   {
      curso = c;
   }

   public void setQuantidade(int q) 
   {
      quantidadeDeAlunos = q;
   }

   public void setSerie(int s) 
   {
      serie = s;
   }
}

/*2- Crie a classe TesteTurma com o método main. De modo análogo ao exemplo, peça
para o usuário entrar com os valores necessários para criar uma turma, instancie um
objeto Turma e depois exiba os dados da turma criada. Depois, peça para o usuário
uma nova quantidade de alunos, altere o valor do atributo e exiba os dados
novamente.*/

public class TesteTurma
{
   // cadastrar uma nova turma no metodo main
   public static void main(String[] args) 
      {
      // coletando os dados do aluno a ser cadastrado na turma
      String nome = JOptionPane.showInputDialog("Nome do aluno");
      String curso = JOptionPane.showInputDialog("Nome do curso");
      int serie = Integer.parseInt(JOptionPane.showInputDialog("Série/ano atual"));
      int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));

      // cria um objeto turma
      Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

      // monta a String de saida chamando os metodos de acesso da turma
      String msg = "Dados da turma\nNome: " + turma.getNome() + "\nCurso: "
      + turma.getCurso() + "\nSerie: " + turma.getSerie();
      
      // mostra a turma
      JOptionPane.showMessageDialog(null, msg);

      // pede nova informação
      quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
      turma.setQuantidade(quantidadeDeAlunos);
      // mostra novamente o cadastro da turma

      // monta a String de saida chamando os metodos de acesso da turma
      msg = "Dados da turma\nNome: " + turma.getNome() + "\nCurso: "
      + turma.getCurso() + "\nSerie: " + turma.getSerie() + "\nQuantidade de alunos:"
      + turma.getQuantidade();

      // mostra a turma
      JOptionPane.showMessageDialog(null, msg);
   }
}