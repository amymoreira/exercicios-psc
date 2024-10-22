import javax.swing.JOptionPane;
public class A2E2
/*Construir um algoritmo que leia dois números e efetue a adição. Caso o valor
somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se 5.*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String sPrimeiro = JOptionPane.showInputDialog("Primeiro número: ");
      String sSegundo = JOptionPane.showInputDialog("Segundo número: ");

      //converter para real
      Double pri = Double.parseDouble(sPrimeiro);
      Double seg = Double.parseDouble(sSegundo);

      //calcular relacao entre prestacao e salario e imprimir
      Double soma = pri+seg;

      //testar a condicao e informar o resultado
      if(soma <= 20)
         {
         System.out.println("O limite não foi alcançado");
         }
         
      else
         {
         Double subtracao = soma - 5;
         JOptionPane.showMessageDialog(null, "Ultrapassado o limite, foi retirado 5. (" + subtracao + ")." );
         }

   }
}