import javax.swing.JOptionPane;
public class A3E19
/*FCrie um algoritmo que calcule o fatorial de um número. Exemplo: 0! = 1; 1! = 1; 2!
= 1*2 = 2; 3! = 1*2*3 = 6; 4! = 1*2*3*4 = 24; 5! = 1*2*3*4*5 = 120; ...*/
{
   public static void main (String[] args) 
   {
   String base = JOptionPane.showInputDialog("Insira o valor a ser calculado o fatorial");
   
   int x = Integer.parseInt(base);
   double f = x;
   
   while (x > 1)
      {
      f = f *(x-1); x--;
      } 
   System.out.println(f);
   }
}