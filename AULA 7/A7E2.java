/*Exercício 2: No material da “Aula 07 – Relacionamento entre Classes”, no tópico
“Classes Abstratas”, na página 13, implemente a classe para testes das classes listadas
nessa página.*/

import javax.swing.JOptionPane;
abstract class Forma
{
   public abstract double CalcularArea();
   public abstract double calcularPerimetro();
}

abstract class Retangulo extends Forma
{
   private double largura;
   private double altura;
   
   public Retangulo(double largura, double altura)
   {
      this.largura = largura;
      this.altura = altura;
   }
   
   public double calcularPerimetro()
   {
      return 2 * (largura + altura);
   }
}

abstract class Circulo extends Forma
{
   private double raio;
   
   public Circulo(double raio)
   {
      this.raio = raio;
   }
   
   public double calcularArea()
   {
      return Math.PI * raio * raio;
   }
   
   public double CalcularPerimetro()
   {
      return 2 * Math.PI * raio;
   }
}

public class A7E2
{
   public static void main(String[] args)
   {
      //Escolhendo a operação
      String sOperacao = JOptionPane.showInputDialog(
      "Digite o valor do tipo de área que deseja calcular: /n"
      + "Digite 1 para perimêtro de retângulo/nDigite 2 para áreas de círculos");
      double operacao = Double.parseDouble(sOperacao);
      
      if (operacao == 1)
      {
         //Inserindo dados para calcular o perímetro do retângulo
         String sAltura = JOptionPane.showInputDialog("Digite a altura.");
         String sLargura = JOptionPane.showInputDialog("Digite a largura.");
         
         Retangulo altura = Double.parseDouble(sAltura);
         Retangulo largura = Double.parseDouble(sLargura);
      }
      
      else if (operacao == 2)
      {
         //Inserindo o raio para calcular área do círculo
         String sRaio = JOptionPane.showInputDialog("Digite o raio.");
         
         Circulo raio = Double.parseDouble(sRaio);
      }
      
      else
      {
        JOptionPane.showMessageDialog(null, "Operação inválida.");
      }
   }
}