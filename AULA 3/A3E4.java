import javax.swing.JOptionPane;
public class A3E4
/*Ler vários números e informar quantos números entre 100 e 200 foram digitados.
Quando o valor 0 (zero) for lido o algoritmo deverá cessar sua execução.*/
{
   public static void main(String[] args)
   {
      int x = 0;
      
      //Inserindo os números
      String number = JOptionPane.showInputDialog("Insira os números:");
      
      //Convertendo para reais
      int num = Integer.parseInt(number);
      
      while (num != 0){
      //Inserindo mais números
      String numero = JOptionPane.showInputDialog("Insira os números:");
      
      //Convertendo para reais
      int nmr = Integer.parseInt(numero);

         
      //Informando números entre 100 e 200
      if (num >= 100 && num <= 200 && nmr >= 100 && nmr <= 200)
         {x++;
         JOptionPane.showMessageDialog(null, "A quantidade de vezes que foram inclusos números entre 100 e 200 foram: " 
         + x + " vezes");
         }
      }
   }
}
