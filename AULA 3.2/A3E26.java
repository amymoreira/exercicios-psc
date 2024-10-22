import javax.swing.JOptionPane;
public class A3E26
/*Escrever um algoritmo que lê 2 números reais. A seguir, é apresentado, para o
usuário, o menu a seguir:
“Operações Disponíveis:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
9. Sair do Programa
Digite o número de ordem da opção desejada: “
Se a opção for 1, o algoritmo deve somar os dois valores lidos; se for 2, o algoritmo
deve fazer o primeiro valor menos o segundo; se for 3, o algoritmo deve multiplicar
os valores lidos; se for 4, o algoritmo deve dividir o primeiro pelo segundo valor lido,
desde que este não seja zero (o algoritmo deve ter tratamento especial para este
caso).
O algoritmo deve escrever o resultado da operação escolhida. Se o usuário digitar 9,
o algoritmo deve ser encerrado. Enquanto o valor da opção 9 não for digitado, o menu
deve ser apresentado novamente.*/
{
   public static void main(String[] args)
   {
   //Solicitando os algoritmos ao usuário
   String numero1 = JOptionPane.showInputDialog("Digite o primeiro algoritmo: ");
   String numero2 = JOptionPane.showInputDialog("Digite o segundo algoritmo: ");
   
   double num1 = Double.parseDouble(numero1);
   double num2 = Double.parseDouble(numero2);
   
   double operacao;
   
   do
   {
   //Apresentando as opções disponíveis
   String sOperacao = JOptionPane.showInputDialog("Operações Disponíveis: \n 1. Adição \n 2. Subtração \n 3. Multiplicação"
   + " \n 4. Divisão \n 9. Sair do Programa \nDigite o número de ordem da opção desejada:");
   operacao = Double.parseDouble (sOperacao);
   
   double resultado = 0;

      if (operacao == 1)
      {
         resultado = num1 + num2;
         JOptionPane.showMessageDialog(null, "O resultado da operação solicitada entre os dois números é: " + resultado);
      }
      
      else if (operacao == 2)
      {
         resultado = num1 - num2;
         JOptionPane.showMessageDialog(null, "O resultado da operação solicitada entre os dois números é: " + resultado);
      }
      
      else if (operacao == 3)
      {
         resultado = num1 * num2;
         JOptionPane.showMessageDialog(null, "O resultado da operação solicitada entre os dois números é: " + resultado);
      }
      
      else if (operacao == 4)
      {
         if (num1 == 0 || num2 == 0)
         {
            JOptionPane.showMessageDialog(null, "O número 0 não pode ser dividido, tente outra opção.");
         }
         else
         {
         resultado = num1 / num2;
         JOptionPane.showMessageDialog(null, "O resultado da operação solicitada entre os dois números é: " + resultado);
         }
      }
      
      else if (operacao == 9)
      {
         JOptionPane.showMessageDialog(null, "A operação foi encerrada.");
      }
      
      else
      {
         JOptionPane.showMessageDialog(null, "Não foi digitado uma opção válida de operação.");
      }
    } while (operacao != 9);
  }
}