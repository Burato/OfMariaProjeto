package br.com.ofmaria.model;

public class ClientePF extends PessoaFisica {

    private String veiculo;
    private double debitos;

    @Override
    public String toString() {
        return "ClientePF{" + "veiculo=" + veiculo + ", debitos=" + debitos + '}';
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public double getDebitos() {
        return debitos;
    }

    public void setDebitos(double debitos) {
        this.debitos = debitos;
    }

    public ClientePF(String veiculo, double debitos, int codigo, String nome, String endereco) {
        super(codigo, nome, endereco);
        this.veiculo = veiculo;
        this.debitos = debitos;
    }
}
