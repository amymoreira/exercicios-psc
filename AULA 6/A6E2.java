/*A superclasse PessoaFisica, que tem como atributos nome (String), sobrenome
(String) e cpf (String). Escrever 2 métodos construtores, um deles sem parâmetro, que
deve iniciar os atributos com valores padrões definidos pelo programador, e o outro,
que inicia os atributos por meio de parâmetros. Escrever também métodos de acesso
e métodos modificadores para os atributos desta classe. A seguir, escrever o método
dados() que retorna, em uma String, os valores armazenados nos tributos.*/

class PessoaFisica 
{
    private String nome;
    private String sobrenome;
    private String cpf;

    //Construtor definido
    public PessoaFisica() 
    {
        this.nome = "Amy";
        this.sobrenome = "Moreira";
        this.cpf = "xxx.xxx.xxx-xx";
    }

    //Construtor com parâmetros
    public PessoaFisica(String nome, String sobrenome, String cpf) 
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
    }

    //Métodos de acesso
    public String getNome() 
    {
        return nome;
    }

    public String getSobrenome() 
    {
        return sobrenome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    //Métodos modificadores
    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) 
    {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    //Retorna os dados
    public String dados() 
    {
        return "Nome: " + nome + " " + sobrenome + ", CPF: " + cpf;
    }
}

/*A classe Desempregado como extensão (especialização) da superclasse
PessoaFisica. A classe Desempregado deve ter o atributo seguroDesemprego (double),
que armazenará o valor (em reais) do seguro-desemprego recebido. Escrever
também, nesta classe, 2 métodos construtores, um deles sem parâmetro, que deve
iniciar o atributo próprio da classe com o valor 0.0, e o outro, que inicia os atributos
próprios e herdados por meio de parâmetros.*/

class Desempregado extends PessoaFisica 
{
    private double seguroDesemprego;

    //Construtor sem parâmetros
    public Desempregado() 
    {
        super();
        this.seguroDesemprego = 0.0;
    }

    //Construtor com parâmetros
    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego) 
    {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }
    
/*Escrever também métodos de acesso e métodos modificadores para os atributos
próprios desta classe. A seguir, escrever o método dados() que retorna, em uma
String, os valores armazenados nos atributos próprios e herdados, criado a partir da
modificação do método dados() herdado da classe PessoaFisica (uso da sobrecarga).*/

    //Método de acesso
    public double getSeguroDesemprego() 
    {
        return seguroDesemprego;
    }

    //Método modificador
    public void setSeguroDesemprego(double seguroDesemprego) 
    {
        this.seguroDesemprego = seguroDesemprego;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Seguro-Desemprego: R$ " + seguroDesemprego;
    }
}

/*Fazer as modificações necessárias no código-fonte da classe Empregado, de modo
que ela passe a ser uma extensão da classe PessoaFisica, e as mudanças necessárias
nas classes Mensalista, Horista, Tarefeiro e Comissionado/Vendedor, por causa das alterações feitas
nos itens anteriores e feitas na classe Empregado.*/

class Empregado extends PessoaFisica 
{
    private double salario;

    //Construtor sem parâmetros
    public Empregado() 
    {
        super();
        this.salario = 0.0;
    }

    //Construtor com parâmetros
    public Empregado(String nome, String sobrenome, String cpf, double salario) 
    {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    //Método de acesso
    public double getSalario() 
    {
        return salario;
    }

    // Método modificador
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Salário: R$ " + salario;
    }
}

//Classe Mensalista

class Mensalista extends Empregado 
{
    private double salarioMensal;

    //Construtor sem parâmetros
    public Mensalista() 
    {
        super();
        this.salarioMensal = 0.0;
    }

    //Construtor com parâmetros
    public Mensalista(String nome, String sobrenome, String cpf, double salario, double salarioMensal) 
    {
        super(nome, sobrenome, cpf, salario);
        this.salarioMensal = salarioMensal;
    }

    //Método de acesso
    public double getSalarioMensal() 
    {
        return salarioMensal;
    }

