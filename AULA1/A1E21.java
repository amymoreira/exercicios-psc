import javax.swing.JOptionPane;
public class A1E21
/*Ler dois números inteiros e imprimir dividendo, divisor, quociente e resto.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String sDividendo = JOptionPane.showInputDialog("Insira o dividendo:");
      String sDivisor = JOptionPane.showInputDialog("Insira o divisor:");
      
      //Converter para real
      int dividendo = Integer.parseInt(sDividendo);
      int divisor = Integer.parseInt(sDivisor);

      //Calculando a log
      int quociente = dividendo / divisor;
      int resto = dividendo % divisor;
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O resultado da divisão é: \n \n Dividendo: " + dividendo + "\n Divisor: " +
      divisor + "\n Quociente: " + quociente + "\n Resto: " + resto);
   }
}