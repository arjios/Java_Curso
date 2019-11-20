
package entidades;

import java.util.Scanner;

public class Funcionario {
    public String nome;
    public double salario;
    public double imposto;

    public void setSalario(double s) {
        this.salario = s;
    }
    public double getSalario() {
        return this.salario - this.imposto;
    }
    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
    public void setImposto(double imp) {
        this.imposto = imp;
    }
    public double getImposto() {
        return this.imposto;
    }
}