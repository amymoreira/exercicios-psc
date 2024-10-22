import javax.swing.JOptionPane;
public class A1E22
/*Entrar com um número e imprimir o número, seu quadrado e sua raiz quadrada.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String sValor = JOptionPane.showInputDialog("Insira o valor:");
      
      //Converter para real
      int valor = Integer.parseInt(sValor);

      //Calculando
      double quadrado = Math.pow(valor,2);
      double raiz = Math.sqrt(valor);
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O resultado é: \n \n Valor: " + valor + "\n Ao quadrado: " +
      quadrado + "\n Sua raíz: " + raiz);
   }
}
