import javax.swing.JOptionPane;
public class A3E22
/*Criar um algoritmo que leia um número que será o limite superior de um intervalo
e imprimir todos os números ímpares menores do que esse número. Exemplo: limite
15, imprime 1, 3,5, 7, 9, 11, 13.*/
{
   public static void main (String[] args) 
   {
   String superior = JOptionPane.showInputDialog
   ("Digite o limite superior");
   
   double sup = Double.parseDouble(superior);
   
      for (double num = 1; num <= sup; num = num + 2)
      {
         System.out.println (num);
      }
   }
}