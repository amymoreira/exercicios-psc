import javax.swing.JOptionPane;
public class A1E6
/*Leia 4 números inteiros, representando milhar, centena, dezena e unidade. Use o
tipo caractere para garantir que não seja digitado mais de um número por vez.
Depois concatene estes caracteres armazenando-os em uma String (lembre-se de
que o jeito mais fácil de transformar algo em String é concatenando-o com uma
String vazia “”). Imprima o resultado.*/
{
   public static void main(String[] args)
   {
      //Incluindo os caracteres
      char milhar = JOptionPane.showInputDialog("Digite o milhar:").charAt(0);
      char centena = JOptionPane.showInputDialog("Digite a centena:").charAt(0);
      char dezena = JOptionPane.showInputDialog("Digite a dezena:").charAt(0);
      char unidade = JOptionPane.showInputDialog("Digite a unidade:").charAt(0);
      
      //Concatenando os chars
      String numeros = "" + milhar + centena + dezena + unidade;
      
      //Apresentando o número final
      JOptionPane.showMessageDialog(null, "O número final é: " + numeros);
    }
}