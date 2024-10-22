import javax.swing.JOptionPane;
public class A2E13
/*Ler um número inteiro de 3 casas decimais e imprimir se o algarismo da casa das
dezenas é par ou ímpar.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int dezena = (numero1 / 10) % 10;
      
    
      //testar a condicao e informar o resultado
      if (dezena % 2 == 0)
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " tem como dezena o número: " + dezena + ", que por sua vez, é um número par.");
         }
         else 
         {
         JOptionPane.showMessageDialog(null, "O número " + numero1 + " tem como dezena o número: " + dezena + ", que por sua vez, é um número ímpar.");
         }
    }
}