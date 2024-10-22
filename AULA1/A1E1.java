import javax.swing.JOptionPane;
public class A1E1
/* Crie um algoritmo que leia três palavras, separadamente, e as apresente na tela
na ordem contrária em que foram digitadas, separadas por espaço.*/
{
   public static void main(String[] args)
   {
      //Entrada de palavras
      String Word1 = JOptionPane.showInputDialog("Plavara 1:");
      String Word2 = JOptionPane.showInputDialog("Palavra 2:");
      String Word3 = JOptionPane.showInputDialog("Palavra 3:");
      
      //Apresentando as palvras
      JOptionPane.showMessageDialog(null, Word3 + " " + Word2 + " " + Word1);
    }
}