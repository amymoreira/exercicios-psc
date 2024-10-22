import javax.swing.JOptionPane;
public class A2E5
/*Construir um algoritmo que indique se o número digitado está compreendido
entre 20 e 90 ou não.*/
{
   public static void main(String[] args)
   {
      //Adicionar o número
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      Double numero1 = Double.parseDouble(num1);

      //testar a condicao e informar o resultado
      if (numero1 > 20 && numero1 < 90)
         {
         JOptionPane.showMessageDialog(null, "O número: " +  numero1 + " está entre 20 e 90.");
         }

   }
}