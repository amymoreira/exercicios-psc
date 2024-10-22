import javax.swing.JOptionPane;
public class A1E13
/*Entrar com um ângulo em graus e imprimir: seno, cosseno, tangente, secante,
cossecante e cotangente.*/
{
   public static void main(String[] args)
   {
      //Inserindo o ângulo
      String numero = JOptionPane.showInputDialog("Insira o valor do ângulo:");

      //Converter para real
      double angle = Double.parseDouble(numero);

      //Calculando as informações do ângulo
      double seno = Math.sin(angle);
      double cosseno = Math.cos(angle);
      double tangente = Math.tan(angle);
      double secante = 1/cosseno;
      double cossecante = 1/seno;
      double cotangente = 1/tangente;
      
      //Apresentando os valores
      JOptionPane.showMessageDialog(null, "Os resultados dos valores do ângulo é: \n \n Seno: " + seno + 
      "\n Cosseno: " + cosseno + "\n Tangente: " + tangente + "\n Secante: " + secante + "\n Cossecante:" + cossecante + "\n Cotangente: " + cotangente);
   }
}
