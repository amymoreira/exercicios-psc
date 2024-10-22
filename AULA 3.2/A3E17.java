import javax.swing.JOptionPane;
public class A3E17
/*Faça um algoritmo para imprimir na tela uma tabela de conversão de polegadas
para centímetros. Deseja-se que a tabela conste de valores desde 1 até 20 polegadas.
Lembre-se que 1 polegada equivale a 2,54 cm.*/
{
   public static void main (String[] args) 
   {  
      for (int pol = 1; pol <= 20; pol++)
      {
      double centimetros = pol * 2.54;
      System.out.println ("A conversao de " + pol + "'' para cm fica: " + centimetros + "cm.");
      }
   }
}