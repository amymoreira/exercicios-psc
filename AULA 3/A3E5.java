import javax.swing.JOptionPane;
public class A3E5
/*Entrar com nomes enquanto forem diferentes de FIM e imprimir cada nome
digitado.*/
{
    public static void main(String[] args) 
    {
      while (true)
         {
         //Inserindo os nomes
         String nome = JOptionPane.showInputDialog("Digite os nomes (quando desejar encerrar, digite FIM): ");
         
         //Dando a condição de parada
         if (nome.equals("FIM"))
            {
            break;
            }
      
      //Apresentando os nomes
      String nomes = "";
      nomes = nomes + nome + "\n";
      JOptionPane.showMessageDialog(null, "Os nomes inseridos foram: " + nomes);
         }   
    }
}