import javax.swing.JOptionPane;
public class A3E3
/*Entrar com vários números positivos e imprimir a média dos números digitados.*/
{
    public static void main(String[] args) 
    {
        int soma = 0;
        int quantidade = 0;
        int numero;

      //Inserindo os números
      do {
            String number = JOptionPane.showInputDialog("Digite um número positivo (ou um número negativo para sair): ");
            numero = Integer.parseInt(number);
            
      //Calculando
         if (numero >= 0) 
            {
                soma += numero;
                quantidade++;
            }

         } while (numero >= 0);

      //Testando condições e exibindo resultados
      if (quantidade > 0) 
        {
            double media = (double) soma / quantidade;
            JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
        } 
      else 
        {
            JOptionPane.showMessageDialog(null, "Nenhum número positivo foi digitado.");
        }
    }
}