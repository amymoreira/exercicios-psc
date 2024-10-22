import javax.swing.JOptionPane;
public class A2E17
/*Entrar com dois números e imprimir o menor número (suponha números
diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2);

      //testar a condicao e informar o resultado
      if (numero1 < numero2)
         {
         JOptionPane.showMessageDialog(null, "O menor número é: " + numero1);
         }
      else
         {
         JOptionPane.showMessageDialog(null, "O menor número é: " + numero2);
         }
   }
}