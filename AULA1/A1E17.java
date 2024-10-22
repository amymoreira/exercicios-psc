import javax.swing.JOptionPane;
public class A1E17
/*Entre com uma data em uma variável do tipo inteiro no formato ddmmaa e
imprimir dia, mês e ano separados.*/
{
   public static void main(String[] args)
   {
      //Entrada da data
      String data = JOptionPane.showInputDialog("Insira a data (formato ddmmaa):");
      
      //Dividindo a data
      String dia = data.substring(0,2);
      String mes = data.substring(2,4);
      String ano = data.substring(4,6);
      
      //Apresentando a data
      JOptionPane.showMessageDialog(null, "A data inserida foi: \n Dia: " + dia + "\n Mês: " + mes + "\n Ano: " + ano);
    }
}