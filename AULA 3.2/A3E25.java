import javax.swing.JOptionPane;
public class A3E25
/*Escrever um algoritmo de urna eletrônica, para uma eleição com 4 candidatos à
representante de sala. O aluno vota, digitando o número do candidato (1,2, 3 ou 4). O
número de alunos eleitores é desconhecido. Quando for digitado o valor -1, o
algoritmo encerra a eleição, escrevendo o percentual de votos de cada candidato e o
total de alunos eleitores que participaram.*/
{
   public static void main(String[] args)
   {
   double voto = 0;
   int candidato1 = 0;
   int candidato2 = 0;
   int candidato3 = 0;
   int candidato4 = 0;
   double contagem = 0;
   
   do
      {
         //Solicitando os votos, oferecendo as opções
         String sVoto = JOptionPane.showInputDialog("Insira o seu voto (é anônimo!): \n" 
         + "As opções de voto são: \n1 - Chapa Gratiluz \n2 - Grêmio do Esporte \n"
         + "3 - Estudo Viver \n4 - Chapadinha");
         voto = Double.parseDouble(sVoto);
         
         if (voto == 1)
         {
         candidato1++;
         contagem++;
         JOptionPane.showMessageDialog(null, "Seu voto foi computado.");
         }
         
         else if (voto == 2)
         {
         candidato2++;
         contagem++;
         JOptionPane.showMessageDialog(null, "Seu voto foi computado.");
         }
         
         else if (voto == 3)
         {
         candidato3++;
         contagem++;
         JOptionPane.showMessageDialog(null, "Seu voto foi computado.");
         }
         
         else if (voto == 4)
         {
         candidato4++;
         contagem++;
         JOptionPane.showMessageDialog(null, "Seu voto foi computado.");
         }
         
         else if (voto ==-1)
         {
         JOptionPane.showMessageDialog(null, "A votação foi encerrada.");
         }
         
         else
         {
         JOptionPane.showMessageDialog(null, "Voto inválido.");
         }
         
      } while (voto != -1);
      
      //Calculando as porcentagens por candidato
      double porcentagem1 = 0;
      double porcentagem2 = 0;
      double porcentagem3 = 0;
      double porcentagem4 = 0;
      
      if (contagem > 0)
         {
            porcentagem1 = (candidato1 / contagem) * 100;
            porcentagem2 = (candidato2 / contagem) * 100;
            porcentagem3 = (candidato3 / contagem) * 100;
            porcentagem4 = (candidato4 / contagem) * 100;
         }
      
      //Gerando o resultado
      JOptionPane.showMessageDialog(null, "Votação finalizada. Apuração dos resultados: \n"
      + "Candidato 1 (Chapa Gratiluz): " + porcentagem1 + "% \nCandidato 2 (Grêmio do Esporte): "
      + porcentagem2 + "% \nCandidato 3 (Estudo Viver): " + porcentagem3 + "% \nCandidato 4 (Chapadinha): "
      + porcentagem4 + "%");
   }
}