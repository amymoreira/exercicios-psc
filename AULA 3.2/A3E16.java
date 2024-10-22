import javax.swing.JOptionPane;
public class A3E16
/*Faça um algoritmo que peça para o usuário digitar um número e mostre na tela a
sequência de Fibonacci de 1 até este número.*/
{
    public static void main (String[] args) 
    {
        String x = JOptionPane.showInputDialog("Digite a quantidade de termos");
        int n1 = 0, n2 = 1;
        for (int qtd = Integer.parseInt(x); qtd > 0; qtd--) 
        {
           JOptionPane.showMessageDialog(null, n1 + " ");
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        JOptionPane.showMessageDialog(null, "Fim");
    }
}