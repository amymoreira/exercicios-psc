import javax.swing.JOptionPane;
public class A1E3
/*Crie um algoritmo que leia 3 números que representem uma data,
respectivamente dia, mês e ano. Depois imprima a data usando o formato
dia/mês/ano.*/
{
   public static void main(String[] args)
   {
      //Entrada de datas
      String Dia = JOptionPane.showInputDialog("Insira o dia:");
      String Mes = JOptionPane.showInputDialog("Insira o mês:");
      String Ano = JOptionPane.showInputDialog("Insino o ano:");
      
      //Apresentando a data
      JOptionPane.showMessageDialog(null, Dia + "/" + Mes + "/" + Ano);
    }
}