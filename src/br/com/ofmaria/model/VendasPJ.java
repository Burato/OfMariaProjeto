package br.com.ofmaria.model;

public class VendasPJ {

    private int codigo;
    private Produto produtos;
    private Servico servicos;
    private Veiculo veiculo;
    private ClientePJ cliente;
    private Funcionario funcionario;
    private double total;

    public VendasPJ(int codigo, Produto produtos, Servico servicos, Veiculo veiculo, ClientePJ cliente, Funcionario funcionario, double total) {
        this.codigo = codigo;
        this.produtos = produtos;
        this.servicos = servicos;
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.total = total;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto produtos) {
        this.produtos = produtos;
    }

    public Servico getServicos() {
        return servicos;
    }

    public void setServicos(Servico servicos) {
        this.servicos = servicos;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public ClientePJ getCliente() {
        return cliente;
    }

    public void setCliente(ClientePJ cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "VendasPJ{" + "codigo=" + codigo + ", produtos=" + produtos + ", servicos=" + servicos + ", veiculo=" + veiculo + ", cliente=" + cliente + ", funcionario=" + funcionario + ", total=" + total + '}';
    }
}
