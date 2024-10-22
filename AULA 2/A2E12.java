import javax.swing.JOptionPane;
public class A2E12
/*Entrar com um número e informar se ele é divisível por 10, por 5, por 2 ou se não
é divisível por nenhum destes.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      
    
      //testar a condicao e informar o resultado
      if (numero1 % 10 == 0)
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " é divisível de 10.");
         }
      else if (numero1 % 5 == 0)
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " é divisível de 5.");
         }
      else if (numero1 % 2 == 0)
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " é divisível de 2.");
         }
      else
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " não é divisível de 10, nem 5 e nem 2.");
         }
   }
}