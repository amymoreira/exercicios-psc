import javax.swing.JOptionPane;
public class A2E15
/*Entrar com o ano de nascimento de uma pessoa e o ano atual. Imprimir a idade
da pessoa. Não se esqueça de verificar se o ano de nascimento é um ano válido.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String anoNasc = JOptionPane.showInputDialog("Digite o ano do seu nascimento:  ");

      //converter para real
      int nascimento = Integer.parseInt(anoNasc);
      int anoAtual = 2024;
    
      //testar a condicao e informar o resultado
      if (nascimento > 2024 || nascimento < 0)
         {
         JOptionPane.showMessageDialog(null, "O ano de nascimento informado não é um ano válido.");
         }
      else 
         {
         int idade = anoAtual - nascimento;
         JOptionPane.showMessageDialog(null, "A sua idade é: " + idade + " anos.");
         }
    }
}