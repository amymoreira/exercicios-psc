import javax.swing.JOptionPane;
public class A2E1
/*Construir um algoritmo que leia dois valores numéricos inteiros e efetue a adição;
caso o resultado seja maior que 10, apresentá-lo.*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String sPrimeiro = JOptionPane.showInputDialog("Primeiro número: ");
      String sSegundo = JOptionPane.showInputDialog("Segundo número: ");

      //converter para real
      int pri = Integer.parseInt(sPrimeiro);
      int seg = Integer.parseInt(sSegundo);

      //calcular relacao
      int soma = pri + seg;

      //testar a condicao e informar o resultado
      if(soma >10)
         {
         JOptionPane.showMessageDialog(null, "O resultado foi maior que 10 " + "(" + soma + ").");
         }
   }
}