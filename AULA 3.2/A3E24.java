import javax.swing.JOptionPane;
public class A3E24
/*Escrever um algoritmo que lê repetidamente o valor do preço de uma mercadoria
e a quantidade de itens comprados dessa mercadoria. Quando a quantidade lida for
igual a zero, o algoritmo deve mostrar o total a ser pago. O algoritmo não deve
computar valores negativos de preço ou de quantidade; neste caso, o algoritmo deve
pedir que o usuário digite novamente o valor do preço ou da quantidade digitados
indevidamente (sugestão: usar outro loop faça-enquanto para cada caso).
OBS.: Considerar a quantidade de mercadorias compradas é desconhecida.*/
{
   public static void main(String[] args) 
   {
   double preco = 0;
   double total = 0;
   int quantidade = 0;

   do 
   {
      do 
      {
      //Introduzindo os preços
         String sPreco = JOptionPane.showInputDialog
         ("Digite o preço da mercadoria (ou um valor negativo para repetir): ");
         preco = Double.parseDouble(sPreco);
         
         if (preco < 0) 
         {
            JOptionPane.showMessageDialog(null, "Preço inválido. Tente novamente.");
         }

      } while (preco < 0);
      
      //Dando as condições de parada da função
      if (preco == 0) 
      {
         break;
      }

      //Introduz a quantidade de itens
      do 
      {
         String sQuantidade = JOptionPane.showInputDialog 
         ("Digite a quantidade comprada (ou zero para finalizar): ");
         quantidade = Integer.parseInt(sQuantidade);
         
         if (quantidade < 0) 
         {
            JOptionPane.showMessageDialog(null, "Quantidade inválida. Tente novamente.");
         }
      } while (quantidade < 0);

      //Calculando
      total += preco * quantidade;

      } while (quantidade != 0);

      //Apresentando o total
      JOptionPane.showMessageDialog(null, "Total a ser pago: R$" + total);
    }
}
