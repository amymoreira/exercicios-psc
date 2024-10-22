import javax.swing.JOptionPane;
public class A1E2
/*Crie um algoritmo que leia um número inteiro, armazene-o em uma variável do
tipo int e depois escreva na tela: “O valor do número digitado é: ” e o valor do
número.*/
{
   public static void main(String[] args)
   {
      //Entrada do número
      String Input = JOptionPane.showInputDialog("Digite o número:");
      int Number = Integer.parseInt(Input);
      
      //Armazenando em número inteiro
      int num = Number;
      
      //Apresentando as palvras
      JOptionPane.showMessageDialog(null, "O valor do número é: " + num);
    }
}