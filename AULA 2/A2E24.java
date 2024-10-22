import javax.swing.JOptionPane;
public class A2E24
/*Ler cinco números e identificar o maior e o menor de todos (NÃO suponha
números diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");
      String num3 = JOptionPane.showInputDialog("Digite o terceiro número:  ");
      String num4 = JOptionPane.showInputDialog("Digite o quarto número:  ");
      String num5 = JOptionPane.showInputDialog("Digite o quinto número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2);
      int numero3 = Integer.parseInt(num3);
      int numero4 = Integer.parseInt(num4);
      int numero5 = Integer.parseInt(num5);
      
      int maior;
      
      //testar a condicao e informar o resultado
      if (numero1 > numero2 && numero1 > numero3 && numero1 > numero4 && numero1 > numero5)
         {
         maior = numero1;
         }
         
      else if (numero2 > numero1 && numero2 > numero3 && numero2 > numero4 && numero2 > numero5)
         {
         maior = numero2;
         }
         
      else if (numero3 > numero1 && numero3 > numero2 && numero3 > numero4 && numero3 > numero5)
         {
         maior = numero3;
         }
         
      else if (numero4 > numero1 && numero4 > numero2 && numero4 > numero3 && numero4 > numero5)
         {
         maior = numero4;
         }
         
      else
         {
         maior = numero5;
         }
         
      //Informado a maior variável
      JOptionPane.showMessageDialog(null, "O maior número informado é: " + maior);
   }
}