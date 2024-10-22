import javax.swing.JOptionPane;
public class A3E12
/*Entrar com a idade de várias pessoas e imprimir: total de pessoas com menos de
21 anos e total de pessoas com mais de 50 anos. Parar quando for digitada uma idade
fora da faixa 0-120 anos.*/
{
   public static void main(String[] args)
   {
   //Inserindo números
      int vinteum = 0;
      int cinquenta = 0;
      int age;
      
      do
      {
      String idades = JOptionPane.showInputDialog("Insira as idades:");
      
      //Convertendo para reais
      age = Integer.parseInt(idades);
      
      //Informando quantidade de vezes
      if (age < 21)
         {vinteum++;
         JOptionPane.showMessageDialog(null, "A quantidade de vezes que foram inclusos menores de 21 anos: " 
         + vinteum + " vezes");
         }
         
      else if (age > 50)
         {cinquenta++;
         JOptionPane.showMessageDialog(null, "A quantidade de vezes que foram inclusos maiores de 50 anos: " 
         + cinquenta + " vezes");
         }
         
      } while (age > 0 && age < 120);
   }
}
