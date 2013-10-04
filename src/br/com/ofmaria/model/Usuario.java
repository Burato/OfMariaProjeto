package br.com.ofmaria.model;

import java.util.Date;

public class Usuario {

    private int codigo;
    private String nome;
    private String senha;
    private String cpf;
    private String telefone;
    private Date dataNascimento;
    private String sexo;
    private String login;

    @Override
    public String toString() {
        return "Usuario{" + "codigo=" + codigo + ", nome=" + nome + ", senha=" + senha + ", cpf=" + cpf + ", telefone=" + telefone + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", login=" + login + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Usuario(int codigo, String nome, String senha, String cpf, String telefone, Date dataNascimento, String sexo, String login) {
        this.codigo = codigo;
        this.nome = nome;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.login = login;
    }
}
