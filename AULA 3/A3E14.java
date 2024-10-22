import javax.swing.JOptionPane;
public class A3E14 
/*Escrever um algoritmo que receba vários números inteiros positivos e imprima a
quantidade de números primos dentre os números que foram digitados. Parar quando
for digitado um número não positivo.*/
{
   public static void main(String[] args) 
   {
    //Verificando se é número primo
      int numero;
      if (numero <= 1) 
      {
         return false;
      }
        
      for (int i = 2; i <= Math.sqrt(numero); i++) 
      {
         if (numero % i == 0) 
            {
               return false;
            }
      }
        
      return true;   
   //Contando os números primos
   int quantidadePrimos = 0;

   while (true) 
   {
      System.out.print("Digite um número inteiro positivo (ou não positivo para sair): ");
      numero = Integer.parsetInt();

      if (numero <= 0) 
      {
         break;
      }

      //Verifica o número
      if (isPrimo(numero)) 
      {
         quantidadePrimos++;
      }
   }
        System.out.println("Quantidade de números primos digitados: " + quantidadePrimos);
   }
}
