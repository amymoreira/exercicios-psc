import javax.swing.JOptionPane;
public class A3E23
/*Criar um algoritmo que leia um número que servirá para controlar os números
pares que serão impressos a partir de 2 Exemplo: quantos 4, imprime 2, 4, 6, 8.*/
{
   public static void main (String[] args) 
   {
   String quantidade = JOptionPane.showInputDialog
   ("Digite quantos números pares você quer:");
   
   double qtd = Double.parseDouble(quantidade);
   
      for (double num = 2; num <= (qtd = qtd + 1); num = num + 2)
      {
         System.out.println (num);
      }
   }
}