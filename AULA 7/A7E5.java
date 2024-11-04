/*Exercício 5: No material da “Aula 07 – Relacionamento entre Classes”, no tópico
“Baixo Acoplamento”, na página 29, implemente a classe para testes das classes
listadas nessa página.*/

import java.util.ArrayList;
interface ItemCarrinho
{ 
   double getPreco();
   String getDescricao();
}

class CarrinhoDeCompras
{
   private ArrayList<ItemCarrinho> itens = new ArrayList<>();

   public void adicionaItem(ItemCarrinho item)
   {
      itens.add(item);
   }

   public void removeItem(ItemCarrinho item)
   {
      itens.remove(item);
   }

   public double calculaTotal()
   {
      double total = 0;
      for (ItemCarrinho item : itens)
      { 
         total += item.getPreco();
      }
   return total;
   }

   public void exibeItens()
   { 
      for (ItemCarrinho item : itens)
      { 
      System.out.println(item.getDescricao());
      }
   }
}

public class A7E5
{
   public static void main(String[] args) 
   {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        //Lista de itens a serem adicionados
        ItemCarrinho[] produtos = 
        {
            new ItemCarrinho() 
            { 
               public double getPreco() ;
               public String getDescricao();
            }
        };

        //Adicionando os itens ao carrinho
        for (ItemCarrinho produto : produtos) 
        {
            carrinho.adicionaItem(produto);
        }

        //Exibindo itens no carrinho
        System.out.println("Itens no carrinho:");
        carrinho.exibeItens();
    }
}