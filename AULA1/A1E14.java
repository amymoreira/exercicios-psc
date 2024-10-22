import javax.swing.JOptionPane;
public class A1E14
/*Entrar com um número e imprimir o logaritmo desse número na base 10.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String numero = JOptionPane.showInputDialog("Insira o valor pro log:");

      //Converter para real
      double Num = Double.parseDouble(numero);

      //Calculando a log
      double resultado = Math.log10(Num);
      
      //Apresentando o caractere decimal
      JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
   }
}
