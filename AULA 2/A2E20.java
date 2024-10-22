import javax.swing.JOptionPane;
public class A2E20
/*Criar um algoritmo que deixe entrar com dois números e imprimir o quadrado
do menor número e a raiz quadrada do maior número, se for possível (suponha
números diferentes).*/
{
    public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");

      //converter para real
      Double numero1 = Double.parseDouble(num1);
      Double numero2 = Double.parseDouble(num2);

      //testar a condicao e informar o resultado
      if (numero1 > numero2)
         {
         Double raiz = Math.sqrt(numero1);
         Double quadrado = Math.pow(numero2, 2);
         JOptionPane.showMessageDialog(null, "Os número inseridos foram: " + numero1 + " e " + numero2 + ", onde a raíz do número maior é: " + raiz +
         " e o quadrado do menor é: " + quadrado + ".");
         }
         
      else {
         Double raiz = Math.sqrt(numero2);
         Double quadrado = Math.pow(numero1 , 2);
         JOptionPane.showMessageDialog(null, "Os número inseridos foram: " + numero1 + " e " + numero2 + ", onde a raíz do número maior é: " + raiz +
         " e o quadrado do menor é: " + quadrado  + ".");
         }

   }
}