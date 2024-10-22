import javax.swing.JOptionPane;
public class A3E21
/*Entrar com o nome, idade e sexo de 20 pessoas. Imprimir o nome sempre que a
pessoa for do sexo masculino e tiver mais de 21 anos.*/
{
   public static void main (String[] args) 
   {
      for (int i = 0; i <= 20; i++)
      {
         String nome = JOptionPane.showInputDialog ("Digite o seu nome:");
         String sIdade = JOptionPane.showInputDialog ("Digite a sua idade:");
         char sexo = JOptionPane.showInputDialog ("Digite o seu sexo:").charAt(0);
      
         double idade = Double.parseDouble(sIdade);
      
         if (sexo == 'M' && idade > 21 || sexo == 'm' && idade > 21)
         {
            JOptionPane.showMessageDialog(null, "O usuário " + nome + " é do sexo masculino e tem mais de 21 anos");
         }
      }
   }
}