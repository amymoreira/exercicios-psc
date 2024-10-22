import javax.swing.JOptionPane;
public class A2E7
/*Entrar com o nome, sexo e idade de uma pessoa. Se a pessoa for do sexo feminino
e tiver menos que 25 anos, imprimir nome e a mensagem: ACEITA. Caso contrário,
imprimir nome e a mensagem: NÃO ACEITA. (Considerar f ou F.)*/
{
   public static void main(String[] args)
   {
      //Adicionando os dados
      String nome = JOptionPane.showInputDialog("Digite o seu nome:  ");
      char sexo = JOptionPane.showInputDialog("Digite o seu sexo:  ").charAt(0);
      String anos = JOptionPane.showInputDialog("Digite a sua idade em anos:  ");

      //converter para real
      Double idade = Double.parseDouble(anos);

      //testar a condicao e informar se aceita
      if (idade < 25)
         {
            if (sexo == 'f' || sexo == 'F')
            {
            JOptionPane.showMessageDialog(null, nome + " = ACEITA.");
            }
            
            else
            {
            JOptionPane.showMessageDialog(null, nome + " = NÃO ACEITA.");
            }
         }
         
      else
         {
         JOptionPane.showMessageDialog(null, nome + " = NÃO ACEITA.");
         }
   }
}