    //Método modificador
    public void setSalarioMensal(double salarioMensal) 
    {
        this.salarioMensal = salarioMensal;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Salário Mensal: R$ " + salarioMensal;
    }
}

//Clase Horista

class Horista extends Empregado 
{
    private double salarioHora;

    //Construtor sem parâmetros
    public Horista() 
    {
        super();
        this.salarioHora = 0.0;
    }

    //Construtor com parâmetros
    public Horista(String nome, String sobrenome, String cpf, double salario, double salarioHora) 
    {
        super(nome, sobrenome, cpf, salario);
        this.salarioHora = salarioHora;
    }

    //Método de acesso
    public double getSalarioHora() 
    {
        return salarioHora;
    }

    //Método modificador
    public void setSalarioHora(double salarioHora) 
    {
        this.salarioHora = salarioHora;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Salário por hora: R$ " + salarioHora;
    }
}

//Clase Tarefeiro

class Tarefeiro extends Empregado 
{
    private double salarioTarefa;

    //Construtor sem parâmetros
    public Tarefeiro() 
    {
        super();
        this.salarioTarefa = 0.0;
    }

    //Construtor com parâmetros
    public Tarefeiro(String nome, String sobrenome, String cpf, double salario, double salarioTarefa) 
    {
        super(nome, sobrenome, cpf, salario);
        this.salarioTarefa = salarioTarefa;
    }

    //Método de acesso
    public double getSalarioTarefa() 
    {
        return salarioTarefa;
    }

    //Método modificador
    public void setSalarioTarefa(double salarioTarefa) 
    {
        this.salarioTarefa = salarioTarefa;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Salário por tarefa: R$ " + salarioTarefa;
    }
}

//Classe Comissionado/Vendedor

class Comissionado extends Empregado 
{
    private double salarioComissao;

    //Construtor sem parâmetros
    public Comissionado() 
    {
        super();
        this.salarioComissao = 0.0;
    }

    //Construtor com parâmetros
    public Comissionado(String nome, String sobrenome, String cpf, double salario, double salarioComissao) 
    {
        super(nome, sobrenome, cpf, salario);
        this.salarioComissao = salarioComissao;
    }

    //Método de acesso
    public double getSalarioComissao() 
    {
        return salarioComissao;
    }

    //Método modificador
    public void setSalarioComissao(double salarioComissao) 
    {
        this.salarioComissao = salarioComissao;
    }

    //Retorno de dados
    public String dados() 
    {
        return super.dados() + ", Salário por comissão: R$ " + salarioComissao;
    }
}

public class A6E2 
{
    public static void main(String[] args) 
    {
        //Criando uma instância de PessoaFisica
        PessoaFisica pessoa = new PessoaFisica("João", "Silva", "123.456.789-00");
        System.out.println(pessoa.dados());

        //Criando uma instância de Desempregado
        Desempregado desempregado = new Desempregado("Maria", "Souza", "987.654.321-00", 1200.00);
        System.out.println(desempregado.dados());

        //Criando uma instância de Empregado
        Empregado empregado = new Empregado("Carlos", "Pereira", "321.654.987-00", 3500.00);
        System.out.println(empregado.dados());

        //Criando uma instância de Mensalista
        Mensalista mensalista = new Mensalista("Ana", "Costa", "654.987.321-00", 3500.00, 4000.00);
        System.out.println(mensalista.dados());

        //Criando uma instância de Horista
        Horista horista = new Horista("Paulo", "Gomes", "789.123.456-00", 2000.00, 40, 50.00);
        System.out.println(horista.dados());

        //Criando uma instância de Tarefeiro
        Tarefeiro tarefeiro = new Tarefeiro("Carla", "Mendes", "321.123.456-00", 3000.00, 5, 150.00);
        System.out.println(tarefeiro.dados());

        //Criando uma instância de Comissionado
        Comissionado comissionado = new Comissionado("Roberto", "Oliveira", "654.321.789-00", 2500.00, 5000.00, 0.10);
        System.out.println(comissionado.dados());
    }
}
