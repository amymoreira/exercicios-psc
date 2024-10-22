import javax.swing.JOptionPane;
public class A3E11
/*Uma empresa de fornecimento de energia elétrica faz a leitura mensal dos
medidores de consumo. Para cada consumidor são digitados os seguintes dados:
código do consumidor, quantidade de kWh consumidos durante o mês, tipo do
consumidor. Os tipos podem ser 1 - residencial, preço por kWh = R$ 0,3; 2 - comercial,
preço por kWh = 0,5; 3 - industrial, preço por kWh = 0,7. Os dados devem ser lidos até
que seja encontrado um consumidor com código 0 (zero). Calcular e imprimir o custo
total para cada consumidor, o total de consumo para os três tipos de consumidor, a
média de consumo dos tipos 1 e 2.*/
{
   public static void main(String[] args) 
   {
      //Inserindo os dados do consumidor
      int codigo;
      double consumo, custo;
      int tipo;
        
      double totalConsumoResidencial = 0, totalConsumoComercial = 0, totalConsumoIndustrial = 0;
      int contadorResidencial = 0, contadorComercial = 0;
        
      while (true) 
      {
         String cod = JOptionPane.showInputDialog("Digite o código do consumidor (0 para sair): ");
         codigo = Integer.parseInt(cod);
            
         if (codigo == 0) 
         {
            break;
         }

         String con = JOptionPane.showInputDialog("Digite a quantidade de kWh consumidos: ");
         consumo = Integer.parseInt(con);

         String typ = JOptionPane.showInputDialog("Digite o tipo de consumidor (1-Residencial, 2-Comercial, 3-Industrial): ");
         tipo = Integer.parseInt(typ);

         // Cálculo do custo com base no tipo de consumidor
         switch (tipo) 
         {
            case 1: // Residencial
               custo = consumo * 0.3;
               totalConsumoResidencial += consumo;
               contadorResidencial++;
               break;
                
            case 2: // Comercial
               custo = consumo * 0.5;
               totalConsumoComercial += consumo;
               contadorComercial++;
               break;
                
            case 3: // Industrial
               custo = consumo * 0.7;
               totalConsumoIndustrial += consumo;
               break;
               
            default:
               System.out.println("Tipo de consumidor inválido.");
               continue;
         }

         JOptionPane.showMessageDialog(null, "Código do consumidor: %d, Custo total: R$ %.2f\n", codigo, custo);
      }

      // Calculando a média de consumo dos tipos 1 (residencial) e 2 (comercial)
      double mediaResidencial = (contadorResidencial > 0) ? totalConsumoResidencial / contadorResidencial : 0;
      double mediaComercial = (contadorComercial > 0) ? totalConsumoComercial / contadorComercial : 0;

      // Exibindo os resultados finais
      JOptionPane.showMessageDialog(null, "\n--- Resumo ---");
      JOptionPane.showMessageDialog(null, "Total de consumo residencial: %.2f kWh\n", totalConsumoResidencial);
      JOptionPane.showMessageDialog(null, "Total de consumo comercial: %.2f kWh\n", totalConsumoComercial);
      JOptionPane.showMessageDialog(null, "Total de consumo industrial: %.2f kWh\n", totalConsumoIndustrial);
      JOptionPane.showMessageDialog(null, "Média de consumo residencial: %.2f kWh\n", mediaResidencial);
      JOptionPane.showMessageDialog(null, "Média de consumo comercial: %.2f kWh\n", mediaComercial);
    }
}
