import javax.swing.JOptionPane;
public class A1E11
/*Crie um algoritmo que calcule o valor de uma dívida, submetida a juros
compostos: Valor_Final = Valor_Inicial * (1 + J/100)^N, onde J representa os juros
(em %) e N representa o número de meses. Responda: se você deve para o cartão de
crédito R$ 100,00, à taxa de juros de 10%, quanto deverá depois de 8 meses?*/
{
   public static void main(String[] args)
   {
      //Adicionar os valores pra soma
      String sDebito = JOptionPane.showInputDialog("Quanto você deve?");
      String sJuros = JOptionPane.showInputDialog("Quais são os juros atualmente?");
      String sMeses = JOptionPane.showInputDialog("Há quantos meses tem essa dívida?");

      //Converter para real
      double VI = Double.parseDouble(sDebito);
      double J = Double.parseDouble(sJuros);
      double N = Double.parseDouble(sMeses);

      //Calculando a taxa de juros
      double VF = VI * Math.pow ((1 + J / 100), N);
      
      //Apresentando o resultado
      JOptionPane.showMessageDialog(null, "Atualmente sua dívida está em = " + VF + " reais.");
   }
}

/*Após 10 meses, eu deverei aproximandamente, R$214,36.*/