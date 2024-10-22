import javax.swing.JOptionPane;
public class A3E2
/*Imprimir na tela os 100 primeiros números pares.*/
{
   public static void main(String[] args)
   {
      int even = 0;
      while (even <= 200)
      {
         even++;
         
         if (even % 2 == 0) {
            System.out.println(even);
         }
      }
   }
}