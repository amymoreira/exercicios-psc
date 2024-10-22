import javax.swing.JOptionPane;
public class A2E6
/*Entrar com um número e imprimir uma das mensagens: maior do que 20, igual a
20 ou menor do que 20.*/
{
   public static void main(String[] args)
   {
      //Adicionando o valor
      String num = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      Double numero = Double.parseDouble(num);

      //testar a condicao e informar o resultado
      if (numero > 20)
         {
         JOptionPane.showMessageDialog(null, "O valor " +  numero + " é maior que 20.");
         }
      else if (numero < 20)
         {
         JOptionPane.showMessageDialog(null, "O valor " +  numero + " é menor que 20.");
         }
      else
         {
         JOptionPane.showMessageDialog(null, "O valor " +  numero + " é igual a 20.");
         }
   }
}