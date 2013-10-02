package br.com.ofmaria.model;

public class ClientePJ extends PessoaJuridica {

    private int veiculos[] = new int[50]; //veículos que pertencem á empresa cliente
    private double debitos;

    public ClientePJ(double debitos, int codigo, String nome, String endereco, String telefone, String cnpj, String email, String website) {
        super(codigo, nome, endereco, telefone, cnpj, email, website);
        this.debitos = debitos;
    }

    public int[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(int[] veiculos) {
        this.veiculos = veiculos;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }

    @Override
    public String toString() {
        return "ClientePJ{" + "veiculos=" + veiculos + ", debitos=" + debitos + '}';
    }
}
