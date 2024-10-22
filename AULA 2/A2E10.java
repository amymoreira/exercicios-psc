import javax.swing.JOptionPane;
public class A2E10
/*Entrar com um número e informar se ele é ou não divisível por 5.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      
    
      //testar a condicao e informar o resultado
      if (numero1 % 5 == 0)
         {
         JOptionPane.showMessageDialog(null, "O " + numero1 + " é divisível de 5.");
         }
      else
         {
         JOptionPane.showMessageDialog(null, "O " + numero1 + " não é divisível de 5.");
         }
   }
}