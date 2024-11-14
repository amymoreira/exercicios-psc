package Exercicio3;
public class Horista extends Empregado{
private double salario;

public Horista(String nome, double salario) {
super (nome);
this.salario = salario;
}

public double salario() {
return this.salario;
}
}