import javax.swing.JOptionPane;
public class A2E23
/*Ler três números e armazená-los em três variáveis com os seguintes nomes, de
acordo com seus valores relativos: maior, intermediário e menor (suponha números
diferentes).*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores
      String num1 = JOptionPane.showInputDialog("Digite o primeiro número:  ");
      String num2 = JOptionPane.showInputDialog("Digite o segundo número:  ");
      String num3 = JOptionPane.showInputDialog("Digite o terceiro número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int numero2 = Integer.parseInt(num2);
      int numero3 = Integer.parseInt(num3);
      int maior;
      int inter;
      int menor;
      
      //Verificar qual o maior número
      if (numero1 > numero2 && numero1 > numero3)
         {
         maior = numero1;
         }
         else if (numero2 > numero1 && numero2 > numero3)
         {
         maior = numero2;
         }
         else
         maior = numero3;
         
      //Verificar qual o menor número
      if (numero1 < numero2 && numero1 < numero3)
         {
         menor = numero1;
         }
         else if (numero2 < numero1 && numero2 < numero3)
         {
         menor = numero2;
         }
         else
         menor = numero3;
         
      //Verificar qual o número intermediário
      if (numero1 > menor && numero1 < maior)
         {
         inter = numero1;
         }
         else if ((numero2 > menor && numero2 < maior))
         {
         inter = numero2;
         }
         else
         inter = numero3;
         
      //Informado a maior variável
      JOptionPane.showMessageDialog(null, "O maior número informado é " + maior + ", o número intermediário é " + inter
      + " e o menor número é " + menor + ".");
   }
}