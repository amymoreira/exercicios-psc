import javax.swing.JOptionPane;
public class A2E4
/*Ler três números e escrevê-los em ordem crescente (suponha números
diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");
      String num3 = JOptionPane.showInputDialog("Digite o terceiro número:  ");

      //converter para real
      Double numero1 = Double.parseDouble(num1);
      Double numero2 = Double.parseDouble(num2);
      Double numero3 = Double.parseDouble(num3);

      //testar a condicao e informar o resultado
      if (numero1 > numero2 && numero2 > numero3)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero3 + ", " + numero2 + ", " + numero1);
         }
         
         else if (numero1 > numero3 && numero2 > numero1)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero3 + ", " + numero1 + ", " + numero2);
         }
         
         else if (numero1 < numero2 && numero2 < numero3)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero1 + ", " + numero2 + ", " + numero3);
         }
         
         else if (numero3 > numero1 && numero2 > numero3)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero1 + ", " + numero3 + ", " + numero2);
         }
         
         else if (numero1 > numero3 && numero2 > numero1)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero2 + ", " + numero1 + ", " + numero3);
         }
         
         else if (numero2 > numero3 && numero3 > numero1)
         {
         JOptionPane.showMessageDialog(null, "Números em ordem crescente: " + numero2 + ", " + numero3 + ", " + numero1);
         }
         
         

   }
}