import javax.swing.JOptionPane;
public class A3E15
/*Entrar com vários números e imprimir o maior. O algoritmo para quando 
se digita -9999.*/
{
    public static void main(String[] args) 
    {
        //Inserindo os dados
        int maior = Integer.MIN_VALUE;

        while (true) 
        {
            String num = JOptionPane.showInputDialog("Digite um número (digite -9999 para parar): ");
            int numero = Integer.parseInt(num);
            
            //Testando condições
            if (numero == -9999) 
            {
                break;
            }

            if (numero > maior) 
            {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) 
        {
            JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Nenhum número foi digitado.");
        }
    }
}