import javax.swing.JOptionPane;
public class A3E18
/*Faça um algoritmo para imprimir na tela uma tabela de conversão de graus Celsius
para graus Fahrenheit. Deseja-se que o mesmo solicite ao usuário o limite inferior, o
superior e o incremento. Lembre-se que C = 5.(F-32)/9*/
{
   public static void main (String[] args) 
   {
   String inferior = JOptionPane.showInputDialog
   ("Digite o limite inferior \n (verifique se o valor está abaixo do inserido)");
   String superior = JOptionPane.showInputDialog
   ("Digite o limite superior \n (verifique se o valor está acima do inserido)");
   String incremento = JOptionPane.showInputDialog
   ("Digite o incremento");
   
   double inf = Double.parseDouble(inferior);
   double sup = Double.parseDouble(superior);
   double inc = Double.parseDouble(incremento);
   
      for (double c = inf; c <= sup; c = c + inc)
      {
      double f = (c * 9 / 5) + 32;
      System.out.println ("A conversao de " + c + "°C para Fahrenheit fica: " + f + "°F.");
      }
   }
}