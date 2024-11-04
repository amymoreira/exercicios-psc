/*Exercício 1: No material da “Aula 07 – Relacionamento entre Classes”, no tópico
“Relacionamento entre classes do tipo É-UM”, na página 7, implemente a classe para
testes das classes listadas nessa página.*/

class Animal
{
   public void mover ()
   {
      System.out.println("O animal está se movendo.");
   }
}

class Cachorro extends Animal
{
   public void latir ()
   {
      System.out.println("Au au!");
   }
}

public class A7E1
{
   public static void main(String[] args)
   {
      Cachorro cachorro = new Cachorro();
      cachorro.mover();
      cachorro.latir();
   }
}