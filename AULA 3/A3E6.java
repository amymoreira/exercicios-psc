import javax.swing.JOptionPane;
public class A3E6
/*Ler vários números até entrar o número -999. Para cada número, imprimir sua raiz
quadrada e seu inverso.*/
{
   public static void main(String[] args) 
   {
   
      // Inserindo o dado
      int numero;
      do 
         {
         String number = JOptionPane.showInputDialog("Digite um número (ou -999 para sair): ");
         numero = Integer.parseInt(number);

      //Apresenta as condições e os cálculos
         if (numero != -999) 
            {
            if (numero >= 0) 
               {
               double raizQuadrada = Math.sqrt(numero);
               JOptionPane.showMessageDialog(null, "Raiz quadrada de " + numero + " é: " + raizQuadrada);
               } 
               
            else 
               {
               JOptionPane.showMessageDialog(null, "Não é possível calcular a raiz quadrada de um número negativo.");
               }

            if (numero != 0) 
               {
               double inverso = 1.0 / numero;
               JOptionPane.showMessageDialog(null, "Inverso de " + numero + " é: " + inverso);
               } 
               
            else 
               {
               JOptionPane.showMessageDialog(null, "O inverso de 0 não é definido.");
               }
            }

        } while (numero != -999);

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}