import javax.swing.JOptionPane;
/*4- Crie a classe Disciplina com seu construtor, métodos de acesso e modificadores e
os atributos privados nome, do tipo String, professor, do tipo String, semestre, do
tipo int, ofertada, do tipo boolean. Crie a classe TesteDisciplina com o método main,
leia dos dados necessários para criar uma disciplina, crie uma disciplina e exiba a
disciplina criada.*/

class Disciplina 
{
   // atributos
   private String nome;
   private String professor;
   private int semestre;
   private boolean ofertada;
   
   // método construtor
   public Disciplina(String n, String p, int s) 
   {
      nome = n;
      professor = p;
      semestre = s;
   }
   
   // métodos de acesso
   public String getNome() 
   {
      return nome;
   }

   public String getProfessor() 
   {
      return professor;
   }

   public int getSemestre() 
   {
      return semestre;
   }
      
   // métodos modificadores
   public void setNome(String n) 
   {
      nome = n;
   }

   public void setProfessor(String p) 
   {
      professor = p;
   }

   public void setSemestre(int s) 
   {
      semestre = s;
   }
}

public class TesteDisciplina
{
   public static void main(String[] args) 
      {
      // coletando os dados da disciplina
      String nome = JOptionPane.showInputDialog("Nome da disciplina");
      String professor = JOptionPane.showInputDialog("Nome do professor");
      int semestre = Integer.parseInt(JOptionPane.showInputDialog("Insira o semestre"));

      // cria o objeto
      Disciplina disciplina = new Disciplina(nome, professor, semestre);

      // monta a String de mensagem
      String msg = "Dados do semestre\nNome: " + disciplina.getNome() + "\nProfessor: "
      + disciplina.getProfessor() + "\nSemestre: " + disciplina.getSemestre();
      
      // tem que digitar true ou false
      boolean ofertada = Boolean.parseBoolean(JOptionPane.
      showInputDialog("Está sendo ofertada? true/false"));
      
      if (ofertada == true) 
      {
         msg += "\nOfertada: sim";
      } 
      
      else 
      {
         msg += "\nOfertada: nao";
      }
      
      // mostra a mensagem
      JOptionPane.showMessageDialog(null, msg);
   }
}