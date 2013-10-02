package br.com.ofmaria.model;

public class Vendas {

    private int codigo;
    private int codProdutos[] = new int[50];

    public Vendas(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int[] getCodProdutos() {
        return codProdutos;
    }

    public void setCodProdutos(int[] codProdutos) {
        this.codProdutos = codProdutos;
    }

    @Override
    public String toString() {
        return "Vendas{" + "codigo=" + codigo + ", codProdutos=" + codProdutos + '}';
    }
}
