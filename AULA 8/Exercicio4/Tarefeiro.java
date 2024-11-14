package Exercicio4;
public class Tarefeiro extends Empregado{
private double salario;

public Tarefeiro(String nome, double salario) {
super (nome);
this.salario = salario;
}

public double salario() {
return this.salario;
}
}