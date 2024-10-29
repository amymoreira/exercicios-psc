/* A classe Cliente possui os atributos nome e cpf, ambos do tipo String, e um atributo
conta do tipo ContaCorrente. Crie um construtor que recebe os atributos como
parâmetros e os métodos de acesso e os modificadores.*/

public class Cliente 
{
    //Atributos
    private String nome;
    private String cpf;
    private ContaCorrente conta;

    public Cliente(String nome, String cpf, ContaCorrente conta) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    //Métodos de acesso e modificadores
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public ContaCorrente getConta() 
    {
        return conta;
    }

    public void setConta(ContaCorrente conta) 
    {
        this.conta = conta;
    }
}

/*A classe ContaCorrente tem os atributos numero e digito, ambos inteiros, o atributo
agencia do tipo Agencia e o atributo saldo do tipo double. Crie um construtor que
recebe os atributos como parâmetros e os métodos de acesso e os modificadores. Crie
também um método depositar que receba um parâmetro double com o valor do
depósito e aumente o saldo da conta. Crie também um método sacar que receba um
parâmetro double com o valor do saque e diminua o saldo da conta. A conta não pode
ficar negativa. Neste caso, deve ser dada uma mensagem que o saque não foi efetuado
e o retorno deve ser zero. Caso contrário o retorno deve ser o valor sacado. Crie
também um método consultarSaldo que não recebe parâmetros e retorne o saldo.
Crie, finalmente, um método imprimirSaldo que imprima o numero da conta corrente
com dígito, o número da agência com dígito e o saldo da conta corrente.*/

public class ContaCorrente 
{
    //Atributos
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) 
    {
        this.numero = numero;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldo;
        validarNumeroConta();
    }

    //Métodos de acesso e modificadores
    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
        validarNumeroConta();
    }

    public int getDigito() 
    {
        return digito;
    }

    public void setDigito(int digito) 
    {
        this.digito = digito;
    }

    public Agencia getAgencia() 
    {
        return agencia;
    }

    public void setAgencia(Agencia agencia) 
    {
        this.agencia = agencia;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void setSaldo(double saldo) 
    {
        this.saldo = saldo;
    }

    // Método depositar
    public void depositar(double valor) 
    {
        this.saldo += valor;
    }

    //Método sacar
    public double sacar(double valor) 
    {
        if (this.saldo >= valor) 
        {
            this.saldo -= valor;
            return valor;
        } 
        
        else 
        {
            System.out.println("Saque não efetuado. Saldo insuficiente.");
            return 0;
        }
    }

    //Método consultarSaldo
    public double consultarSaldo() 
    {
        return this.saldo;
    }

    //Método imprimirSaldo
    public void imprimirSaldo() 
    {
        System.out.println("Conta Corrente: " + this.numero + "-" + this.digito);
        System.out.println("Agência: " + this.agencia.getNumero() + "-" + this.agencia.getDigito());
        System.out.println("Saldo: R$" + this.saldo);
    }

    //Validar número da conta
    private void validarNumeroConta() 
    {
        if (String.valueOf(this.numero).length() > 4 || this.numero <= 0) 
        {
            throw new IllegalArgumentException("Número da conta inválido.");
        }
        
        int digitoCalculado = calcularDigitoConta();
        
        if (digitoCalculado != this.digito) 
        {
            throw new IllegalArgumentException("Dígito da conta inválido.");
        }
    }

/*Ainda na classe ContaCorrente, o número da conta deve ter no máximo 4 dígitos e
ser positivo. O digito da conta deve ser validado a partir do seguinte algoritmo de
módulo 11: multiplique o primeiro dígito da conta por 4, o segundo por 6, o terceiro
por 8 e o quarto por 2; some tudo e calcule o resto da divisão (módulo) da soma por
11. Este é o valor do dígito. Obs: se o resultado for 10 o dígito é 0.*/

    //Calcular dígito da conta
    private int calcularDigitoConta() 
    {
        int[] multiplicadores = {4, 6, 8, 2};
        int soma = 0;
        String numeroStr = String.valueOf(this.numero);
        for (int i = 0; i < 4; i++) 
        {
            soma += Integer.parseInt(numeroStr.substring(i, i + 1)) * multiplicadores[i];
        }
        
        int resto = soma % 11;
        return resto == 10 ? 0 : resto;
    }
}

/*A classe Agencia tem os atributos nome do tipo String, numero e digito do tipo int.
Crie um construtor que recebe os atributos como parâmetros e os métodos de acesso
e os modificadores. O número e o digito da Agencia devem seguir os mesmos padrões
do número e do dígito da conta corrente.*/

public class Agencia 
{
    //Atributos
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String nome, int numero, int digito) 
    {
        this.nome = nome;
        this.numero = numero;
        this.digito = digito;
        validarNumeroAgencia();
    }

    //Métodos de acesso e modificadores
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
        validarNumeroAgencia();
    }

    public int getDigito() 
    {
        return digito;
    }

    public void setDigito(int digito) 
    {
        this.digito = digito;
    }
}

/*Para testar faça uma classe CaixaEletronico, que irá conter o método main. No main
instancie um cliente com os seguintes dados: [...] */

public class CaixaEletronico 
{
    public static void main(String[] args) 
    {
        //Criando dados
        Agencia agencia = new Agencia("Agência Central", 7890, 5);
        ContaCorrente conta = new ContaCorrente(1234, 4, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        //Fazendo saque
        double valorSaque = 140.0;
        double valorSacado = cliente.getConta().sacar(valorSaque);
        System.out.println("Saque de R$" + valorSaque + ": " + (valorSacado == 0 ? "não efetuado" : "efetuado"));
        System.out.println("Saldo atual: R$" + cliente.getConta().consultarSaldo());

        //Novo saque
        valorSaque = 200.0;
        valorSacado = cliente.getConta().sacar(valorSaque);
        System.out.println("Saque de R$" + valorSaque + ": " + (valorSacado == 0 ? "não efetuado" : "efetuado"));
        System.out.println("Saldo atual: R$" + cliente.getConta().consultarSaldo());

        //Depóstio
        cliente.getConta().depositar(25.45);
        System.out.println("Dados do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        cliente.getConta().imprimirSaldo();
    }
}
