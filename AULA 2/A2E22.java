import javax.swing.JOptionPane;
public class A2E22
/*Ler três números e armazenar o maior número na variável de nome maior
(suponha números diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");
      String num3 = JOptionPane.showInputDialog("Digite o terceiro número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2);
      int numero3 = Integer.parseInt(num3);
      int maior;
      
      //testar a condicao e informar o resultado
      if (numero1 > numero2 && numero1 > numero3)
         {
         maior = numero1;
         }
         
      else if (numero2 > numero1 && numero2 > numero3)
         {
         maior = numero2;
         }
         
      else
         {
         maior = numero3;
         }
         
      //Informado a maior variável
      JOptionPane.showMessageDialog(null, "O maior número informado é: " + maior);
   }
}