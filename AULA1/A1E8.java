import javax.swing.JOptionPane;
public class A1E8
/*Crie um algoritmo para calcular a área de um retângulo, com base nas medidas de
sua base e de sua altura.*/
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sAltura = JOptionPane.showInputDialog("Digite a altura em centímetros");
      String sBase = JOptionPane.showInputDialog("Digite a base em centímetros");
      
      //convertendo
      double altura = Double.parseDouble(sAltura);
      double base = Double.parseDouble(sBase);
      
      //calculando a área
      double area = altura * base;
      
      //apresentando o resultado
      JOptionPane.showMessageDialog(null, "Área do retângulo = " + area + " cm");
   }
}