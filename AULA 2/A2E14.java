import javax.swing.JOptionPane;
public class A2E14
/*Ler um número inteiro de 4 casas e imprimir se é ou não múltiplo de quatro o
número formado pelos algarismos que estão nas casas das unidades de milhar e das
centenas.*/
{
   public static void main(String[] args)
   {
      //Adicionar os números
      String num1 = JOptionPane.showInputDialog("Digite o número:  ");

      //converter para real
      int numero1 = Integer.parseInt(num1);
      int milharCentena = numero1 / 100;
      
    
      //testar a condicao e informar o resultado
      if (milharCentena % 4 == 0)
         {
         JOptionPane.showMessageDialog(null, "O número formado pelas casas das unidades e milhar do número inserido é " + milharCentena
          + ", que por sua vez, é um múltiplo do número 4.");
         }
         else JOptionPane.showMessageDialog(null, "O número formado pelas casas das unidades e milhar do número inserido é " + milharCentena
          + ", que por sua vez, não é um múltiplo do número 4.");
    }
}