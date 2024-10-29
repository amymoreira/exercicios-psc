/*A classe CondicionadorDeAr tem um atributo termostato do tipo Termostato e um
atributo boolean chamado ligado. O construtor de CondicionadorDeAr não recebe
nenhum parâmetro, mas instancia um termostato e coloca ligado em false. Crie um
método de acesso para ligado e outro para termostato. Não precisa fazer os métodos
modificadores. Crie um método ligar, que muda ligado para true, e um desligar, que
muda ligado para false. Crie um método aumentarTemperatura, que aumenta a
temperatura do termostato em um grau cada vez que é chamado até o limite de 28
graus. Crie um método reduzirTemperatura que reduz a temperatura em um grau
cada vez que é chamado até o limite de 15 graus. Crie um método
imprimirTemperatura que imprime a temperatura atual. Não se esqueça de verificar
se o condicionador está ligado antes de aumentar ou diminuir a temperatura ou
imprimi-la.*/

public class CondicionadorDeAr 
{
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() 
    {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    // Método de acesso para ligado
    public boolean isLigado() 
    {
        return ligado;
    }

    // Método de acesso para termostato
    public Termostato getTermostato() 
    {
        return termostato;
    }

    // Método ligar
    public void ligar() 
    {
        this.ligado = true;
    }

    //Método desligar
    public void desligar() 
    {
        this.ligado = false;
    }

    //Método aumentarTemperatura
    public void aumentarTemperatura() 
    {
        if (ligado) 
        {
            int temperaturaAtual = termostato.getTemperatura();
            if (temperaturaAtual < 28) 
            {
                termostato.setTemperatura(temperaturaAtual + 1);
            } 
            
            else 
            {
                System.out.println("Temperatura máxima alcançada (28 graus).");
            }
        } 
        
        else 
        {
            System.out.println("Condicionador desligado.");
        }
    }

    //Método reduzirTemperatura
    public void reduzirTemperatura() 
    {
        if (ligado) 
        {
            int temperaturaAtual = termostato.getTemperatura();
            if (temperaturaAtual > 15) 
            {
                termostato.setTemperatura(temperaturaAtual - 1);
            } 
            
            else 
            {
                System.out.println("Temperatura mínima alcançada (15 graus).");
            }
        } 
        
        else 
        {
            System.out.println("Condicionador desligado.");
        }
    }

    // Método imprimirTemperatura
    public void imprimirTemperatura() 
    {
        if (ligado) 
        {
            System.out.println("Temperatura atual: " + termostato.getTemperatura() + " graus.");
        } 
        
        else 
        {
            System.out.println("Condicionador desligado.");
        }
    }
}

/*A classe Termostato tem um atributo temperatura. Seu construtor não recebe
parâmetros, mas instancia a temperatura em 20. Crie um método de acesso o outro
modificador. Estes métodos devem respeitar os limites estabelecidos no item
anterior.*/

public class Termostato 
{
    private int temperatura;

    public Termostato() 
    {
        this.temperatura = 20;
    }

    //Método de acesso
    public int getTemperatura() 
    {
        return temperatura;
    }

    //Método modificador
    public void setTemperatura(int temperatura) 
    {
        if (temperatura >= 15 && temperatura <= 28) 
        {
            this.temperatura = temperatura;
        } 
        
        else 
        {
            System.out.println("Temperatura fora do limite permitido (15-28 graus).");
        }
    }
}

/*Crie a classe Usuario, com o método main. Neste método você deve instanciar um
CondicionadorDeAr, aumentar a temperatura para 30 graus (receber mensagem de
erro), reduzir a temperatura para 10 gruas (receber mensagem de erro). Aumentar a
temperatura para 25 graus e imprimir a temperatura.*/

public class Usuario 
{
    public static void main(String[] args) 
    {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();
        condicionador.ligar();

        for (int i = 0; i < 10; i++) 
        {
            condicionador.aumentarTemperatura();
        }

        for (int i = 0; i < 15; i++) 
        {
            condicionador.reduzirTemperatura();
        }

        for (int i = 0; i < 10; i++) 
        {
            condicionador.aumentarTemperatura();
        }

        condicionador.imprimirTemperatura();
    }
}
