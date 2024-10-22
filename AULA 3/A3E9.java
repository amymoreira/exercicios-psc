import javax.swing.JOptionPane;
public class A3E9
/*Imprimir na tela todos os números de 1 a 100 e a soma deles.*/
{
   public static void main(String[] args) 
      {
      //Início
      String numeros = "";
      int soma = 0;
         
      //Dando a condição
      for (int num = 1; num <= 100; num ++)
         {
         numeros = numeros + num + "\n";
         soma = soma + num;
         }
         
      //Dando resultados
      System.out.println("A lista de números: " + numeros + "A soma dos números é :" + soma);
      }
}