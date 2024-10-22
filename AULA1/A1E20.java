import javax.swing.JOptionPane;
public class A1E20
/*Crie um algoritmo para calcular a área de um círculo, com base no seu raio
(Área = PI * raio * raio, onde PI = 3.14159). Use variáveis reais.*/
{
   public static void main(String[] args)
   {
      //Inserindo o valor
      String raio = JOptionPane.showInputDialog("Insira o raio:");
      
      //Converter para real
      double rr = Double.parseDouble(raio);
      double pi = 3.14159;

      //Calculando a área do círculo
      double resultado = pi* (Math.pow(rr,2));
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "O resultado da área do círculo é: " + resultado);
   }
}