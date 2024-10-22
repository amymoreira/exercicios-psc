import javax.swing.JOptionPane;
public class A1E4
/*Solicite ao usuário que digite seu peso no formato real. Depois imprima “O peso
informado foi “ + peso + “ kg.”.*/
{
   public static void main(String[] args)
   {
      //Entrada do peso
      String Peso = JOptionPane.showInputDialog("Insira o seu peso em quilogramas:");
      
      //Apresentando o peso
      JOptionPane.showMessageDialog(null, "O peso informado foi: " + Peso + "kg.");
    }
}