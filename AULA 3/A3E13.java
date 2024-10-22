import javax.swing.JOptionPane;
public class A3E13
/*Entrar com um número e verificar se ele é um número primo.*/
{
	public static void main(String[] args) 
   {
      //Definindo os valores
		String num = JOptionPane.showInputDialog("Digite um número para verificar se é primo: ");
      int numero = Integer.parseInt(num);

      //Calculando para números primos
		for(int i = 1 ; i <= numero ; i++) 
      {
         int primo = 0;
         
         for (int j = 2; j < i; j++) 
         {  
            if (i % j == 0) 
            {
               ++primo;
            }
         }
      
         //Informando os resultados          
         if (primo == 2) 
         {
            JOptionPane.showMessageDialog(null, "O número " + numero + " é primo.");
         }
      
         else
         {
            JOptionPane.showMessageDialog(null, "O número " + numero + " não é primo.");
         }
      }
	}
}