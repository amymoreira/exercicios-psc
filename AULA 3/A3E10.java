import javax.swing.JOptionPane;
public class A3E10
/*Ler vários números até entrar o número -999. Para cada número, imprimir seus
divisores.*/
{
    public static void main(String[] args) 
    {
      while (true)
         {
         //Inserindo os valores
         String snumeros = JOptionPane.showInputDialog("Digite os números (quando desejar encerrar, digite -999): ");
         double numeros = Double.parseDouble(snumeros);
         
         //Dando a condição de parada
         if (numeros == -999)
            {
            break;
            }
      
         //Apresentando os nomes
         String divisores = "";
         for (int n = 1; n <= numeros; n++)
            {
            if (numeros % n == 0)
               {
               divisores = divisores + n + "\n";
               }
            }  
         JOptionPane.showMessageDialog(null, "Os divisores do número: " + numeros + " são: \n" + divisores); 
         }
    }
}