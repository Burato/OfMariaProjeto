/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ofmaria.model;

public class Funcionario extends PessoaFisica {

    private String login;
    private String senha;
    private String funcao; //mecânico, vendedor, motoboy, administrativo, escravo...

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Funcionario(String login, String senha, int codigo, String nome, String endereco) {
        super(codigo, nome, endereco);
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "login=" + login + ", senha=" + senha + '}';
    }
}
