import javax.swing.JOptionPane;
public class A2E3
/*Entrar com um número e imprimir a raiz quadrada do número caso ele seja
positivo e o quadrado do número caso seja negativo.*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String sValor = JOptionPane.showInputDialog("Digite um número:  ");

      //converter para real
      Double numero = Double.parseDouble(sValor);

      //testar a condicao e informar o resultado
      if (numero > 0)
         {
         Double raiz = Math.sqrt(numero);
         JOptionPane.showMessageDialog(null, "Resultado da raiz quadrada = " + raiz);
         }
         
      else
         {
         Double quad = Math.pow(numero, 2);
         JOptionPane.showMessageDialog(null, "Resultado ao quadrado = " + quad);
         }

   }
}