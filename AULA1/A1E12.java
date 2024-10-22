import javax.swing.JOptionPane;
public class A1E12
/*Entrar com um número inteiro de 3 casas decimais e imprimir o algarismo da casa
das dezenas.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String numero = JOptionPane.showInputDialog("Insira um número de 3 casas decimais:");

      //Converter para real
      int Dez = Integer.parseInt(numero);

      //Calculando a lógica
      int NumMeio = (Dez/10)%10;
      
      //Apresentando o caractere decimal
      JOptionPane.showMessageDialog(null, "O número da casa decimal é: " + NumMeio);
   }
}
