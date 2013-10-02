package br.com.ofmaria.model;

public class Produto { //um produto pode ser aplicado em vários veiculos

    private int codigo;
    private String nome;
    private double valorCusto;
    private double valorFinal;
    private String aplicavelEm; //veiculo
    private int qtdDisponivel;

    public Produto(int codigo, String nome, double valorCusto, double valorFinal, String aplicavelEm, int qtdDisponivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorCusto = valorCusto;
        this.valorFinal = valorFinal;
        this.aplicavelEm = aplicavelEm; //veículo a qual se aplica o produto
        this.qtdDisponivel = qtdDisponivel;
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

    public double getValorCusto() {
        return valorCusto;
    }

    public void setValorCusto(double valorCusto) {
        this.valorCusto = valorCusto;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getAplicavelEm() {
        return aplicavelEm;
    }

    public void setAplicavelEm(String aplicavelEm) {
        this.aplicavelEm = aplicavelEm;
    }

    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", valorCusto=" + valorCusto + ", valorFinal=" + valorFinal + ", aplicavelEm=" + aplicavelEm + ", qtdDisponivel=" + qtdDisponivel + '}';
    }
}
