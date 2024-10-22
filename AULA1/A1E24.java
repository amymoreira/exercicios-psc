import javax.swing.JOptionPane;
public class A1E24
/*Criar um algoritmo que calcule e imprime a área de um losango.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String sDmenor = JOptionPane.showInputDialog("Insira o valor da diagonal menor:");
      String sDmaior = JOptionPane.showInputDialog("Insira o valor da diagonalmaior:");
      
      //Converter para real
      int diagmenor = Integer.parseInt(sDmenor);
      int diagmaior = Integer.parseInt(sDmaior);

      //Calculando a área
      int area = diagmenor*diagmaior/2;
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O área do losangulo é: " + area);
   }
}