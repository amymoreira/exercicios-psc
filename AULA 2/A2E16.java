import javax.swing.JOptionPane;
public class A2E16
/*Crie um algoritmo que leia dois números e imprimir uma mensagem dizendo se
são iguais ou diferentes.*/
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
      if (numero1 == numero2)
         {
         JOptionPane.showMessageDialog(null, "Os dois números são iguais.");
         }
      else 
         {
         JOptionPane.showMessageDialog(null, "Os dois números são diferentes.");
         }
    }
}