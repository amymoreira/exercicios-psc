package Exercicio4;

class Desempregado extends PessoaFisica
{
    private double seguroDesemprego;


    public Desempregado()
    {
        super();
        this.seguroDesemprego = 0.0;
    }


    public Desempregado(String nome, String sobrenome, String cpf, double seguroDesemprego)
    {
        super(nome, sobrenome, cpf);
        this.seguroDesemprego = seguroDesemprego;
    }


    public double getSeguroDesemprego()
    {
        return seguroDesemprego;
    }


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