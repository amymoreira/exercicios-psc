import javax.swing.JOptionPane;
public class A1E9
/*Crie um algoritmo que leia um número inteiro e o eleve ao quadrado usando o
método double Math.pow(base, expoente), onde base e expoente são números
reais.*/
{
   public static void main(String[] args)
   {
      //lendo os dados
      String sBase = JOptionPane.showInputDialog("Insira o valor base");
      
      //convertendo
      double base = Double.parseDouble(sBase);
      double expoente = 2;
      
      //calculando 
      double potencia = Math.pow (base, expoente);
      
      //apresentando o resultado
      JOptionPane.showMessageDialog(null, "Resultado = " + potencia);
   }
}