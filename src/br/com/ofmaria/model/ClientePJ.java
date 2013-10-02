package br.com.ofmaria.model;

public class ClientePJ extends PessoaJuridica {

    private String veiculos; //veículos que pertencem á empresa cliente
    private double debitos;

    @Override
    public String toString() {
        return "ClientePJ{" + "veiculos=" + veiculos + ", debitos=" + debitos + '}';
    }

    public String getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(String veiculos) {
        this.veiculos = veiculos;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }

    public ClientePJ(String veiculos, double debitos, int codigo, String nome, String endereco, String telefone, String cnpj, String email, String website) {
        super(codigo, nome, endereco, telefone, cnpj, email, website);
        this.veiculos = veiculos;
        this.debitos = debitos;
    }
}
