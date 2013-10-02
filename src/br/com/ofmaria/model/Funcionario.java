/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofmaria.model;

public class Funcionario extends PessoaFisica {

    private String funcao; //mecânico, vendedor, motoboy, administrativo, escravo...
    private double salario;

    public Funcionario(String funcao, double salario, int codigo, String nome, String endereco) {
        super(codigo, nome, endereco);
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "funcao=" + funcao + ", salario=" + salario + '}';
    }
}
