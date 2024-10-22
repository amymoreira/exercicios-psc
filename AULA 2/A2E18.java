import javax.swing.JOptionPane;
public class A2E18
/*Ler três números e escrevê-los em ordem crescente (suponha números
diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2);
      
      //testar a condicao e informar o resultado
      if (numero1 > numero2)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero2 +  ", " + numero1);
         }
         
         else
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero1 +  ", " + numero2);

         }
         
   }
}