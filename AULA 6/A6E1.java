/*Escrever, em linguagem Java, a classe Pagamento, cujos atributos únicos são
nomeDoPagador (String), cpf (String) e valorASerPago (double). Escrever, nesta classe,
métodos construtores, métodos de acesso e métodos modificadores para os
atributos.*/

class Pagamento 
{
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    //Construtores
    public Pagamento(String nomeDoPagador, String cpf, double valorASerPago) 
    {
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }

    //Métodos de acesso
    public String getNomeDoPagador() 
    {
        return nomeDoPagador;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public double getValorASerPago() 
    {
        return valorASerPago;
    }

    //Métodos modificadores
    public void setNomeDoPagador(String nomeDoPagador) 
    {
        this.nomeDoPagador = nomeDoPagador;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public void setValorASerPago(double valorASerPago) 
    {
        this.valorASerPago = valorASerPago;
    }
}

/*Escrever a classe CartaoDeCredito, como extensão da classe Pagamento, com o
atributo próprio numeroDoCartao (String). Escrever, nesta classe, métodos
construtores, métodos de acesso e métodos modificadores para o atributo próprio.*/

class CartaoDeCredito extends Pagamento 
{
    private String numeroDoCartao;

    //Construtor
    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao) 
    {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    //Método de acesso
    public String getNumeroDoCartao() 
    {
        return numeroDoCartao;
    }

    //Método modificador
    public void setNumeroDoCartao(String numeroDoCartao) 
    {
        this.numeroDoCartao = numeroDoCartao;
    }
}

/*Escrever a classe Cheque, como extensão da classe Pagamento, com o atributo
próprio numeroDoCheque (String). Escrever, nesta classe, métodos construtores,
métodos de acesso e métodos modificadores para o atributo próprio.*/

class Cheque extends Pagamento 
{
    private String numeroDoCheque;

    //Construtor
    public Cheque(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCheque) 
    {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCheque = numeroDoCheque;
    }

    //Método de acesso
    public String getNumeroDoCheque() 
    {
        return numeroDoCheque;
    }

    //Método modificador
    public void setNumeroDoCheque(String numeroDoCheque) 
    {
        this.numeroDoCheque = numeroDoCheque;
    }
}

/*Escrever a classe Boleto, como extensão da classe Pagamento, com os atributos
próprio numeroDoBoleto (String), dia (int), mes (int) e ano (int) de vencimento.
Escrever, nesta classe, métodos construtores, métodos de acesso e métodos
modificadores para o atributo próprio.*/

class Boleto extends Pagamento 
{
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    //Construtor
    public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano) 
    {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoBoleto = numeroDoBoleto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    //Métodos de acesso
    public String getNumeroDoBoleto() 
    {
        return numeroDoBoleto;
    }

    public int getDia() 
    {
        return dia;
    }

    public int getMes() 
    {
        return mes;
    }

    public int getAno() 
    {
        return ano;
    }

    //Métodos modificadores
    public void setNumeroDoBoleto(String numeroDoBoleto) 
    {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public void setDia(int dia) 
    {
        this.dia = dia;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public void setAno(int ano) 
    {
        this.ano = ano;
    }
}

//Implementando as classes

public class A6E1 
{
    public static void main(String[] args) 
    {
        // Criando um objeto da classe Pagamento
        Pagamento pagamento = new Pagamento("João Silva", "123.456.789-00", 1500.00);
        System.out.println("Pagamento:");
        System.out.println("Nome do Pagador: " + pagamento.getNomeDoPagador());
        System.out.println("CPF: " + pagamento.getCpf());
        System.out.println("Valor a Ser Pago: " + pagamento.getValorASerPago());
        System.out.println();

        // Criando um objeto da classe CartaoDeCredito
        CartaoDeCredito cartao = new CartaoDeCredito("Maria Souza", "987.654.321-00", 2500.00, "1234-5678-9012-3456");
        System.out.println("Cartão de Crédito:");
        System.out.println("Nome do Pagador: " + cartao.getNomeDoPagador());
        System.out.println("CPF: " + cartao.getCpf());
        System.out.println("Valor a Ser Pago: " + cartao.getValorASerPago());
        System.out.println("Número do Cartão: " + cartao.getNumeroDoCartao());
        System.out.println();

        // Criando um objeto da classe Cheque
        Cheque cheque = new Cheque("Carlos Pereira", "321.654.987-00", 3000.00, "CH123456");
        System.out.println("Cheque:");
        System.out.println("Nome do Pagador: " + cheque.getNomeDoPagador());
        System.out.println("CPF: " + cheque.getCpf());
        System.out.println("Valor a Ser Pago: " + cheque.getValorASerPago());
        System.out.println("Número do Cheque: " + cheque.getNumeroDoCheque());
        System.out.println();

        // Criando um objeto da classe Boleto
        Boleto boleto = new Boleto("Ana Costa", "654.987.321-00", 4000.00, "BO123456789", 15, 10, 2024);
        System.out.println("Boleto:");
        System.out.println("Nome do Pagador: " + boleto.getNomeDoPagador());
        System.out.println("CPF: " + boleto.getCpf());
        System.out.println("Valor a Ser Pago: " + boleto.getValorASerPago());
        System.out.println("Número do Boleto: " + boleto.getNumeroDoBoleto());
        System.out.println("Data de Vencimento: " + boleto.getDia() + "/" + boleto.getMes() + "/" + boleto.getAno());
    }
}
