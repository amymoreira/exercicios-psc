import javax.swing.JOptionPane;
public class A1E7
/*Crie um algoritmo para calcular o número de dias aproximado que você viveu,
com base em sua idade.*/
{
   public static void main(String[] args)
   {
      //Lendo os dados
      String sIdade = JOptionPane.showInputDialog("Digite sua idade:");
      
      //Convertendo
      double idade = Double.parseDouble(sIdade);
      
      //Calculando em dias
      double diasv = idade * 365;
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "Você viveu aproximadamente: " + diasv + " dias");
   }
}