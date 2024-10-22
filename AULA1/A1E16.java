import javax.swing.JOptionPane;
public class A1E16
/*Crie um algoritmo que embaralhe mensagens fazendo o seguinte: leia três
frases, separe cada uma delas ao meio. Então junte nesta ordem: primeira metade
da segunda, segunda metade da terceira, segunda metade da segunda, primeira
metade da primeira, primeira metade da terceira, segunda metade da primeira.
Concatene então as três frases originais e imprima o resultado. Na linha de baixo,
escreva a frase embaralhada e compare o resultado.*/
{
   public static void main(String[] args)
   {
      //Inserindo as frases
      String wordUm = JOptionPane.showInputDialog("Insira a primeira frase:");
      String wordDois = JOptionPane.showInputDialog("Insira a segunda frase:");
      String wordTres = JOptionPane.showInputDialog("Insira a terceira frase:");
      
      //Dividindo strings
      String wordUmPrimeira = wordUm.substring(0, wordUm.length() /2);
      String wordUmSegunda = wordUm.substring(wordUm.length()/2);
      String wordDoisPrimeira = wordDois.substring(0, wordDois.length() /2);
      String wordDoisSegunda = wordDois.substring(wordDois.length()/2);
      String wordTresPrimeira = wordTres.substring(0, wordTres.length() /2);
      String wordTresSegunda = wordTres.substring(wordTres.length()/2);

      //Juntando as frases
      String fraseEmbaralhada = wordDoisPrimeira + wordTresSegunda + wordDoisSegunda + wordUmPrimeira
      + wordTresPrimeira + wordUmSegunda;
      
      //Apresentando o caractere decimal
      JOptionPane.showMessageDialog(null, "As frases originais eram: \n " + wordUm + "\n" + wordDois + "\n" + wordTres + "\n \n" + 
      "A frase embaralhada ficou: \n" + fraseEmbaralhada);
   }
}
