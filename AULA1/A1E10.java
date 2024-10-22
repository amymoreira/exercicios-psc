import javax.swing.JOptionPane;
public class A1E10
/*Crie um algoritmo que leia três Strings por meio do JOptionPane e escreva a soma
do comprimento destas Strings.*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String sUm = JOptionPane.showInputDialog("Digite a primeira palavra:");
      String sDois = JOptionPane.showInputDialog("Digite a segunda palavras:");
      String sTres = JOptionPane.showInputDialog("Digite a terceira palavra:");

      //Contando o comprimento
      int comprimentoTotal = sUm.length() + sDois.length() + sTres.length();
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "Você inseriu um total de: " + comprimentoTotal + " caracteres.");

   }
}