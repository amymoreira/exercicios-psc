private class Professor
/*1.A. Crie a classe Professor com seu construtor, métodos de acesso e modificadores e
os atributos privados nome, do tipo String, idade, do tipo int. Crie o método getDados
que retorna o valor dos atributos.*/ 
{
   //atributos
   private String nome;
   private int idade;
   
   //construtor
   public Professor(String nome, int idade) 
   {
      this.nome = nome;
      this.idade = idade;
   }

   //metodos de acesso
   public String getNome() 
   {
      return nome;
   }
   
   public int getIdade() 
   {
      return idade;
   }

   //metodos modificadores
   public void setNome(String nome) 
   {
      this.nome = nome;
   }
   
   public void setIdade(int idade) 
   {
      this.idade = idade;
   }

   //metodo getDados
   public String getDados() 
   {
      return "Professor [nome=" + nome + ", idade=" + idade + ", professor=" + professor.getDados() + "]";
   }
}

private class Disciplina
/*1.B. Crie a classe Disciplina com seu construtor, métodos de acesso e modificadores e
os atributos privados nome, do tipo String, pratica, do tipo boolean. Crie o método
getDados que retorna o valor dos atributos.*/ 
{
   //atributos
   private String nome;
   private boolean pratica;
   
   //construtor
   public Disciplina(String nome, boolean pratica) 
   {
      this.nome = nome;
      this.pratica = false;
   }

   //metodos de acesso
   public String getNome() 
   {
      return nome;
   }
   
   public boolean getPratica() 
   {
      return pratica;
   }

   //metodos modificadores
   public void setNome(String nome) 
   {
      this.nome = nome;
   }
   
   public void setPratica(boolean pratica) 
   {
      this.pratica = formando;
   }

   //metodo getDados
   public String getDados() 
   {
      return "Disciplina [nome=" + nome + ", pratica=" + pratica + ", disciplina=" + professor.getDados() + "]";
   }
}

private class Atribuicao
/*1.C. Crie a classe Atribuicao com seu construtor, métodos de acesso e modificadores e
os atributos privados professor, do tipo Professor, e disciplina, do tipo Disciplina. Crie
o método getDados que retorna o valor dos atributos.*/ 
{
   //atributos
   private Professor professor;
   private Disciplina disciplina;
   
   //construtor
   public Atribuicao(Professor professor, Disciplina disciplina) 
   {
      this.professor = professor;
      this.disciplina = disciplina;
   }

   //metodo getDados
   public String getDados() 
   {
      return "Professor [nome=" + nome + ", idade=" + idade + ", professor=" + professor.getDados() + "]";
      return "Disciplina [nome=" + nome + ", pratica=" + pratica + ", disciplina=" + professor.getDados() + "]";
   }
}

/*1.D. Crie a classe TesteAtribuicao com o método main que instancia um Professor, uma
Disciplina e uma Atribuicao. Imprima dos dados da Atribuicao.*/

public class TesteAtribuicao
{
    public static void main(String[] args) 
    {
        // Instanciando um Professor
        Professor professor = new Professor("João", 35);

        // Instanciando uma Disciplina
        Disciplina disciplina = new Disciplina("Matemática", true);

        // Instanciando uma Atribuicao
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        // Imprimindo os dados da Atribuicao
        System.out.println(atribuicao.getDados());
    }
}
