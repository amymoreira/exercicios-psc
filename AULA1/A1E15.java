import javax.swing.JOptionPane;
public class A1E15
/*Entrar com um número e a base em que se deseja calcular o logaritmo do
número, calcular tal logaritmo e imprimir o resultado.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String numero = JOptionPane.showInputDialog("Insira o valor pro log:");
      String base = JOptionPane.showInputDialog("Insira o valor pra base:");
      
      //Converter para real
      double Num = Double.parseDouble(numero);
      double Bas = Double.parseDouble(base);

      //Calculando a log
      double resultado = Math.log(Num) / Math.log(Bas);
      
      //Apresentando o caractere decimal
      JOptionPane.showMessageDialog(null, "O resultado é " + resultado);
   }
}
