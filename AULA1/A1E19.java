import javax.swing.JOptionPane;
public class A1E19
/*Escrever um algoritmo que leia três números reais (a, b e c), calcule e escreva o
resultado da expressão x = 2 * ( ( a – c ) / 8 ) – b * 5.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String valorA = JOptionPane.showInputDialog("Insira o valor a:");
      String valorB = JOptionPane.showInputDialog("Insira o valor b:");
      String valorC = JOptionPane.showInputDialog("Insira o valor c:");
      
      //Converter para real
      double a = Double.parseDouble(valorA);
      double b = Double.parseDouble(valorB);
      double c = Double.parseDouble(valorC);

      //Calculando a fórmula
      double resultado = 2 * ( ( a - c ) / 8 ) - b * 5;
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
   }
}