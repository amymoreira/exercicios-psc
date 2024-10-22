import javax.swing.JOptionPane;
public class A1E23
/*Criar um algoritmo que calcule e imprime a área de um triângulo.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String sBase = JOptionPane.showInputDialog("Insira o valor da base:");
      String sAltura = JOptionPane.showInputDialog("Insira o valor da altura:");
      
      //Converter para real
      int base = Integer.parseInt(sBase);
      int altura = Integer.parseInt(sAltura);

      //Calculando a área
      int area = base*altura/2;
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O área do triângulo é: " + area);
   }
}