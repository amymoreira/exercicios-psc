/*Exercício 3: No material da “Aula 07 – Relacionamento entre Classes”, no tópico
“Interfaces”, na página 18, implemente a classe para testes das classes listadas nessa
página.*/

interface Animal
{
   public void fazerSom();
   public void mover();
}

class Cachorro implements Animal
{
   public void fazerSom()
   {
      System.out.println("Au au!");
   }
   
   public void mover()
   {
      System.out.println("O cachorro está correndo.");
   }
}

public class A7E3 
{
    public static void main(String[] args) 
    {
        Cachorro cachorro = new Cachorro();
        
        cachorro.fazerSom();
        cachorro.mover();
    }
}
