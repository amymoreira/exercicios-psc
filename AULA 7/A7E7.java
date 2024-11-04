/*No material da “Aula 07 – Relacionamento entre Classes”, no tópico
“Deadly Diamond of Death”, na página 39, implemente a classe para testes das classes
listadas nessa página.*/

class Animal
{ 
   public void mover()
   { 
      System.out.println("O animal esta se movendo.");
   }
}

class Cavalo extends Animal
{ 
   public void mover()
   { 
      System.out.println("O cavalo esta galopando.");
   }
}

class Pegasus extends Cavalo
{ 
   public void mover()
   { 
      super.mover(); // chama o metodo mover() da classe pai Cavalo
      System.out.println("O Pegasus esta voando.");
   }
}

public class A7E7
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal();
        Cavalo cavalo = new Cavalo();
        Pegasus pegasus = new Pegasus();

        animal.mover();
        cavalo.mover();
        pegasus.mover();
    }
}