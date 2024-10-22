import javax.swing.JOptionPane;
public class A2E11
/*Entrar com um número e informar se ele é divisível por 3 e por 7.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      
    
      //testar a condicao e informar o resultado
      if (numero1 % 3 == 0 && numero1 % 7 == 0)
         {
         JOptionPane.showMessageDialog(null, "O " + numero1 + " é divisível de ambos 3 e 7.");
         }
      else
         {
         JOptionPane.showMessageDialog(null, "O " + numero1 + " não é divisível de ambos 3 e 7.");
         }
   }
}