import javax.swing.JOptionPane;
public class A1E5
/*Ler dez caracteres e imprimir a palavra formada por eles.*/
{
   public static void main(String[] args)
   {
      //Incluindo os caracteres
      String c01 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c02 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c03 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c04 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c05 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c06 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c07 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c08 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c09 = JOptionPane.showInputDialog("Insira os caracteres: ");
      String c10 = JOptionPane.showInputDialog("Insira os caracteres: ");
      
      //Apresentando a palavra final
      JOptionPane.showMessageDialog(null, c01 + c02 + c03 + c04 + c05 + c06 + c07 + c08 + c09 + c10);
    }
}