import javax.swing.JOptionPane;
public class A3E20
/*Criar um algoritmo que leia um número que será o limite superior de um intervalo
e o incremento. Imprimir todos os números do intervalo de 0 até esse número, de
incremento em incremento. Ex: limite 20, incremento 5; vai imprimir 0, 5, 10, 15, 20.*/
{
   public static void main (String[] args) 
   {
   String superior = JOptionPane.showInputDialog
   ("Digite o limite superior");
   String incremento = JOptionPane.showInputDialog
   ("Digite o incremento");
   
   double sup = Double.parseDouble(superior);
   double inc = Double.parseDouble(incremento);
   
      for (double num = 0; num <= sup; num = num + inc)
      {
      System.out.println (num);
      }
   }
}